import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class frame4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame4 frame = new frame4();
					frame.setVisible(true);
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
	public frame4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\logonly.png"));
		setTitle("Zippie-Decompress");
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
		FileNameExtensionFilter filter= new FileNameExtensionFilter("Zip Files",".zip","Zip");
		fileChooser.setFileFilter(filter);
		
		JLabel lblBrowseCompressedFiles = new JLabel("Browse Compressed Files: ");
		lblBrowseCompressedFiles.setForeground(new Color(75, 0, 130));
		lblBrowseCompressedFiles.setFont(new Font("Harrington", Font.PLAIN, 30));
		lblBrowseCompressedFiles.setBounds(40, 132, 358, 49);
		panel.add(lblBrowseCompressedFiles);
		
		JLabel temp = new JLabel("temp");
		temp.setBounds(40, 291, 56, 16);
		temp.setVisible(false);
		panel.add(temp);
		
		JLabel lblFilePath = new JLabel("File Path:");
		lblFilePath.setForeground(new Color(105, 105, 105));
		lblFilePath.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 23));
		lblFilePath.setBounds(40, 237, 530, 31);
		lblFilePath.setVisible(false);
		panel.add(lblFilePath);
		
		JButton btnstart = new JButton(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnStart.PNG"));
		btnstart.setVisible(false);
		
		JButton btnBrows = new JButton(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnBrow.PNG"));
		btnBrows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fileChooser.setDialogTitle("Select a Compressed .zip File");
				fileChooser.setApproveButtonText("Select a Compressed .zip File");
			    int returnValue = fileChooser.showOpenDialog(null);

			    if (returnValue == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      System.out.println("Path : "+ fileChooser.getSelectedFile().getPath());
			      String fileName = "Selected File/Folder: "+selectedFile.getName();
			      //System.out.println("we selected: " + selectedFile);
			      lblFilePath.setVisible(true);
			      lblFilePath.setText("Path : "+ fileChooser.getSelectedFile().getPath());
			      temp.setText(fileChooser.getSelectedFile().getPath());
			      btnstart.setVisible(true);
			}
		}
		});
		btnBrows.setBounds(422, 132, 121, 49);
		panel.add(btnBrows);
		
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(240, 248, 255));
		progressBar.setForeground(new Color(240, 248, 255));
		progressBar.setBounds(40, 358, 503, 14);
		progressBar.setVisible(false);
		panel.add(progressBar);
		
		
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				progressBar.setVisible(true);
				String filepath= temp.getText();
				filepath=filepath.replaceAll("\\\\","/");
				String[] filepat= new String[] {filepath};
				System.out.println(filepath);
				UnzipUtilityTest.main(filepat);
				JOptionPane.showMessageDialog(null, "File Decompressed");
				btnstart.setVisible(false);
				dispose();
				frame2 fp2= new frame2();
				fp2.setVisible(true);
			}
		});
		btnstart.setBounds(247, 426, 87, 43);
		panel.add(btnstart);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				frame2 fp= new frame2();
				fp.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnBack.PNG"));
		button.setBounds(40, 426, 87, 43);
		panel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Asus\\eclipse-workspace\\Zipper\\src\\btnExit.PNG"));
		button_1.setBounds(456, 426, 68, 43);
		panel.add(button_1);
		
		
	}
}
