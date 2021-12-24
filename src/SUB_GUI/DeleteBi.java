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

public class DeleteBi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtStatus;
	private JTextField txtDate;
	private JTextField txtAmount;
	private JTextField txtClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteBi frame = new DeleteBi();
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
	public DeleteBi() {
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
		panel.setBounds(124, 240, 201, 49);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.addMouseListener(new PanelButtonMouseAdapter(panel));
		
		JLabel label = new JLabel("Delete");
		label.setBounds(58, 11, 90, 34);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		label.setBackground(new Color(148, 0, 211));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(106, 0, 231, 43);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setText("ID");
		textField.setFont(new Font("Arial", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(10, 11, 169, 20);
		panel_1.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(106, 47, 231, 43);
		contentPane.add(panel_2);
		
		txtStatus = new JTextField();
		txtStatus.setText("Status");
		txtStatus.setFont(new Font("Arial", Font.PLAIN, 11));
		txtStatus.setColumns(10);
		txtStatus.setBorder(null);
		txtStatus.setBounds(10, 11, 169, 20);
		panel_2.add(txtStatus);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(106, 94, 231, 43);
		contentPane.add(panel_3);
		 
		txtDate = new JTextField();
		txtDate.setText("Date");
		txtDate.setFont(new Font("Arial", Font.PLAIN, 11));
		txtDate.setColumns(10);
		txtDate.setBorder(null);
		txtDate.setBounds(10, 11, 169, 20);
		panel_3.add(txtDate);
		
		final JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(404, 0, 46, 28);
		contentPane.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(106, 141, 231, 43);
		contentPane.add(panel_4);
		
		txtAmount = new JTextField();
		txtAmount.setText("Amount");
		txtAmount.setFont(new Font("Arial", Font.PLAIN, 11));
		txtAmount.setColumns(10);
		txtAmount.setBorder(null);
		txtAmount.setBounds(10, 11, 169, 20);
		panel_4.add(txtAmount);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(106, 186, 231, 43);
		contentPane.add(panel_5);
		
		txtClient = new JTextField();
		txtClient.setText("Client");
		txtClient.setFont(new Font("Arial", Font.PLAIN, 11));
		txtClient.setColumns(10);
		txtClient.setBorder(null);
		txtClient.setBounds(10, 11, 169, 20);
		panel_5.add(txtClient);
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

}
