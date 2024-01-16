package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UserInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JTextField tfTelNo;
	private JLabel lblNewLabel_1;
	private JTextField tfAddress;
	private JLabel lblNewLabel_2;
	private JTextField tfEmail;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JTextField tfRelation;
	private JButton btnOK;

	// Database 환경 정의
	private final String url_mysql = "jdbc:mysql://127.0.0.1:3306/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInsert window = new UserInsert();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_3_1());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnOK());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명 :");
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel.setBounds(30, 19, 95, 22);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자가 입력 되면 지운다
					char specialKey = e.getKeyChar();
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyCode() == KeyEvent.VK_SPACE || specialCharacter(specialKey)) {
						JOptionPane.showMessageDialog(null, "글자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfName.setText("");
						// Enter키로 다음 입력칸 이동!!
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						tfTelNo.requestFocus();
					}else {
						
					}
				}
			});
			tfName.setFont(new Font("굴림", Font.PLAIN, 13));
			tfName.setBounds(132, 19, 112, 22);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자가 입력 되게한다
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE || e.getKeyCode() == KeyEvent.VK_MINUS) {
						// Enter키로 다음 입력칸 이동!!
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						tfAddress.requestFocus();
						// 글자 잘못 입력시 지우기
					}else {
						JOptionPane.showMessageDialog(null, "글자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfTelNo.setText("");
					}
				}
			});
			tfTelNo.setFont(new Font("굴림", Font.PLAIN, 13));
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(132, 59, 112, 22);
		}
		return tfTelNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호 :");
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(30, 59, 95, 22);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					char specialKey = e.getKeyChar();
					if(specialCharacter(specialKey)) {
						JOptionPane.showMessageDialog(null, "특수문자는 안됩니다.", "경고", JOptionPane.ERROR_MESSAGE);
						tfAddress.setText("");
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						tfEmail.requestFocus();
					}
				}
			});
			tfAddress.setFont(new Font("굴림", Font.PLAIN, 13));
			tfAddress.setColumns(10);
			tfAddress.setBounds(132, 105, 187, 22);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소 :");
			lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(30, 105, 95, 22);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					char specialKey2 = e.getKeyChar();
					if(specialCharacter2(specialKey2)) {
						JOptionPane.showMessageDialog(null, "특수문자는 안됩니다.", "경고", JOptionPane.ERROR_MESSAGE);
						tfEmail.setText("");
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						tfRelation.requestFocus();
					}
				}
			});
			tfEmail.setFont(new Font("굴림", Font.PLAIN, 13));
			tfEmail.setColumns(10);
			tfEmail.setBounds(132, 147, 187, 22);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편 :");
			lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(30, 147, 95, 22);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("관계 :");
			lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_3_1.setBounds(30, 187, 95, 22);
		}
		return lblNewLabel_3_1;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						insertAction();
					}
				}
			});
			tfRelation.setFont(new Font("굴림", Font.PLAIN, 13));
			tfRelation.setColumns(10);
			tfRelation.setBounds(132, 187, 277, 22);
		}
		return tfRelation;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
				}
			});
			btnOK.setFont(new Font("굴림", Font.PLAIN, 13));
			btnOK.setBounds(132, 224, 163, 36);
		}
		return btnOK;
	}
	
	// --- Functions ---
	private void insertAction() {
		// 입력 안했을시 체크 받기
		int check = inputCheck();
		if(check != 0) {
			JOptionPane.showMessageDialog(null, "항목을 입력 하세요.");
		}
		
		// 특수문자 체크 받기
		int check2 = specialKeyCheck();
		if(check2 != 0) {
			JOptionPane.showMessageDialog(null, "특수문자가 포함 되었습니다. 다시 입력하세요.");
		}
		
		// 메일 형식이 잘못 된거 체크 받기
		int check3 = emailCheck();
		if(check3 != 0) {
			JOptionPane.showMessageDialog(null, "메일 형식이 잘못 되었습니다. 다시 입력하세요.");
        	tfEmail.setText("");
        	tfEmail.requestFocus();
		}else {
			PreparedStatement ps = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
				Statement stmt_mysql = conn_mysql.createStatement(); // 갖고오는것
				
				String query = "insert into userinfo (name, telno, address, email, relation) "; // 뒤에 띄어쓰기 한칸 할것
				String query1 = "values (?,?,?,?,?)";
				
				ps = conn_mysql.prepareStatement(query + query1);
				ps.setString(1, tfName.getText().trim());
				ps.setString(2, tfTelNo.getText().trim());
				ps.setString(3, tfAddress.getText().trim());
				ps.setString(4, tfEmail.getText().trim());
				ps.setString(5, tfRelation.getText().trim());
				
				ps.executeUpdate();
				
				// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
				conn_mysql.close(); // 반드시 적어줄것
				
				JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다.");
				
			}catch(Exception e) {
				// 에러코드가 있으면 보여주게한다
				e.printStackTrace();
			}
		}
	}
	
	
	// 기능별로 메소드를 나눠주는것이 좋다
	// 작성 안했을시 체크하는것
	private int inputCheck() {
		int checkResult = 0;
		if(tfName.getText().trim().length() == 0) {
			checkResult++;
			tfName.requestFocus();
		}
		if(tfTelNo.getText().trim().length() == 0) {
			checkResult++;
			tfTelNo.requestFocus();
		}
		if(tfAddress.getText().trim().length() == 0) {
			checkResult++;
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().trim().length() == 0) {
			checkResult++;
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().trim().length() == 0) {
			checkResult++;
			tfRelation.requestFocus();
		}
		
		return checkResult;
	}
	
	private boolean specialCharacter(char specialKey) {
		// 특수 문자 확인을 위한 조건 추가
		return "!@#$%^&*()-_=+`~/?,.<>{}[];:|\"'\\".indexOf(specialKey) != -1;
	}
	
	private boolean specialCharacter2(char specialKey2) {
		// email에서 특수 문자 확인을 위한 조건 추가
		return "!#$%^&*()-_=+`~/?,<>{}[];:|\"'\\".indexOf(specialKey2) != -1;
	}
	
	private int specialKeyCheck() {
		int checkResult = 0;
		
		// 특수문자 제거
		String tfName1 = tfName.getText().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		String tfTelNo1 = tfTelNo.getText().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		String tfAddress1 = tfAddress.getText().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		String tfEmail1 = tfEmail.getText().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9@.]", "");
		// Relation은 특수문자가 들어가도 상관이 없다?
