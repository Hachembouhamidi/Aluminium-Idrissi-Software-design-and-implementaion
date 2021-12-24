package SUB_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

import GUI.Client;

public class ChangePW extends JFrame {

	private JPanel contentPane;
	private JTextField txtNewPassword;
	private JTextField txtRepeatNewPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePW frame = new ChangePW();
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
	public ChangePW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(75, 0, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(148, 0, 211));
		panel.setBounds(123, 233, 201, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.addMouseListener(new PanelButtonMouseAdapter(panel));
		panel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoUpdate2();
			}
		});
		
		
		JLabel lblEnter = new JLabel("Change");
		lblEnter.setBounds(58, 11, 90, 34);
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setForeground(Color.WHITE);
		lblEnter.setFont(new Font("Arial", Font.BOLD, 15));
		lblEnter.setBackground(new Color(148, 0, 211));
		panel.add(lblEnter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(110, 70, 231, 43);
		contentPane.add(panel_1);
		
		txtNewPassword = new JTextField();
		txtNewPassword.setText("New Password");
		txtNewPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		txtNewPassword.setColumns(10);
		txtNewPassword.setBorder(null);
		txtNewPassword.setBounds(10, 11, 169, 20);
		panel_1.add(txtNewPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(110, 124, 231, 43);
		contentPane.add(panel_2);
		
		txtRepeatNewPassword = new JTextField();
		txtRepeatNewPassword.setText("Repeat New Password");
		txtRepeatNewPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		txtRepeatNewPassword.setColumns(10);
		txtRepeatNewPassword.setBorder(null);
		txtRepeatNewPassword.setBounds(10, 11, 169, 20);
		panel_2.add(txtRepeatNewPassword);
		
		final JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(404, 0, 46, 28);
		contentPane.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override 
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel){
			this.panel = panel;
		}
		@Override 
		public void mouseEntered(MouseEvent e){
			panel.setBackground(new Color(153,50,204));
		}
		@Override 
		public void mouseExited(MouseEvent e){
			panel.setBackground(new Color(148, 0, 211));
		}
		
		
		
		
}
	public void gotoclient(){
		Client n = new Client();
		n.setVisible(true);
		dispose();
	}
	public void gotoUpdate2(){
		Update2O n = new Update2O();
		n.setVisible(true);
		dispose();
	}

}
