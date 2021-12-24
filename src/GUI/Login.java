package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends JFrame {
	private Image image_l = new ImageIcon (Login.class.getResource("logo.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image image_2 = new ImageIcon (Login.class.getResource("lock.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	private Image image_3 = new ImageIcon (Login.class.getResource("user.png")).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);


	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField txtPassword;
	private JPanel LogInBtn;
	private JLabel lblNewLabel_1;
	private JLabel label_1;
	private JLabel lblNewLabel_2;
	private JLabel LoginM ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setResizable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		contentPane.setBorder(new LineBorder(new Color(100, 100, 100), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(109, 101, 231, 43);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textUsername = new JTextField();
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(textUsername.getText().equals("Username")){
					textUsername.setText("");
				}else{
					textUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(textUsername.getText().equals("")){
					textUsername.setText("Username");
				}
			}
		});
		textUsername.setBorder(null);
		textUsername.setFont(new Font("Arial", Font.PLAIN, 11));
		textUsername.setText("Username");
		textUsername.setColumns(10);
		textUsername.setBounds(10, 11, 169, 20);
		panel.add(textUsername);
		
		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setAlignmentX(0.5f);
		label_1.setBounds(189, 0, 42, 43);
		label_1.setIcon(new ImageIcon(image_3));
		panel.add(label_1);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(109, 155, 231, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			if(txtPassword.getText().equals("Password")){
				txtPassword.setEchoChar('●');
				txtPassword.setText(""); 
			}else
				txtPassword.selectAll();
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtPassword.getText().equals("")){
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 168, 21);
		panel_1.add(txtPassword);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setBounds(189, 0, 42, 43);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(image_2));
		
		LogInBtn = new JPanel();
		LogInBtn.addMouseListener(new PanelButtonMouseAdapter(LogInBtn));
		LogInBtn.addMouseListener(new MouseAdapter() {
			
			
		});
		LogInBtn.setBorder(null);
		LogInBtn.setBackground(new Color(139, 0, 139));
		LogInBtn.setBounds(131, 237, 193, 52);
		contentPane.add(LogInBtn);
		LogInBtn.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("LOG IN");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(70, 15, 61, 21);
		LogInBtn.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setMinimumSize(new Dimension(500, 500));
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(109, 11, 250, 114);
		label.setIcon(new ImageIcon(image_l));
		contentPane.add(label);
		
		
		lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure ? " , "confirmation" ,JOptionPane.YES_NO_OPTION)==0){
					Login.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_2.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_2.setForeground(Color.white);
			}
			
		});
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(420, 0, 30, 25);
		contentPane.add(lblNewLabel_2);
		
		LoginM = new JLabel();
		LoginM.setHorizontalAlignment(SwingConstants.CENTER);
		LoginM.setFont(new Font("Arial", Font.PLAIN, 12));
		LoginM.setForeground(new Color(255, 0, 255));
		LoginM.setBounds(87, 212, 282, 14);
		contentPane.add(LoginM);
		
		setLocationRelativeTo(null);
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

		
	 
		public void mouseClicked(MouseEvent arg0) {
			if(textUsername.getText().equals("Idrissi")&& txtPassword.getText().equals("idrissi123")){
				LoginM.setText("");
				JOptionPane.showMessageDialog(null, "Login Successful");
				gotoMain();
			}else if (textUsername.getText().equals("")||textUsername.getText().equals("Username")||
					  txtPassword.getText().equals("")|| txtPassword.getText().equals("Password")){
				LoginM.setText("Please enter all the requirements");
			}else{
				LoginM.setText("the username and the Password does not match");
			}
		}
		
	}
	public void gotoMain(){
		MainScreen m = new MainScreen();
		m.setVisible(true);
		dispose();
	}
		
}