//		String tfRelation1 = tfRelation.getText().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");
		
		// 값을 받은것이 특수문자 제거한거랑 같으면 통과 아니면 거르기
		if(tfName.getText().equals(tfName1)) {
			checkResult++;
			tfName.requestFocus();
		}
		if(tfTelNo.getText().equals(tfTelNo1)) {
			checkResult++;
			tfTelNo.requestFocus();
		}
		if(tfAddress.getText().equals(tfAddress1)) {
			checkResult++;
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().equals(tfEmail1)) {
			checkResult++;
			tfEmail.requestFocus();
		}
		// 밑에건 필요없다 - 347line 참조
//		if(tfRelation.getText().equals(tfRelation1)) {
//			checkResult++;
//			tfRelation.requestFocus();
//		}
		
		return checkResult;
	}
	
	private int emailCheck() {
		int checkResult = 0;
//		String email = tfEmail.getText();
//		String check1 = email.substring(email.length()-4);
//		if(check1.equals(".com") || check1.equals(".net")) {
////			checkResult = 0;
//		}else {
//			checkResult++;
//		}
//		

		String email = tfEmail.getText();
        // 정규 표현식 패턴
        String emailPattern = "^(?!.*\\.\\.)[a-zA-Z0-9.]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";

        // 정규 표현식 패턴과 매치되는지 확인
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            checkResult = 0;
        } else {
        	checkResult++;
        }
		return checkResult;
	}
	
} // End
