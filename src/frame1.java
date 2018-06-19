import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Zippie");
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.getContentPane().setLayout(null);
		 ImageIcon img = new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\logonly.png");
		    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\logonly.png"));

		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(240, 248, 255));
		panel1.setBounds(0, 0, 582, 565);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblWelcomeToZippie = new JLabel("Welcome to Zippie");
		lblWelcomeToZippie.setFont(new Font("Yu Gothic Light", Font.BOLD, 29));
		lblWelcomeToZippie.setForeground(new Color(0, 139, 139));
		lblWelcomeToZippie.setBounds(157, 33, 264, 52);
		panel1.add(lblWelcomeToZippie);
		
		JLabel logolabel = new JLabel(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\logosmall.PNG"));
		logolabel.setBounds(192, 98, 192, 302);
		panel1.add(logolabel);
		
		ImageIcon btnlogo= new ImageIcon("btn.PNG");
		JButton btnproceed = new JButton(btnlogo);
		btnproceed.setBounds(227, 429, 118, 31);
		panel1.add(btnproceed);
		btnproceed.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btn.PNG"));
		
		
		btnproceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				frame2 fp= new frame2();
				fp.setVisible(true);
				
			}
		});
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
