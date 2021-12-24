package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen extends JFrame {
	
	private JPanel contentPane;
	private JLabel lblNewLabel_2;

	private Image image_l = new ImageIcon (Login.class.getResource("logo.png")).getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH);
	private Image image_2 = new ImageIcon (Login.class.getResource("Client.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image image_3 = new ImageIcon (Login.class.getResource("Provider.png")).getImage().getScaledInstance(50,40,Image.SCALE_SMOOTH);
	private Image image_4 = new ImageIcon (Login.class.getResource("product.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image image_5 = new ImageIcon (Login.class.getResource("orders.png")).getImage().getScaledInstance(50,40,Image.SCALE_SMOOTH);
	private Image image_6 = new ImageIcon (Login.class.getResource("sales.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image image_7 = new ImageIcon (Login.class.getResource("User.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image image_8 = new ImageIcon (Login.class.getResource("Bills.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);

	public static void main(String[] args) {
		MainScreen frame = new MainScreen();
		frame.setVisible(true);
		frame.setResizable(true);
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setUndecorated(true);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 99, 169, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelClient = new JPanel();
		panelClient.setBorder(null);
		panelClient.addMouseListener(new PanelButtonMouseAdapter(panelClient));
		panelClient.setBackground(new Color(139, 0, 139));
		panelClient.setBounds(0, 0, 169, 57);
		panel.add(panelClient);
		panelClient.setLayout(null);
		panelClient.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoclient();
			}
		});
		 
		JLabel lblNewLabel = new JLabel("Clients");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(71, 11, 51, 23);
		panelClient.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 51, 45);
		lblNewLabel_1.setIcon(new ImageIcon(image_2));
		panelClient.add(lblNewLabel_1);
		
		JPanel panelProvider = new JPanel();
		panelProvider.setBackground(new Color(139, 0, 139));
		panelProvider.addMouseListener(new PanelButtonMouseAdapter(panelProvider));
		panelProvider.setBounds(0, 56, 169, 57);
		panel.add(panelProvider);
		panelProvider.setLayout(null);
		panelProvider.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoProvider();
			}
		});
		
		JLabel lblProviders = new JLabel("Providers");
		lblProviders.setForeground(Color.WHITE);
		lblProviders.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProviders.setBounds(71, 11, 76, 23);
		panelProvider.add(lblProviders);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(image_3));
		label.setBounds(10, 0, 51, 45);
		panelProvider.add(label);
		
		JPanel panelProduct = new JPanel();
		panelProduct.setBackground(new Color(139, 0, 139));
		panelProduct.addMouseListener(new PanelButtonMouseAdapter(panelProduct));
		panelProduct.setBounds(0, 114, 169, 57);
		panel.add(panelProduct);
		panelProduct.setLayout(null);
		panelProduct.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoProduct();
			}
		});
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProduct.setBounds(71, 11, 55, 23);
		panelProduct.add(lblProduct);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(new Color(139, 0, 139));
		label_1.setIcon(new ImageIcon(image_4));
		label_1.setBounds(10, 2, 51, 45);
		panelProduct.add(label_1);
		
		JPanel panelorders = new JPanel();
		panelorders.setBackground(new Color(139, 0, 139));
		panelorders.addMouseListener(new PanelButtonMouseAdapter(panelorders));
		panelorders.setBounds(0, 173, 169, 57);
		panel.add(panelorders);
		panelorders.setLayout(null);
		panelorders.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoOrders();
			}
		});
		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setForeground(Color.WHITE);
		lblOrders.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOrders.setBounds(71, 11, 51, 23);
		panelorders.add(lblOrders);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon(image_5));
		label_2.setBounds(10, 0, 51, 45);
		panelorders.add(label_2);
		
		JPanel panelSales = new JPanel();
		panelSales.setBackground(new Color(139, 0, 139));
		panelSales.addMouseListener(new PanelButtonMouseAdapter(panelSales));
		panelSales.setBounds(0, 230, 169, 57);
		panel.add(panelSales);
		panelSales.setLayout(null);
		panelSales.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoSales();
			}
		});
		
		JLabel lblSales = new JLabel("Sales");
		lblSales.setForeground(Color.WHITE);
		lblSales.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSales.setBounds(71, 11, 38, 22);
		panelSales.add(lblSales);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setIcon(new ImageIcon(image_6));
		label_3.setBounds(10, 0, 51, 45);
		panelSales.add(label_3);
		
		JPanel panelBills = new JPanel();
		panelBills.setBackground(new Color(139, 0, 139));
		panelBills.addMouseListener(new PanelButtonMouseAdapter(panelBills));
		panelBills.setBounds(0, 285, 169, 50);
		panel.add(panelBills);
		panelBills.setLayout(null);
		
		JLabel lblBills = new JLabel("Bills");
		lblBills.setForeground(Color.WHITE);
		lblBills.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBills.setBounds(71, 11, 35, 25);
		panelBills.add(lblBills);
		panelBills.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoBills();
			}
		});
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setIcon(new ImageIcon(image_8));
		label_5.setBounds(10, 0, 51, 47);
		panelBills.add(label_5);
		
		JPanel panelUser = new JPanel();
		panelUser.setBounds(0, 332, 169, 57);
		panel.add(panelUser);
		panelUser.setBackground(new Color(139, 0, 139));
		panelUser.addMouseListener(new PanelButtonMouseAdapter(panelUser));
		panelUser.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUser.setBounds(71, 11, 33, 23);
		panelUser.add(lblUser);
		panelUser.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				gotoUser();
			}
		});
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon(image_7));
		label_4.setBounds(10, 0, 51, 45);
		panelUser.add(label_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(75, 0, 130));
		panel_1.setBounds(0, 0, 797, 99);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(image_l));
		lblIcon.setBounds(0, 0, 169, 116);
		panel_1.add(lblIcon);
		
		lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_2.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_2.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure ? " , "confirmation" ,JOptionPane.YES_NO_OPTION)==0){
					MainScreen.this.dispose();
				}
			}
		});
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(751, 0, 46, 23);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Welcome to Idrissi Aluminium");
		lblNewLabel_3.setForeground(new Color(153, 50, 204));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(241, 143, 531, 141);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Av Kahira N\u00E9 5");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_4.setForeground(new Color(153, 50, 204));
		lblNewLabel_4.setBounds(212, 284, 210, 75);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblTouableIi = new JLabel("Touable II ");
		lblTouableIi.setHorizontalAlignment(SwingConstants.LEFT);
		lblTouableIi.setForeground(new Color(153, 50, 204));
		lblTouableIi.setFont(new Font("Arial", Font.BOLD, 25));
		lblTouableIi.setBounds(212, 360, 210, 75);
		contentPane.add(lblTouableIi);
		
		JLabel lblContactaluminiumidrissicom = new JLabel("contact@aluminiumidrissi.com");
		lblContactaluminiumidrissicom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContactaluminiumidrissicom.setForeground(new Color(153, 50, 204));
		lblContactaluminiumidrissicom.setFont(new Font("Arial", Font.BOLD, 20));
		lblContactaluminiumidrissicom.setBounds(470, 284, 317, 75);
		contentPane.add(lblContactaluminiumidrissicom);
		
		JLabel label_6 = new JLabel("05 39 998 995 ");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(new Color(153, 50, 204));
		label_6.setFont(new Font("Arial", Font.BOLD, 25));
		label_6.setBounds(468, 360, 319, 75);
		contentPane.add(label_6);
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
	public void gotoclient(){
		Client n = new Client();
		n.setVisible(true);
		dispose();
	}
	public void gotoProvider(){
		Provider n = new Provider();
		n.setVisible(true);
		dispose();
	}
	public void gotoProduct(){
		Product n = new Product();
		n.setVisible(true);
		dispose();
	}
	public void gotoOrders(){
		Orders n = new Orders();
		n.setVisible(true);
		dispose();
	}
	public void gotoSales(){
		Sales n = new Sales();
		n.setVisible(true);
		dispose();
	}
	public void gotoBills(){
		Bills n = new Bills();
		n.setVisible(true);
		dispose();
	}
	public void gotoUser(){
		User n = new User();
		n.setVisible(true);
		dispose();
	}
	
	
	
	
}
