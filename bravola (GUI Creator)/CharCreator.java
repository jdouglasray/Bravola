package bravola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SpinnerListModel;
import java.awt.Font;

public class CharCreator {

	private JFrame frmCharacterCreator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharCreator window = new CharCreator();
					window.frmCharacterCreator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CharCreator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCharacterCreator = new JFrame();
		frmCharacterCreator.setTitle("Character Creator");
		frmCharacterCreator.setBounds(100, 100, 550, 500);
		frmCharacterCreator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmCharacterCreator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCharacterName = new JLabel("Character Name:");
		lblCharacterName.setBounds(10, 11, 107, 14);
		panel.add(lblCharacterName);
		
		textField = new JTextField();
		textField.setBounds(127, 8, 177, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(435, 427, 89, 23);
		panel.add(btnFinish);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(336, 427, 89, 23);
		panel.add(btnClear);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Courier New", Font.PLAIN, 12));
		spinner.setModel(new SpinnerListModel(new String[] {"Human", "Android", "Butlar", "Space Elf", "Gnarp'i", "Smith"}));
		spinner.setBounds(10, 36, 107, 23);
		panel.add(spinner);
	}
}
