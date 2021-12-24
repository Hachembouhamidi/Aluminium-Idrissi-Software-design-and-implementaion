package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridBagLayout;

import javax.swing.JTable;

import SUB_GUI.ChangePW;

public class User extends JFrame {
	private Image image_l = new ImageIcon (Login.class.getResource("logo.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image image_2 = new ImageIcon (Login.class.getResource("Return .png")).getImage().getScaledInstance(50,40,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JLabel label_1;
	DefaultTableModel model;
	private JScrollPane scroll;
	private JPanel panel_7;
	private JLabel lblReturn;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 488);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(0, 0, 797, 99);
		contentPane.add(panel);
		
		label_1 = new JLabel("X");
		label_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				label_1.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				label_1.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure ? " , "confirmation" ,JOptionPane.YES_NO_OPTION)==0){
					User.this.dispose();
				}
			}
		});
		
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(741, 0, 46, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 169, 116);
		label_2.setIcon(new ImageIcon (image_l));
		panel.add(label_2);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		lblUser.setBounds(281, 21, 390, 52);
		panel.add(lblUser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(139, 0, 139));
		panel_1.setBounds(0, 99, 169, 389);
		contentPane.add(panel_1);
		
		panel_7 = new JPanel();
		panel_7.addMouseListener(new PanelButtonMouseAdapter(panel_7) );
		panel_7.setBackground(new Color(139, 0, 139));
		panel_7.setBounds(0, 0, 169, 66);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		panel_7.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoMain();
			}
		});
		
		lblReturn = new JLabel("Return");
		lblReturn.setFont(new Font("Arial", Font.BOLD, 14));
		lblReturn.setForeground(new Color(255, 255, 255));
		lblReturn.setBounds(76, 28, 57, 14);
		panel_7.add(lblReturn);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 11, 56, 44);
		lblNewLabel_1.setIcon(new ImageIcon(image_2));
		panel_7.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 128));
		panel_2.setBounds(349, 177, 235, 55);
		panel_2.addMouseListener(new PanelButtonMouseAdapter(panel_2));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.addMouseListener(new MouseAdapter (){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure ? " , "confirmation" ,JOptionPane.YES_NO_OPTION)==0){
					gotologin();
					
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Log Out");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(65, 11, 110, 33);
		panel_2.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(128, 0, 128));
		panel_3.addMouseListener(new PanelButtonMouseAdapter(panel_3));
		panel_3.setBounds(349, 273, 235, 55);
		contentPane.add(panel_3);
		
		JLabel lblNotifications = new JLabel("Notifications");
		lblNotifications.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotifications.setForeground(Color.WHITE);
		lblNotifications.setFont(new Font("Arial", Font.BOLD, 15));
		lblNotifications.setBounds(65, 11, 110, 33);
		panel_3.add(lblNotifications);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(128, 0, 128));
		panel_4.addMouseListener(new PanelButtonMouseAdapter(panel_4));
		panel_4.setBounds(349, 368, 235, 55);
		contentPane.add(panel_4);
		panel_4.addMouseListener(new MouseAdapter (){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotochange();
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Change Password");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(54, 11, 128, 33);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setForeground(Color.WHITE);
		lblChangePassword.setFont(new Font("Arial", Font.BOLD, 15));
		lblChangePassword.setBounds(53, 11, 138, 33);
		
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel){
			this.panel = panel;
		}
		@Override 
		public void mouseEntered(MouseEvent e){
			panel.setBackground(new Color(148,0,211));
		}
		@Override 
		public void mouseExited(MouseEvent e){
			panel.setBackground(new Color(139, 0, 139));
		}
		
		
		
		
}
	public void gotoMain(){
		MainScreen m = new MainScreen();
		m.setVisible(true);
		dispose();
	}
	public void gotologin(){
		Login n = new Login();
		n.setVisible(true);
		dispose();
	}
	public void gotochange(){
		ChangePW n = new ChangePW();
		n.setVisible(true);
		
	}
	
}
