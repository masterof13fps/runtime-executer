package yourpackage;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MultiTool extends JFrame {

	private JPanel contentPane;
	private JTextField textBoxMitCommand;
	private String cmd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					MultiTool frame = new MultiTool();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MultiTool() {
		
		setForeground(Color.CYAN);
		setResizable(false);
		setBackground(Color.GRAY);
		setTitle("Runtime Executer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JLabel lblCmdCommandJava = new JLabel("CMD Command Java Executer");
		lblCmdCommandJava.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		
		JLabel lblMadeByArtur = new JLabel("Made by Artur");
		lblMadeByArtur.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		
		textBoxMitCommand = new JTextField();
		textBoxMitCommand.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textBoxMitCommand.setColumns(10);
		
		JButton btnNewButton = new JButton("Execute Command");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    String cmd = textBoxMitCommand.getText();
			    try {
					Runtime.getRuntime().exec(cmd);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		
		JLabel lblInsertACommand = new JLabel("Insert a Command here:");
		lblInsertACommand.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCmdCommandJava)
							.addPreferredGap(ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
							.addComponent(lblMadeByArtur))
						.addComponent(lblInsertACommand)
						.addComponent(textBoxMitCommand, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCmdCommandJava)
						.addComponent(lblMadeByArtur))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInsertACommand)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textBoxMitCommand, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		contentPane.setLayout(gl_contentPane);
		
	}
}
