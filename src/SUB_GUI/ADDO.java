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

public class ADDO extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDO frame = new ADDO();
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
	public ADDO() {
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
		
		JLabel label = new JLabel("ADD");
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
		
		textField_1 = new JTextField();
		textField_1.setText("Product");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(10, 11, 169, 20);
		panel_2.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(106, 94, 231, 43);
		contentPane.add(panel_3);
		 
		textField_2 = new JTextField();
		textField_2.setText("Quantity");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(10, 11, 169, 20);
		panel_3.add(textField_2);
		
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
		
		textField_3 = new JTextField();
		textField_3.setText("Client");
		textField_3.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(10, 11, 169, 20);
		panel_4.add(textField_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(106, 186, 231, 43);
		contentPane.add(panel_5);
		
		textField_4 = new JTextField();
		textField_4.setText("Destination");
		textField_4.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(10, 11, 169, 20);
		panel_5.add(textField_4);
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
