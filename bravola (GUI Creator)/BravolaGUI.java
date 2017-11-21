package bravola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormSpecs;

public class BravolaGUI {

	private JFrame frame;
	private final Action createCharacter = new SwingAction();
	private final Action loadData = new SwingAction_1();
	private final Action saveData = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BravolaGUI window = new BravolaGUI();
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
	public BravolaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane_1.setToolTipText("View character information.");
		tabbedPane.addTab("Character", null, tabbedPane_1, null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane_1.addTab("General", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblCharacterName = new JLabel("characterName");
		lblCharacterName.setBounds(10, 11, 113, 14);
		panel.add(lblCharacterName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 23, 113, 2);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Skills", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Affiliation", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Inventory", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Party", null, tabbedPane_3, null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Quests", null, tabbedPane_4, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Current", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Active", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Completed", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane_4.addTab("Failed", null, panel_6, null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("World", null, tabbedPane_5, null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Galaxy", null, panel_7, null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Solar System", null, panel_8, null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Planet", null, panel_9, null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		tabbedPane_5.addTab("Surroundings", null, panel_10, null);
		
		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_6.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Log", null, tabbedPane_6, null);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane_6.addTab("All", null, scrollPane, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane_6.addTab("Dialog", null, scrollPane_1, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		tabbedPane_6.addTab("Combat", null, scrollPane_2, null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		tabbedPane_6.addTab("Party", null, scrollPane_3, null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		frame.setJMenuBar(menuBar);
		
		JButton btnSave = new JButton("Save");
		btnSave.setAction(saveData);
		btnSave.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave.setFont(new Font("Courier New", Font.BOLD, 12));
		btnSave.setToolTipText("Save to a file.");
		menuBar.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setAction(loadData);
		btnLoad.setHorizontalAlignment(SwingConstants.LEFT);
		btnLoad.setFont(new Font("Courier New", Font.BOLD, 12));
		btnLoad.setToolTipText("Load from a save file.");
		menuBar.add(btnLoad);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.setAction(createCharacter);
		btnCreate.setFont(new Font("Courier New", Font.BOLD, 12));
		menuBar.add(btnCreate);
		
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setHorizontalAlignment(SwingConstants.RIGHT);
		mnHelp.setFont(new Font("Courier New", Font.PLAIN, 12));
		menuBar.add(mnHelp);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Create Character");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Load");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
