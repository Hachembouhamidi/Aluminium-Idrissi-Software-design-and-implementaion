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

public class UpdateBi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBi frame = new UpdateBi();
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
	public UpdateBi() {
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
		
		
		JLabel lblEnter = new JLabel("Enter");
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
		panel_2.setBounds(110, 124, 231, 43);
		contentPane.add(panel_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Client");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(10, 11, 169, 20);
		panel_2.add(textField_1);
		
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
		Update2Bi n = new Update2Bi();
		n.setVisible(true);
		dispose();
	}

}
