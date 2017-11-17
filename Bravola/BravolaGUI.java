//package bravola;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
// import bravola.*;


public class BravolaGUI extends JFrame
{
  PlayerChar Player = new PlayerChar();


  public BravolaGUI()
  {
    initUI();

  }

  private void initUI()
  {
    createMenuBar();
    createToolBar();

    setTitle("Bravola Odyssey");
    setSize(1080,768);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private void createMenuBar()
  {

    // Initializing top-level menu.
    // ----------------------------
    JMenuBar menubar = new JMenuBar();
    ImageIcon icon = new ImageIcon("exit.png");

    JMenu fileMenu = new JMenu("File");
    fileMenu.setMnemonic(KeyEvent.VK_F);

    JMenu charMenu = new JMenu("Character");
    charMenu.setMnemonic(KeyEvent.VK_C);

    JMenu invMenu = new JMenu("Inventory");
    invMenu.setMnemonic(KeyEvent.VK_I);

    JMenu partyMenu = new JMenu("Party");
    partyMenu.setMnemonic(KeyEvent.VK_G);

    JMenu questMenu = new JMenu("Quests");
    questMenu.setMnemonic(KeyEvent.VK_Q);

    JMenu worldMenu = new JMenu("World");
    worldMenu.setMnemonic(KeyEvent.VK_W);

    JMenu logMenu = new JMenu("Log");
    logMenu.setMnemonic(KeyEvent.VK_L);

    JMenu helpMenu = new JMenu("Help");
    helpMenu.setMnemonic(KeyEvent.VK_H);

    // File drop-down menu items.
    JMenuItem f_newChar = new JMenuItem("New Character");
    JMenuItem f_saveChar = new JMenuItem("Save Character");
    JMenuItem f_loadChar = new JMenuItem("Load Character");
    JMenuItem f_connect = new JMenuItem("Connect to Bravola ONLINE");
    JMenuItem f_settings = new JMenuItem("Settings");
    JMenuItem f_exit = new JMenuItem("Exit", icon);

    f_exit.setMnemonic(KeyEvent.VK_E);
    f_exit.setToolTipText("Exit application.");
    f_exit.addActionListener((ActionEvent event) ->
    {
      System.exit(0);
    });

    fileMenu.add(f_newChar);
    f_newChar.addActionListener((ActionEvent event) ->
    {
      JOptionPane f_newChar_Warning = new JOptionPane();
      Object[] f_newChar_Warning_Options = {"Save and Continue", "Continue without Saving", "Cancel"};

      f_newChar_Warning.showOptionDialog(null, "Creating a new character will exit your current game!\n Are you sure?",
                                          "Save Warning", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
                                          f_newChar_Warning_Options, f_newChar_Warning_Options[2]);
    });

    fileMenu.add(f_saveChar);
    fileMenu.add(f_loadChar);
    fileMenu.add(f_connect);
    fileMenu.add(f_settings);
    fileMenu.add(f_exit);

    // Character drop-down menu items.
    JMenuItem c_stats = new JMenuItem("Stats");
    c_stats.setToolTipText("View and edit stats.");

    charMenu.add(c_stats);

    // Inventory drop-down menu items.
    JMenuItem i_view = new JMenuItem("View Inventory");
    JCheckBoxMenuItem i_quick = new JCheckBoxMenuItem("Toggle Quick Inv");

    invMenu.add(i_view);
    invMenu.add(i_quick);

    // Party drop-down menu items.
    JMenuItem p_view = new JMenuItem("View Party");
    JMenuItem p_edit = new JMenuItem("Edit Members");

    partyMenu.add(p_view);
    partyMenu.add(p_edit);

    // Quests drop-down menu items.
    JMenuItem q_current = new JMenuItem("View Current Quest");
    JMenuItem q_active = new JMenuItem("View All Active Quests");
    JMenuItem q_completed = new JMenuItem("View Completed Quests");
    JMenuItem q_failed = new JMenuItem("View Failed Quests");

    questMenu.add(q_current);
    questMenu.add(q_active);
    questMenu.add(q_completed);
    questMenu.add(q_failed);

    // World drop-down menu items.
    JMenuItem w_galaxy = new JMenuItem("Galaxy Menu");
    JMenuItem w_solar = new JMenuItem("Solar System");
    JMenuItem w_planet = new JMenuItem("Planet View");
    JMenuItem w_surround = new JMenuItem("View Surroundings");

    worldMenu.add(w_galaxy);
    worldMenu.add(w_solar);
    worldMenu.add(w_planet);
    worldMenu.add(w_surround);

    // Log drop-down menu items.
    JMenuItem l_general = new JMenuItem("General");
    JMenuItem l_party = new JMenuItem("Party");
    JMenuItem l_dialog = new JMenuItem("Dialog");
    JMenuItem l_combat = new JMenuItem("Combat");

    logMenu.add(l_general);
    logMenu.add(l_party);
    logMenu.add(l_dialog);
    logMenu.add(l_combat);

    // Help drop-down menu items.


    // Add menu items to the menu bar.
    menubar.add(fileMenu);
    menubar.add(charMenu);
    menubar.add(invMenu);
    menubar.add(partyMenu);
    menubar.add(questMenu);
    menubar.add(worldMenu);
    menubar.add(logMenu);
    menubar.add(Box.createHorizontalGlue());
    menubar.add(helpMenu);

    setJMenuBar(menubar);

    // ---------------------
    // Done initializing top-level menu.

  }



  public static void main(String[] args)
  {
    EventQueue.invokeLater(() -> {
      BravolaGUI ex = new BravolaGUI();
      ex.setVisible(true);
    });


  }
}
