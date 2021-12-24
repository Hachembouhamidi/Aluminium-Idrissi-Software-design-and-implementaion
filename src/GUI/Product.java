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

import SUB_GUI.ADD;
import SUB_GUI.ADDP;
import SUB_GUI.Delete;
import SUB_GUI.DeleteP;
import SUB_GUI.Notify;
import SUB_GUI.Search;
import SUB_GUI.SearchP;
import SUB_GUI.Update;

public class Product extends JFrame {
	private Image image_l = new ImageIcon (Login.class.getResource("logo.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image image_2 = new ImageIcon (Login.class.getResource("Return .png")).getImage().getScaledInstance(50,40,Image.SCALE_SMOOTH);
 
	private JPanel contentPane;
	private JLabel label_1;
	private JTable table;
	DefaultTableModel model;
	private JScrollPane scroll;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel;
	private JLabel lblDeleteClient;
	private JLabel lblUpdateClient;
	private JLabel lblSearchClient;
	private JPanel panel_6;
	private JLabel lblName;
	private JLabel lblId;
	private JLabel lblTel;
	private JPanel panel_7;
	private JLabel lblReturn;
	private JLabel lblNewLabel_1;
	private JPanel panel_8;
	private JLabel lblDisplayProduct;
	private JPanel panel_9;
	private JLabel lblNotifyShortages;
	private JLabel lblProduct;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
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
	public Product() {
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
					Product.this.dispose();
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
		
		lblProduct = new JLabel("Product");
		lblProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		lblProduct.setBounds(300, 23, 390, 52);
		panel.add(lblProduct);
		
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
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		model = new DefaultTableModel();
		table.setModel(model);
		table.setBounds(236, 244, 515, 217);
		contentPane.add(table);
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Quantity");
		model.addRow(new Object[] {"Alloy 1103" , "45" ,"182"});
		model.addRow(new Object[] {"Alloy 3003" , "720" ,"850"});
		model.addRow(new Object[] {"Alloy 6061" , "964" ,"239"});
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 0, 128));
		panel_2.addMouseListener(new PanelButtonMouseAdapter(panel_2));
		panel_2.setBounds(214, 110, 121, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoadd();
			}
		});
		
		lblNewLabel = new JLabel("Add Product");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 11, 89, 14);
		panel_2.add(lblNewLabel);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 0, 128));
		panel_3.addMouseListener(new PanelButtonMouseAdapter(panel_3));
		panel_3.setBounds(365, 110, 121, 40);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotodelete();
			}
		});
		
		
		
		lblDeleteClient = new JLabel("Delete Product");
		lblDeleteClient.setForeground(Color.WHITE);
		lblDeleteClient.setFont(new Font("Arial", Font.BOLD, 12));
		lblDeleteClient.setBounds(23, 11, 88, 14);
		panel_3.add(lblDeleteClient);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 0, 128));
		panel_4.addMouseListener(new PanelButtonMouseAdapter(panel_4));
		panel_4.setBounds(516, 110, 121, 40);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		panel_4.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoUpdate();
			}
		});
		
		
		lblUpdateClient = new JLabel("Update Product");
		lblUpdateClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateClient.setForeground(Color.WHITE);
		lblUpdateClient.setFont(new Font("Arial", Font.BOLD, 12));
		lblUpdateClient.setBounds(10, 11, 101, 14);
		panel_4.add(lblUpdateClient);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(128, 0, 128));
		panel_5.addMouseListener(new PanelButtonMouseAdapter(panel_5));
		panel_5.setBounds(664, 110, 121, 40);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		panel_5.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoSearch();
			}
		});
		
		
		lblSearchClient = new JLabel("Search Product");
		lblSearchClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchClient.setForeground(Color.WHITE);
		lblSearchClient.setFont(new Font("Arial", Font.BOLD, 12));
		lblSearchClient.setBounds(10, 11, 101, 14);
		panel_5.add(lblSearchClient);
		
		panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(128, 0, 128));
		panel_6.setBounds(236, 206, 515, 40);
		contentPane.add(panel_6);
		
		
		lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial", Font.BOLD, 12));
		lblName.setBounds(10, 11, 57, 14);
		panel_6.add(lblName);
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Arial", Font.BOLD, 12));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(194, 11, 46, 14);
		panel_6.add(lblId);
		
		lblTel = new JLabel("Quantity");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setForeground(Color.WHITE);
		lblTel.setFont(new Font("Arial", Font.BOLD, 12));
		lblTel.setBounds(368, 11, 57, 14);
		panel_6.add(lblTel);
		
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(128, 0, 128));
		panel_8.addMouseListener(new PanelButtonMouseAdapter(panel_8));

		panel_8.setBounds(574, 155, 121, 40);
		contentPane.add(panel_8);
		
		lblDisplayProduct = new JLabel("Display Product");
		lblDisplayProduct.setForeground(Color.WHITE);
		lblDisplayProduct.setFont(new Font("Arial", Font.BOLD, 12));
		lblDisplayProduct.setBounds(10, 11, 101, 14);
		panel_8.add(lblDisplayProduct);
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(128, 0, 128));
		panel_9.addMouseListener(new PanelButtonMouseAdapter(panel_9));
		panel_9.setBounds(297, 155, 121, 40);
		contentPane.add(panel_9);
		panel_9.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoNotify();
			}
		});
		
		lblNotifyShortages = new JLabel("Notify Shortages");
		lblNotifyShortages.setForeground(Color.WHITE);
		lblNotifyShortages.setFont(new Font("Arial", Font.BOLD, 12));
		lblNotifyShortages.setBounds(10, 11, 101, 14);
		panel_9.add(lblNotifyShortages);
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
	public void gotoadd(){
		ADDP m = new ADDP();
		m.setVisible(true);
		
	}
	public void gotodelete(){
		DeleteP m = new DeleteP();
		m.setVisible(true);
		
	}
	public void gotoUpdate(){
		Update m = new Update();
		m.setVisible(true);
		
	}
	public void gotoSearch(){
		SearchP m = new SearchP();
		m.setVisible(true);
		
	}
	public void gotoNotify(){
		Notify m = new Notify();
		m.setVisible(true);
		
	}

}
