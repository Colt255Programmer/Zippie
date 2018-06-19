
import java.io.*;
import javax.swing.JFileChooser;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Toolkit;

public class frame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame3 frame = new frame3();
					frame.setVisible(true);
					frame.setTitle("Zippie");
					ImageIcon img = new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\logonly.png");
				    frame.setIconImage(img.getImage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\logonly.png"));
		setTitle("Zippie-Compress");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 582, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JFileChooser fileChooser = new JFileChooser();
		String ffile="Select a File";
		String ffolder="Select a Folder";

		
		JRadioButton rd1 = new JRadioButton("Compress File");
		rd1.setForeground(new Color(107, 142, 35));
		rd1.setFont(new Font("Showcard Gothic", Font.BOLD, 35));
		rd1.setBackground(new Color(240, 248, 255));
		rd1.setBounds(95, 84, 350, 47);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Compress Folder");
		rd2.setForeground(new Color(107, 142, 35));
		rd2.setFont(new Font("Showcard Gothic", Font.BOLD, 35));
		rd2.setBackground(new Color(240, 248, 255));
		rd2.setBounds(95, 181, 398, 47);
		panel.add(rd2);
		
		ButtonGroup grp=new ButtonGroup();
		grp.add(rd1);
		grp.add(rd2);
		
		JButton btnstrt1= new JButton(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnStart.PNG"));
		JButton btnstrt2 = new JButton(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnStart.PNG"));
		btnstrt1.setVisible(false);
		btnstrt2.setVisible(false);
		
		
		JLabel lbfile = new JLabel("File/Folder Name");
		lbfile.setForeground(new Color(0, 0, 0));
		lbfile.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lbfile.setEnabled(false);
		lbfile.setVisible(false);
		lbfile.setBounds(12, 247, 558, 27);
		panel.add(lbfile);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(240, 248, 255));
		progressBar.setForeground(new Color(240, 248, 255));
		progressBar.setBounds(42, 388, 498, 27);
		progressBar.setVisible(false);
		panel.add(progressBar);
		
		JLabel lbpath = new JLabel("Path");
		lbpath.setForeground(new Color(0, 0, 0));
		lbpath.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lbpath.setBounds(12, 287, 558, 27);
		lbpath.setEnabled(false);
		lbpath.setVisible(false);
		panel.add(lbpath);
		
		JLabel temp = new JLabel("temp");
		temp.setBounds(42, 340, 56, 16);
		temp.setVisible(false);
		panel.add(temp);
		
		rd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fileChooser.setDialogTitle(ffile);
				fileChooser.setApproveButtonText(ffile);
			    int returnValue = fileChooser.showOpenDialog(null);

			    if (returnValue == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      String fileName = "Selected File/Folder: "+selectedFile.getName();
			      //System.out.println("we selected: " + selectedFile);
			        lbfile.setEnabled(true);
				    lbfile.setText(fileName);
				    lbfile.setVisible(true);
				    
				    String filepath = "Path : "+ fileChooser.getSelectedFile().getPath();
				    filepath.replaceAll("\\\\", "/");
				    lbpath.setEnabled(true);
				    lbpath.setText(filepath);
				    lbpath.setVisible(true);
				    btnstrt1.setVisible(true);
				    temp.setText(fileChooser.getSelectedFile().getAbsolutePath());
				    
			    }
			}
			});
		
		rd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fileChooser.setDialogTitle(ffolder);
				fileChooser.setApproveButtonText(ffile);
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
			    int returnValue = fileChooser.showOpenDialog(null);

			    if (returnValue == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      String fileName = "Selected File/Folder: "+selectedFile.getName();
			      //System.out.println("we selected: " + selectedFile);
			        lbfile.setEnabled(true);
				    lbfile.setText(fileName);
				    lbfile.setVisible(true);
				    
				    String filepath = "Path : "+ fileChooser.getSelectedFile().getAbsolutePath();
				    lbpath.setEnabled(true);
				    lbpath.setText(filepath);
				    lbpath.setVisible(true);
				    btnstrt2.setVisible(true);
				    temp.setText(fileChooser.getSelectedFile().getAbsolutePath());
			    }
			    
			}
			});
		
		
		
		btnstrt2.setBounds(289, 470, 87, 47);
		panel.add(btnstrt2);
		btnstrt1.setBounds(190, 470, 87, 47);
		panel.add(btnstrt1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				frame2 fp= new frame2();
				fp.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnBack.PNG"));
		btnNewButton.setBounds(42, 470, 87, 39);
		panel.add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnExit.PNG"));
		button.setBounds(443, 470, 74, 39);
		panel.add(button);
		
		
		
		btnstrt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Compress Folder
				progressBar.setVisible(true);
				String filepath= temp.getText();
				filepath=filepath.replaceAll("\\\\","/");
				String[] filepat= new String[] {filepath};
				//System.out.println(filepath);
				ZipDir.main(filepat);
				JOptionPane.showMessageDialog(null,"Folder Compressed");
				dispose();
				frame2 fp2= new frame2();
				fp2.setVisible(true);
			}
		});
		btnstrt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Compress File
				progressBar.setVisible(true);
				String filepath= temp.getText();
				filepath=filepath.replaceAll("\\\\","/");
				String[] filepat= new String[] {filepath};
				System.out.println(filepath);
				ZipFile.main(filepat);
				JOptionPane.showMessageDialog(null,"File Compressed");
				dispose();
				frame2 fp2= new frame2();
				fp2.setVisible(true);
				
			}
		});
	
	}
}
