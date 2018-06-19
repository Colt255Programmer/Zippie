

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
					 ImageIcon img = new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\logonly.png");
					    frame.setIconImage(img.getImage());
					frame.setVisible(true);
					frame.setTitle("Zippie");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\logonly.png"));
		setTitle("Zippie");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel frame2panel = new JPanel();
		frame2panel.setForeground(new Color(0, 0, 0));
		frame2panel.setBackground(new Color(240, 248, 255));
		frame2panel.setBounds(0, 0, 594, 565);
		contentPane.add(frame2panel);
		frame2panel.setLayout(null);
		
		JLabel lblSelectOptionBelow = new JLabel("You want to ?");
		lblSelectOptionBelow.setForeground(new Color(47, 79, 79));
		lblSelectOptionBelow.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblSelectOptionBelow.setBounds(181, 94, 208, 58);
		frame2panel.add(lblSelectOptionBelow);
		
		JRadioButton rd1 = new JRadioButton("Compress");
		rd1.setForeground(new Color(0, 0, 0));
		rd1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		rd1.setBackground(new Color(240, 248, 255));
		rd1.setBounds(96, 270, 151, 39);
		frame2panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Decompress");
		rd2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		rd2.setBackground(new Color(240, 248, 255));
		rd2.setBounds(318, 264, 165, 45);
		frame2panel.add(rd2);
		
		ButtonGroup grp= new ButtonGroup();
		grp.add(rd1);
		grp.add(rd2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnExit.PNG"));
		btnNewButton.setBounds(247, 465, 67, 45);
		frame2panel.add(btnNewButton);
	
	
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				frame3 fp1= new frame3();
				fp1.setVisible(true);
			        
			}
			});
		rd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				frame4 fp2= new frame4();
				fp2.setVisible(true);
			}
			});
	}
}
