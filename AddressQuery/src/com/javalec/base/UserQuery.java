package com.javalec.base;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class UserQuery {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSequenceNo;
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	private JLabel lblNewLabel_2;
	private JTextField tfTelNo;
	private JLabel lblNewLabel_3;
	private JTextField tfAddress;
	private JLabel lblNewLabel_4;
	private JTextField tfEmail;
	private JLabel lblNewLabel_4_1;
	private JTextField tfRelation;

	// ***************************************************************************
	// ------ Database & Table
	private final DefaultTableModel outer_Table = new DefaultTableModel();  
	private final String url_mysql = "jdbc:mysql://127.0.0.1:3306/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	private JButton btnUpdate;
	private JButton btnDelete;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery window = new UserQuery();
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
	public UserQuery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tableInit(); //***********************8
				searchAction();//**********************
			}
		});
		frame.getContentPane().setBackground(new Color(255, 217, 253));
		frame.setTitle("주소록 검색/수정/삭제");
		frame.setBounds(100, 100, 450, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSequenceNo());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_4_1());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnUpdate());
		frame.getContentPane().add(getBtnDelete());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setFont(new Font("굴림", Font.PLAIN, 13));
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(26, 16, 72, 29);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setFont(new Font("굴림", Font.PLAIN, 13));
			tfSelection.setBounds(105, 16, 183, 29);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnQuery.setFont(new Font("굴림", Font.PLAIN, 13));
			btnQuery.setBounds(295, 16, 108, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(28, 50, 375, 122);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (inner_Table == null) {
			inner_Table = new JTable();
			inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton() == 1) {
						tableClick(); //input***************
					}
				}
			});
			inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			// ************************************************
			inner_Table.setModel(outer_Table); // ************* 잊지 말자
			// ************************************************
		}
		return inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sequance No.");
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel.setBounds(26, 177, 93, 29);
		}
		return lblNewLabel;
	}
	private JTextField getTfSequenceNo() {
		if (tfSequenceNo == null) {
			tfSequenceNo = new JTextField();
			tfSequenceNo.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSequenceNo.setBounds(130, 177, 43, 29);
			tfSequenceNo.setColumns(10);
		}
		return tfSequenceNo;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_1.setBounds(26, 211, 93, 29);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(130, 211, 72, 29);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호");
			lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(26, 245, 93, 29);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(130, 245, 152, 29);
		}
		return tfTelNo;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소");
			lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_3.setBounds(26, 279, 93, 29);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(130, 279, 273, 29);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편");
			lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_4.setBounds(26, 313, 93, 29);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(130, 313, 273, 29);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("관계");
			lblNewLabel_4_1.setFont(new Font("굴림", Font.PLAIN, 13));
			lblNewLabel_4_1.setBounds(26, 347, 93, 29);
		}
		return lblNewLabel_4_1;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(130, 347, 273, 29);
		}
		return tfRelation;
	}
	
	// ---- Functions ------
	// Table의 컬럼을 정의하고 Data내용을 초기화 시킨다.
	private void tableInit() {
		outer_Table.addColumn("순서");
		outer_Table.addColumn("이름");
		outer_Table.addColumn("전화번호");
		outer_Table.addColumn("관계");
		outer_Table.setColumnCount(4);
		
		// 순서 맞추기
		int colNo = 0;
		TableColumn col = inner_Table.getColumnModel().getColumn(colNo);
		int width = 50;
		col.setPreferredWidth(width);
		
		// 이름
		colNo = 1;
		col = inner_Table.getColumnModel().getColumn(colNo);
		width = 100;
		col.setPreferredWidth(width);
		
		// 전화번호
		colNo = 2;
		col = inner_Table.getColumnModel().getColumn(colNo);
		width = 150;
		col.setPreferredWidth(width);
		
		// 관계
		colNo = 3;
		col = inner_Table.getColumnModel().getColumn(colNo);
		width = 200;
		col.setPreferredWidth(width);
		
		// 초기화 시키기
		int i = outer_Table.getRowCount();
		for(int j=0; j<i; j++) {
			outer_Table.removeRow(0); // 데이터를 지우니 0번부터 시작
		}
		
		// 자동정렬
//		inner_Table.setAutoResizeMode(inner_Table.AUTO_RESIZE_OFF);
	}
	
	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); // 갖고오는것
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			while(rs.next()) {
				String[] qTxt = {Integer.toString(rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4)};
				outer_Table.addRow(qTxt);
				
				// 값 확인
//				tfSequenceNo.setText(Integer.toString(rs.getInt(1))); // 배열이 아니니 seqno부터 1번것을 가져온다
//				tfName.setText(rs.getString(2)); // name 2번째
//				tfTelNo.setText(rs.getString(3)); // telno 3번째
//				tfRelation.setText(rs.getString(4)); // relation 4번째
			}
			
			// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
			conn_mysql.close(); // 반드시 적어줄것
			
		}catch(Exception e) {
			// 에러코드가 있으면 보여주게한다
			e.printStackTrace();
		}
	}
	
	private void tableClick() {
		int i = inner_Table.getSelectedRow();
		String seqno = (String)inner_Table.getValueAt(i, 0);
		
		String query1 = "select seqno, name, telno, address, email, relation from userinfo ";
		String query2 = "where seqno = " + Integer.parseInt(seqno);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); // 갖고오는것
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);
			while(rs.next()) {
				tfSequenceNo.setText(Integer.toString(rs.getInt(1)));
				tfName.setText(rs.getString(2));
				tfTelNo.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
			}
			
			// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
			conn_mysql.close(); // 반드시 적어줄것
			
		}catch(Exception e) {
			// 에러코드가 있으면 보여주게한다
			e.printStackTrace();
		}
	}
	
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryName = "";
		
		switch(i) {
		case 0:
			conditionQueryName = "name";
			break;
		case 1:
			conditionQueryName = "address";
			break;
		case 2:
			conditionQueryName = "relation";
			break;
		default:
			break;
		}
		
		tableInit(); // 검색한 기록을 지운다
		clearColumn();
		conditionQueryAction(conditionQueryName); // argument
	}
	
	private void clearColumn() {
		tfSequenceNo.setText("");
		tfName.setText("");
		tfTelNo.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	private void conditionQueryAction(String conditionQueryName) { // parameter - 타입을 정해준다
		String query1 = "select seqno, name, telno, relation from userinfo where " + conditionQueryName;
		String query2 = " like '%" + tfSelection.getText() + "%'";
//		System.out.println(query1 + query2);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement(); // 갖고오는것
			
			ResultSet rs = stmt_mysql.executeQuery(query1 + query2);
			while(rs.next()) {
				String[] qTxt = {Integer.toString(rs.getInt(1)),rs.getString(2),rs.getString(3),rs.getString(4)};
				outer_Table.addRow(qTxt);
				
			}
			
			// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
			conn_mysql.close(); // 반드시 적어줄것
			
		}catch(Exception e) {
			// 에러코드가 있으면 보여주게한다
			e.printStackTrace();
		}
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update(); //input**************
				}
			});
			btnUpdate.setFont(new Font("굴림", Font.PLAIN, 13));
			btnUpdate.setBounds(130, 381, 114, 27);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete(); //delete**************
				}
			});
			btnDelete.setForeground(new Color(255, 0, 0));
			btnDelete.setFont(new Font("굴림", Font.PLAIN, 13));
			btnDelete.setBounds(266, 381, 114, 27);
		}
		return btnDelete;
	}
	
	private void update() {
		updateAction();
		tableInit();
		clearColumn();
		searchAction();
	}
	
	private void updateAction() {
		PreparedStatement ps = null;	// 보안상 사용. 불러올때는 그냥 Statement를 사용하면 됨.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 가져다쓸 클라스패키지 정의.
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);	// DB와 연결
//			Statement stmt_mysql = conn_mysql.createStatement();	// DB에서 데이터를 받아올때 사용.
			 
			String query1 = "update userinfo set name=?,telno=?, address=?, relation=? ";
			String query2 = " where seqno=?";
			
			ps = conn_mysql.prepareStatement(query1 + query2);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelNo.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.setInt(6, Integer.parseInt(tfSequenceNo.getText()));
			
			ps.executeUpdate();
			// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
			conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}// end of updateAction() 
	
	private void delete() {
		deleteAction();
		tableInit();
		clearColumn();
		searchAction();
	}
	
	private void deleteAction() {
		PreparedStatement ps = null;	// 보안상 사용. 불러올때는 그냥 Statement를 사용하면 됨.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	// 가져다쓸 클라스패키지 정의.
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);	// DB와 연결
//			Statement stmt_mysql = conn_mysql.createStatement();	// DB에서 데이터를 받아올때 사용.
			
			String query1 = "delete from userinfo ";
			String query2 = " where seqno=?";
			
			ps = conn_mysql.prepareStatement(query1 + query2);
			ps.setInt(1, Integer.parseInt(tfSequenceNo.getText()));
			
			ps.executeUpdate();
			// ConCurentUser : DB에 동시접속자 수 최대 5명 가능.
			conn_mysql.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
} // End

