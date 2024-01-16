package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.function.Dao;
import com.javalec.function.Dto;
import com.javalec.function.ShareVar;

import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JRadioButton rbInsert;
	private JRadioButton rbUpdate;
	private JRadioButton rbDelete;
	private JRadioButton rbQuery;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable innerTable;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JTextField tfName;
	private JLabel lblNewLabel_1;
	private JTextField tfTelno;
	private JLabel lblNewLabel_2;
	private JTextField tfAddress;
	private JLabel lblNewLabel_3;
	private JTextField tfEmail;
	private JLabel lblNewLabel_4;
	private JTextField tfRelation;
	private JLabel lblNewLabel_5;
	private JButton btnOK;
	
	
	// -- Table
	private final DefaultTableModel outerTable = new DefaultTableModel();
	private JLabel lblImage;
	private JButton btnFilePath;
	private JTextField tfFilePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tableInit();
				searchAction();
				screenPartition();
				
			}
		});
		frame.setTitle("주소록");
		frame.setBounds(100, 100, 645, 771);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getRbInsert());
		frame.getContentPane().add(getRbUpdate());
		frame.getContentPane().add(getRbDelete());
		frame.getContentPane().add(getRbQuery());
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getLblImage());
		frame.getContentPane().add(getBtnFilePath());
		frame.getContentPane().add(getTfFilePath());
	}
	private JRadioButton getRbInsert() {
		if (rbInsert == null) {
			rbInsert = new JRadioButton("입력");
			rbInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbInsert.setBackground(new Color(245, 222, 179));
			buttonGroup.add(rbInsert);
			rbInsert.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			rbInsert.setBounds(45, 20, 70, 40);
		}
		return rbInsert;
	}
	private JRadioButton getRbUpdate() {
		if (rbUpdate == null) {
			rbUpdate = new JRadioButton("수정");
			rbUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbUpdate.setBackground(new Color(245, 222, 179));
			buttonGroup.add(rbUpdate);
			rbUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			rbUpdate.setBounds(145, 20, 70, 40);
		}
		return rbUpdate;
	}
	private JRadioButton getRbDelete() {
		if (rbDelete == null) {
			rbDelete = new JRadioButton("삭제");
			rbDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbDelete.setBackground(new Color(245, 222, 179));
			buttonGroup.add(rbDelete);
			rbDelete.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			rbDelete.setBounds(245, 20, 70, 40);
		}
		return rbDelete;
	}
	private JRadioButton getRbQuery() {
		if (rbQuery == null) {
			rbQuery = new JRadioButton("검색");
			rbQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					screenPartition();
				}
			});
			rbQuery.setBackground(new Color(245, 222, 179));
			buttonGroup.add(rbQuery);
			rbQuery.setSelected(true);
			rbQuery.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			rbQuery.setBounds(345, 20, 70, 40);
		}
		return rbQuery;
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setForeground(new Color(0, 0, 0));
			cbSelection.setBackground(new Color(162, 249, 253));
			cbSelection.setFont(new Font("맑은 고딕", Font.BOLD, 18));
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(45, 70, 101, 40);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setFont(new Font("맑은 고딕", Font.BOLD, 18));
			tfSelection.setBounds(165, 70, 252, 40);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setForeground(new Color(0, 0, 0));
			btnQuery.setBackground(new Color(255, 182, 193));
			btnQuery.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			btnQuery.setBounds(435, 70, 163, 40);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(45, 130, 553, 114);
			scrollPane.setViewportView(getInnerTable());
		}
		return scrollPane;
	}
	private JTable getInnerTable() {
		if (innerTable == null) {
			innerTable = new JTable();
			innerTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton()==1) {
						tableClick();
					}
				}
			});
			innerTable.setBackground(new Color(228, 254, 186));
			innerTable.setFont(new Font("맑은 고딕", Font.BOLD, 12));
			innerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			innerTable.setModel(outerTable);
		}
		return innerTable;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No :");
			lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel.setBounds(45, 250, 100, 40);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setHorizontalAlignment(SwingConstants.TRAILING);
			tfSeqno.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfSeqno.setBounds(150, 257, 70, 30);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfName.setColumns(10);
			tfName.setBounds(150, 297, 120, 30);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel_1.setBounds(45, 290, 100, 40);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfTelno.setColumns(10);
			tfTelno.setBounds(150, 337, 240, 30);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel_2.setBounds(45, 330, 100, 40);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfAddress.setColumns(10);
			tfAddress.setBounds(150, 377, 448, 30);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel_3.setBounds(45, 370, 100, 40);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfEmail.setColumns(10);
			tfEmail.setBounds(150, 417, 448, 30);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel_4.setBounds(45, 410, 100, 40);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfRelation.setColumns(10);
			tfRelation.setBounds(150, 457, 448, 30);
		}
		return tfRelation;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			lblNewLabel_5.setBounds(45, 450, 100, 40);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPartition();
				}
			});
			btnOK.setBackground(new Color(248, 255, 155));
			btnOK.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			btnOK.setBounds(398, 254, 200, 40);
		}
		return btnOK;
	}
	
	
	
	// --- Functions ----
	// Talbe 초기화 하기
	private void tableInit() {
		// Table Column명 정하기
		outerTable.addColumn("Sqe No.");
		outerTable.addColumn("이름");
		outerTable.addColumn("전화번호");
		outerTable.addColumn("관계");
		outerTable.setColumnCount(4);
		
		
		// Table Column 크기 정하기
		int colNo = 0;
		TableColumn col = innerTable.getColumnModel().getColumn(colNo);
		int width = 40;
		col.setPreferredWidth(width);
		
		colNo = 1;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 100;
		col.setPreferredWidth(width);
		
		colNo = 2;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 100;
		col.setPreferredWidth(width);
		
		colNo = 3;
		col = innerTable.getColumnModel().getColumn(colNo);
		width = 200;
		col.setPreferredWidth(width);
		
		innerTable.setAutoResizeMode(innerTable.AUTO_RESIZE_OFF);
		
		
		// Table 내용 지우기
		int i = outerTable.getRowCount();
		for(int j = 0; j < i; j++) {
			outerTable.removeRow(0);
		}
		
		
	}
	
	
	// 검색
	private void searchAction() {
		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.selectList();
		
		int listCount = dtoList.size();
		
		for(int i=0; i<listCount; i++) {
			String temp = Integer.toString(dtoList.get(i).getSeqno());
			String[] qTxt = {temp,
							 dtoList.get(i).getName(),
							 dtoList.get(i).getTelno(),
							 dtoList.get(i).getRelation()};
			
			outerTable.addRow(qTxt);
		}
		
	}
	
	
	// Edit 결정
	private void screenPartition() {
		
		// 검색일 경우
		if(rbQuery.isSelected() == true) {
			btnOK.setVisible(false);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
		
		
		// 입력과 수정일 경우
		if(rbInsert.isSelected() == true || rbUpdate.isSelected() == true) {
			btnOK.setVisible(true);
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
		}
		
		
		// 삭제일 경우
		if(rbDelete.isSelected() == true) {
			btnOK.setVisible(true);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
		
	}
	
	
	// Table에서 Row를 Click 했을 경우
	private void tableClick() {
		int i = innerTable.getSelectedRow();
		String tkSequence = (String) innerTable.getValueAt(i, 0);
		int wkSequence = Integer.parseInt(tkSequence);
		
		Dao dao = new Dao(wkSequence);
		Dto dto = dao.tableClick();
		
		tfSeqno.setText(Integer.toString(dto.getSeqno()));
		tfName.setText(dto.getName());
		tfTelno.setText(dto.getTelno());
		tfAddress.setText(dto.getAddress());
		tfEmail.setText(dto.getEmail());
		tfRelation.setText(dto.getRelation());
		
		// Image 처리 : filename이 틀려야 보여주기가 가능하다.
		String filePath = Integer.toString(ShareVar.filename);
		tfFilePath.setText(filePath);
		
		lblImage.setIcon(new ImageIcon(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		File file = new File(filePath);
		file.delete();
	}
	
	
	private void actionPartition() {
		// 검색일 경우
		if(rbQuery.isSelected() == true) {
			screenPartition();
		}
		
		
		// 입력일 경우
		if(rbInsert.isSelected() == true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				insertAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else {
				JOptionPane.showMessageDialog(null, "데이터를 확인하세요!", "알림", JOptionPane.WARNING_MESSAGE);
				
			}
			
		}
		
		
		// 수정일 경우
		if(rbUpdate.isSelected() == true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				updateAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else {
				JOptionPane.showMessageDialog(null, "데이터를 확인하세요!", "알림", JOptionPane.WARNING_MESSAGE);
				
			}
			
		}
		
		
		// 삭제일 경우
		if(rbDelete.isSelected() == true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0) {
				deleteAction();
				tableInit();
				searchAction();
				clearColumn();
				
			}else {
				JOptionPane.showMessageDialog(null, "데이터를 확인하세요!", "알림", JOptionPane.WARNING_MESSAGE);
				
			}
			
		}
		
		
	}
	
	
	private int insertFieldCheck() {
		int i = 0;
		
		if(tfName.getText().trim().length() == 0) {
			i++;
			tfName.requestFocus();
		}
		
		if(tfTelno.getText().trim().length() == 0) {
			i++;
			tfTelno.requestFocus();
		}
		
		if(tfAddress.getText().trim().length() == 0) {
			i++;
			tfAddress.requestFocus();
		}
		
		if(tfEmail.getText().trim().length() == 0) {
			i++;
			tfEmail.requestFocus();
		}
		
		if(tfRelation.getText().trim().length() == 0) {
			i++;
			tfRelation.requestFocus();
		}
		
		
		return i;
	}
	
	
	private void clearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	
	private void insertAction() {
		String name = tfName.getText().trim();
		String telno = tfTelno.getText().trim();
		String address = tfAddress.getText().trim();
		String email = tfEmail.getText().trim();
		String relation = tfRelation.getText().trim();
		
		
		// Image File
		FileInputStream input = null;
		File file = new File(tfFilePath.getText());
		
		try {
			input = new FileInputStream(file);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Dao dao = new Dao(name, telno, address, email, relation, input);
		boolean result = dao.insertAction();
		
		if(result == true) {
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력 되었습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			JOptionPane.showMessageDialog(null, "입력 중 문제가 발생하였습니다!", "알림", JOptionPane.WARNING_MESSAGE);
			
		}
		
		
	}
	
	
	private void updateAction() {
		int seqno = Integer.parseInt(tfSeqno.getText());
		String name = tfName.getText().trim();
		String telno = tfTelno.getText().trim();
		String address = tfAddress.getText().trim();
		String email = tfEmail.getText().trim();
		String relation = tfRelation.getText().trim();
		
		Dao dao = new Dao(seqno, name, telno, address, email, relation);
		boolean result = dao.updateAction();
		
		if(result == true) {
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 수정 되었습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			JOptionPane.showMessageDialog(null, "입력 중 문제가 발생하였습니다!", "알림", JOptionPane.WARNING_MESSAGE);
			
		}
		
		
	}
	
	
	private void deleteAction() {
		int seqno = Integer.parseInt(tfSeqno.getText());
		
		Dao dao = new Dao(seqno);
		boolean result = dao.deleteAction();
		
		if(result == true) {
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 삭제 되었습니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			JOptionPane.showMessageDialog(null, "입력 중 문제가 발생하였습니다!", "알림", JOptionPane.WARNING_MESSAGE);
			
		}
		
		
	}
	
	
	
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setBackground(new Color(255, 255, 255));
			lblImage.setBounds(45, 510, 200, 200);
		}
		return lblImage;
	}
	private JButton getBtnFilePath() {
		if (btnFilePath == null) {
			btnFilePath = new JButton("File 경로");
			btnFilePath.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					filePath();
				}
			});
			btnFilePath.setFont(new Font("맑은 고딕", Font.BOLD, 20));
			btnFilePath.setBounds(257, 540, 120, 40);
		}
		return btnFilePath;
	}
	private JTextField getTfFilePath() {
		if (tfFilePath == null) {
			tfFilePath = new JTextField();
			tfFilePath.setFont(new Font("맑은 고딕", Font.BOLD, 15));
			tfFilePath.setEditable(false);
			tfFilePath.setBounds(257, 623, 341, 40);
			tfFilePath.setColumns(10);
		}
		return tfFilePath;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------
	
	private void filePath() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png", "bmp");
		chooser.setFileFilter(filter);
		
		int ret = chooser.showOpenDialog(null);
		if(ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않으셨습니다!", "알림", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String filePath = chooser.getSelectedFile().getPath();
		tfFilePath.setText(filePath);
		lblImage.setIcon(new ImageIcon(filePath));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	
	
	
	
	
	
}	// End
