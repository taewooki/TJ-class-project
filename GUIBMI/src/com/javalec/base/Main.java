package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.javalec.function.BmiCalc;
import javax.swing.ImageIcon;

public class Main {

	private JFrame frmBmi;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JLabel lblCm;
	private JLabel lblKg;
	private JButton btnAction;
	private JLabel lblResult;
	private JLabel lblImages;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmBmi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBmi = new JFrame();
		frmBmi.setTitle("BMI계산기");
		frmBmi.setBounds(100, 100, 450, 476);
		frmBmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmi.getContentPane().setLayout(null);
		frmBmi.getContentPane().add(getLblNewLabel());
		frmBmi.getContentPane().add(getLblNewLabel_1());
		frmBmi.getContentPane().add(getTfNum1());
		frmBmi.getContentPane().add(getTfNum2());
		frmBmi.getContentPane().add(getLblCm());
		frmBmi.getContentPane().add(getLblKg());
		frmBmi.getContentPane().add(getBtnAction());
		frmBmi.getContentPane().add(getLblResult());
		frmBmi.getContentPane().add(getLblImages());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("키(신장) :");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel.setBounds(96, 5, 71, 24);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("몸무게 :");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(96, 44, 71, 24);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						// 숫자가 입력 됨
						// Enter키로 다음 입력칸 이동!!
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						tfNum2.requestFocus();
						// 숫자 잘못 입력시 지우기
					}else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						
					}else {
						JOptionPane.showMessageDialog(null,  "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfNum1.setText("");
					}
				}
			});
			tfNum1.setBounds(174, 5, 114, 24);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					// TextField에 숫자외의 문자가 입력되면 지우기
					if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
						// 숫자가 입력 됨
						// Enter키로 결과 처리!!
					}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
						calcAction();
						// 숫자 잘못 입력시 지우기
					}else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						
					}else {
						JOptionPane.showMessageDialog(null,  "숫자만 입력하세요", "경고", JOptionPane.ERROR_MESSAGE);
						tfNum2.setText("");
					}
				}
			});
			tfNum2.setColumns(10);
			tfNum2.setBounds(174, 44, 114, 24);
		}
		return tfNum2;
	}
	private JLabel getLblCm() {
		if (lblCm == null) {
			lblCm = new JLabel("cm");
			lblCm.setHorizontalAlignment(SwingConstants.LEFT);
			lblCm.setFont(new Font("굴림", Font.PLAIN, 13));
			lblCm.setBounds(295, 5, 31, 24);
		}
		return lblCm;
	}
	private JLabel getLblKg() {
		if (lblKg == null) {
			lblKg = new JLabel("Kg");
			lblKg.setHorizontalAlignment(SwingConstants.LEFT);
			lblKg.setFont(new Font("굴림", Font.PLAIN, 13));
			lblKg.setBounds(295, 44, 31, 24);
		}
		return lblKg;
	}
	private JButton getBtnAction() {
		if (btnAction == null) {
			btnAction = new JButton("계산하기");
			btnAction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			btnAction.setFont(new Font("굴림", Font.PLAIN, 13));
			btnAction.setBounds(148, 120, 139, 29);
		}
		return btnAction;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setFont(new Font("굴림", Font.PLAIN, 13));
			lblResult.setBounds(30, 86, 383, 29);
		}
		return lblResult;
	}
	private JLabel getLblImages() {
		if (lblImages == null) {
			lblImages = new JLabel("");
			lblImages.setHorizontalAlignment(SwingConstants.CENTER);
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/고도비만.png")));
			lblImages.setBounds(148, 176, 140, 247);
		}
		return lblImages;
	}
	
	// --- Function ---
	private void calcAction() {
		int check = inputCheck();
		if(check != 0) {
			JOptionPane.showMessageDialog(null, "항목을 입력 하세요.");
		}else {
			calcBmi();
		}
	}
	
	// 밑에 check랑 같다
//	if(tfNum1.getText().equals("") || tfNum2.getText().equals("")) {
//		JOptionPane.showMessageDialog(null, "숫자를 입력 하세요!");
//	}else {
//		
//	}
	// 기능별로 메소드를 나눠주는것이 좋다
	private int inputCheck() {
		int checkResult = 0;
		if(tfNum1.getText().trim().length() == 0) {
			checkResult++;
			tfNum1.requestFocus();
		}
		if(tfNum2.getText().trim().length() == 0) {
			checkResult++;
			tfNum2.requestFocus();
		}
		
		return checkResult;
	}
	
	private void calcBmi() {
		double height = Double.parseDouble(tfNum1.getText());
		double weight = Double.parseDouble(tfNum2.getText());
		
		BmiCalc bmiCalc = new BmiCalc(height, weight);
		double bmi = bmiCalc.calcBmi();
		String result = bmiCalc.showResult(bmi);
		
		lblResult.setText("귀하의 BMI 지수는 " + bmi + "이고 " + result + "입니다.");
		
		if(result == "고도비만") {
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/고도비만.png")));
		}else if(result == "비만") {
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/비만.png")));
		}else if(result == "과체중") {
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/과체중.png")));
		}else if(result == "정상체중") {
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/정상체중.png")));
		}else {
			lblImages.setIcon(new ImageIcon(Main.class.getResource("/com/javalec/images/저체중.png")));
		}
		
	}
	
} // End
