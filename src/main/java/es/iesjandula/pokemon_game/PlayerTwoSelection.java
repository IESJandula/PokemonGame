/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.iesjandula.pokemon_game;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.iesjandula.pokemon_game.models.Pokemon;
import es.iesjandula.pokemon_game.utils.PokemonException;
import lombok.Data;

/**
 *
 * @author David Martinez Flores
 */
@Data
public class PlayerTwoSelection extends javax.swing.JFrame implements Serializable
{
	/** Attribute logger */
	private static final Logger logger = LogManager.getLogger();

	/** Attribute mainTheme */
	private Clip mainTheme;

	/** Attribute playerTwoName */
	private String playerTwoName;

	/** Attribute temporalListModel */
	private DefaultListModel<Pokemon> temporalListModel = new DefaultListModel<>();

	/** Attribute playerOneSelection */
	private PlayerOneSelection playerOneSelection;

	/** Attribute listModel */
	private DefaultListModel<Pokemon> listModel = new DefaultListModel<>();

	/** Attribute listModel2 */
	private DefaultListModel<Pokemon> listModel2 = new DefaultListModel<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SpriteSelectedPlayerTwo;
    private javax.swing.ButtonGroup buttonGroupPlayerTwoSprites;
    private javax.swing.JButton jButtonRandom;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonRemoveAll;
    private javax.swing.JButton jButtonResetFilter;
    private javax.swing.JButton jButtonSelect;
    private javax.swing.JButton jButtonSelectionComplete;
    private javax.swing.JLabel jLabelAttack;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelChoseYourPokemon;
    private javax.swing.JLabel jLabelDefense;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelHealth;
    private javax.swing.JLabel jLabelPlayerName;
    private javax.swing.JLabel jLabelPlayerTwoName;
    private javax.swing.JLabel jLabelSpAttack;
    private javax.swing.JLabel jLabelSpDefense;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JList<Pokemon> jListAllPokemons;
    private javax.swing.JList<Pokemon> jListPlayerPokemons;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemLoad;
    private javax.swing.JRadioButton jRadioButtonBlue;
    private javax.swing.JRadioButton jRadioButtonFemaleRanger;
    private javax.swing.JRadioButton jRadioButtonNormalFemale;
    private javax.swing.JRadioButton jRadioButtonRanger;
    private javax.swing.JRadioButton jRadioButtonRed;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPaneTwo;
    private javax.swing.JTextField jTextFieldFilter;
    private javax.swing.JTextField jTextFieldPlayerName;
    // End of variables declaration//GEN-END:variables
	/**
	 * Creates new form PlayerTwoSelection
	 *
	 * @param playerOneSelection
	 */
	public PlayerTwoSelection(PlayerOneSelection playerOneSelection)
	{
		// --THE ORDER ITS IMPORTATNT-----
		this.initComponents();
		this.setTitle("Player Two Selection");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("./images/pokeball.png"));

		this.jLabelBackground.setIcon(new ImageIcon("./images/selectionBack2.jpg"));
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/red.png"));
		this.playerTwoName = "Player Two";
		this.jLabelPlayerName.setText(this.playerTwoName);

		this.mainTheme = playerOneSelection.getMainTheme();
		this.playerOneSelection = playerOneSelection;

		this.setResizable(false);
		this.listModel.addAll(new Application().getPokemonList());
		this.jListAllPokemons.setModel(this.listModel);
		this.jListPlayerPokemons.setModel(this.listModel2);

		this.jumpPokemonAnimationThread();

		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPlayerTwoSprites = new javax.swing.ButtonGroup();
        jLabelChoseYourPokemon = new javax.swing.JLabel();
        jButtonSelectionComplete = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonRemoveAll = new javax.swing.JButton();
        jLabelHealth = new javax.swing.JLabel();
        jLabelAttack = new javax.swing.JLabel();
        jLabelDefense = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jListAllPokemons = new javax.swing.JList<>();
        jLabelSpAttack = new javax.swing.JLabel();
        jLabelSpDefense = new javax.swing.JLabel();
        jButtonSelect = new javax.swing.JButton();
        jLabelSpeed = new javax.swing.JLabel();
        jScrollPaneTwo = new javax.swing.JScrollPane();
        jListPlayerPokemons = new javax.swing.JList<>();
        jTextFieldFilter = new javax.swing.JTextField();
        jLabelFilter = new javax.swing.JLabel();
        jButtonResetFilter = new javax.swing.JButton();
        jTextFieldPlayerName = new javax.swing.JTextField();
        jLabelPlayerTwoName = new javax.swing.JLabel();
        jLabelPlayerName = new javax.swing.JLabel();
        jRadioButtonRed = new javax.swing.JRadioButton();
        jRadioButtonBlue = new javax.swing.JRadioButton();
        SpriteSelectedPlayerTwo = new javax.swing.JLabel();
        jRadioButtonRanger = new javax.swing.JRadioButton();
        jRadioButtonFemaleRanger = new javax.swing.JRadioButton();
        jRadioButtonNormalFemale = new javax.swing.JRadioButton();
        jButtonRandom = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemLoad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelChoseYourPokemon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelChoseYourPokemon.setText("         CHOOSE YOUR POKEMON!");
        jLabelChoseYourPokemon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelChoseYourPokemon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelChoseYourPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 355, 363, 165));

        jButtonSelectionComplete.setBackground(new java.awt.Color(51, 204, 0));
        jButtonSelectionComplete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSelectionComplete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelectionComplete.setText("SELECTION COMPLETE");
        jButtonSelectionComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSelectionComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectionCompleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSelectionComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 526, -1, 47));

        jButtonRemove.setBackground(new java.awt.Color(255, 153, 102));
        jButtonRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("REMOVE");
        jButtonRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemoveMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 326, -1, -1));

        jButtonRemoveAll.setBackground(new java.awt.Color(255, 0, 51));
        jButtonRemoveAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRemoveAll.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveAll.setText("REMOVE ALL");
        jButtonRemoveAll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRemoveAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemoveAllMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonRemoveAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 326, -1, -1));

        jLabelHealth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHealth.setForeground(new java.awt.Color(0, 117, 0));
        jLabelHealth.setText("HEALTH");
        jLabelHealth.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelHealth.setOpaque(true);
        getContentPane().add(jLabelHealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 355, 150, -1));

        jLabelAttack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAttack.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAttack.setText("ATTACK");
        jLabelAttack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelAttack.setOpaque(true);
        getContentPane().add(jLabelAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 381, 150, -1));

        jLabelDefense.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDefense.setForeground(new java.awt.Color(51, 51, 255));
        jLabelDefense.setText("DEFENSE");
        jLabelDefense.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelDefense.setOpaque(true);
        getContentPane().add(jLabelDefense, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 433, 150, -1));

        jListAllPokemons.setBackground(new java.awt.Color(255, 200, 200));
        jListAllPokemons.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListAllPokemons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListAllPokemons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAllPokemonsMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jListAllPokemons);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 421, 273));

        jLabelSpAttack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpAttack.setForeground(new java.awt.Color(255, 102, 0));
        jLabelSpAttack.setText("SP-ATTACK");
        jLabelSpAttack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpAttack.setOpaque(true);
        getContentPane().add(jLabelSpAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 407, 150, -1));

        jLabelSpDefense.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpDefense.setForeground(new java.awt.Color(0, 204, 204));
        jLabelSpDefense.setText("SP-DEFENSE");
        jLabelSpDefense.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpDefense.setOpaque(true);
        getContentPane().add(jLabelSpDefense, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 459, 150, -1));

        jButtonSelect.setBackground(new java.awt.Color(51, 153, 0));
        jButtonSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSelect.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelect.setText("SELECT");
        jButtonSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSelectMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 326, -1, -1));

        jLabelSpeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpeed.setForeground(new java.awt.Color(248, 0, 243));
        jLabelSpeed.setText("SPEED");
        jLabelSpeed.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpeed.setOpaque(true);
        getContentPane().add(jLabelSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 485, 150, -1));

        jListPlayerPokemons.setBackground(new java.awt.Color(227, 227, 227));
        jListPlayerPokemons.setForeground(new java.awt.Color(0, 102, 0));
        jListPlayerPokemons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListPlayerPokemons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPlayerPokemonsMouseClicked(evt);
            }
        });
        jScrollPaneTwo.setViewportView(jListPlayerPokemons);

        getContentPane().add(jScrollPaneTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 41, 419, 273));

        jTextFieldFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFilterActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 6, 136, -1));

        jLabelFilter.setBackground(new java.awt.Color(255, 204, 102));
        jLabelFilter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFilter.setText("FILTER:");
        jLabelFilter.setOpaque(true);
        getContentPane().add(jLabelFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 9, -1, -1));

        jButtonResetFilter.setText("RESET FILTER");
        jButtonResetFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonResetFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetFilterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResetFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 6, -1, -1));

        jTextFieldPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlayerNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 6, 116, -1));

        jLabelPlayerTwoName.setBackground(new java.awt.Color(255, 204, 102));
        jLabelPlayerTwoName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPlayerTwoName.setText("Player Two Name:");
        jLabelPlayerTwoName.setOpaque(true);
        getContentPane().add(jLabelPlayerTwoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelPlayerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPlayerName.setText("       ");
        getContentPane().add(jLabelPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 9, 207, 20));

        buttonGroupPlayerTwoSprites.add(jRadioButtonRed);
        jRadioButtonRed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonRed.setSelected(true);
        jRadioButtonRed.setText("Red");
        jRadioButtonRed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRedActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 381, -1, -1));

        buttonGroupPlayerTwoSprites.add(jRadioButtonBlue);
        jRadioButtonBlue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonBlue.setText("Blue");
        jRadioButtonBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBlueActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 414, -1, -1));

        SpriteSelectedPlayerTwo.setText(" ");
        getContentPane().add(SpriteSelectedPlayerTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 355, 136, 196));

        buttonGroupPlayerTwoSprites.add(jRadioButtonRanger);
        jRadioButtonRanger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonRanger.setText("Ranger");
        jRadioButtonRanger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonRanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRangerActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonRanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 443, -1, -1));

        buttonGroupPlayerTwoSprites.add(jRadioButtonFemaleRanger);
        jRadioButtonFemaleRanger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonFemaleRanger.setText("Female Ranger");
        jRadioButtonFemaleRanger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonFemaleRanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleRangerActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonFemaleRanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 472, -1, -1));

        buttonGroupPlayerTwoSprites.add(jRadioButtonNormalFemale);
        jRadioButtonNormalFemale.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonNormalFemale.setText("Normal Female");
        jRadioButtonNormalFemale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonNormalFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNormalFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonNormalFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 499, -1, -1));

        jButtonRandom.setBackground(new java.awt.Color(255, 0, 255));
        jButtonRandom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonRandom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRandom.setText("RANDOM");
        jButtonRandom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRandomActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRandom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 30));

        jLabelBackground.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 920, 600));

        jMenu.setText("File");

        jMenuItemLoad.setText("Load State");
        jMenuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoadActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemLoad);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * Method jButtonRandomActionPerformed Used for get five random pokemons to
	 * selected pokemons
	 *
	 * @param evt
	 */
	private void jButtonRandomActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton6ActionPerformed
		int random = (int) ((Math.random() * 721) + 1);
		logger.info(random);
		List<Pokemon> randomList = new ArrayList<>();

		for (int i = 0; i < 5; i++)
		{
			random = (int) ((Math.random() * 721) + 1);
			randomList.add(this.listModel.get(random));
		}
		this.listModel2 = new DefaultListModel<>();
		this.listModel2.addAll(randomList);
		this.jListPlayerPokemons.setModel(this.listModel2);
	}// GEN-LAST:event_jButton6ActionPerformed

	/**
	 * Method jTextFieldFilterActionPerformed Used for filter the pokemon list
	 *
	 * @param evt
	 */
	private void jTextFieldFilterActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jTextField1ActionPerformed
		logger.info("Presiono Enter");
		this.temporalListModel = new DefaultListModel<>();

		for (int i = 0; i < this.listModel.size(); i++)
		{
			if (this.listModel.get(i).getName().toLowerCase().contains(this.jTextFieldFilter.getText().toLowerCase()))
			{
				this.temporalListModel.add(0, this.listModel.get(i));
			}
		}

		this.jListAllPokemons.setModel(this.temporalListModel);
	}// GEN-LAST:event_jTextField1ActionPerformed

	/**
	 * Method jButtonResetFilterActionPerformed Reset the filter
	 *
	 * @param evt
	 */
	private void jButtonResetFilterActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton5ActionPerformed
		this.jListAllPokemons.setModel(this.listModel);
		this.jTextFieldFilter.setText("");
	}// GEN-LAST:event_jButton5ActionPerformed

	/**
	 * Method jTextFieldPlayerNameActionPerformed Used for the player name with
	 * specific settings
	 *
	 * @param evt
	 */
	private void jTextFieldPlayerNameActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jTextField2ActionPerformed

		// --TRIM--FOR DELETE EMPTY NAMES AND SPACES---
		this.playerTwoName = this.jTextFieldPlayerName.getText().trim();

		// ---MAX 16 CHARS----
		if ((this.playerTwoName.length() <= 16) && !this.playerTwoName.isEmpty())
		{
			this.jLabelPlayerName.setText(this.playerTwoName);
		}
		else
		{
			// --SHOW POP UP WARNING----
			JOptionPane.showMessageDialog(null, "The selected name is too big or empty (16 chars max)");
		}

	}// GEN-LAST:event_jTextField2ActionPerformed

	/**
	 * Method jRadioButtonRedActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonRedActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton1ActionPerformed
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/red.png"));
	}// GEN-LAST:event_jRadioButton1ActionPerformed

	/**
	 * Method jRadioButtonBlueActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonBlueActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton2ActionPerformed
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/blue.png"));
	}// GEN-LAST:event_jRadioButton2ActionPerformed

	/**
	 * Method jRadioButtonRangerActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonRangerActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton3ActionPerformed
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/ranger.png"));
	}// GEN-LAST:event_jRadioButton3ActionPerformed

	/**
	 * Method jRadioButtonFemaleRangerActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonFemaleRangerActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton4ActionPerformed
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/femaleRanger.png"));
	}// GEN-LAST:event_jRadioButton4ActionPerformed

	/**
	 * Method jRadioButtonNormalFemaleActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonNormalFemaleActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton5ActionPerformed
		this.SpriteSelectedPlayerTwo.setIcon(new ImageIcon("./images/normalFemale.png"));
	}// GEN-LAST:event_jRadioButton5ActionPerformed

	/**
	 * Method jMenuItemLoadActionPerformed Used for load the state
	 *
	 * @param evt
	 */
	private void jMenuItemLoadActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jMenuItem1ActionPerformed
		logger.info("CARGAR ESTADO");
		Application application = new Application();

		// --USE OBJECT LIST FOR STORE ALL THE OBJECTS---
		List<Object> partyList = null;
		try
		{
			partyList = application.loadState();
		}
		catch (PokemonException exception)
		{
			String error = "InterruptedException";
			PlayerTwoSelection.logger.error(error, exception);
		}

		if (partyList != null)
		{
			// --IF THE LOAD IS COMPLETED , LAUNCH THE PLAYER VERSUS PLAYER WITH THE PARTY
			// LIST---
			this.mainTheme.stop();
			PlayerVersusPlayer loadedPlayerVersusPlayer = new PlayerVersusPlayer(partyList);
			loadedPlayerVersusPlayer.setVisible(true);
			logger.info(partyList);
			this.dispose();
			JOptionPane.showMessageDialog(null, "STATE DATA LOADED!");

		}
		else
		{
			// --SHOW WARNING POP UP---
			JOptionPane.showMessageDialog(null, "THE STATE IS CORRUPTED OR DONT EXISTS ANY STATE!");
		}
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	/**
	 * Method jButtonSelectionCompleteActionPerformed Used for end the player
	 * selection
	 *
	 * @param evt
	 */
	private void jButtonSelectionCompleteActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton4ActionPerformed
		this.selectButtonSound();

		// --ONLY IF THE PLAYER SELECT MORE THAN 0 POKEMONS----
		if (this.listModel2.size() > 0)
		{
			this.mainTheme.stop();
			PlayerVersusPlayer playerVersusPlayer = new PlayerVersusPlayer(this);
			playerVersusPlayer.setVisible(true);
			this.dispose();
		}
		else
		{
			// ---SHOW POP UP WARNING---
			JOptionPane.showMessageDialog(this, "!OH , YOU NEED CHOOSE MINIMUM 1 POKEMON!");
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	/**
	 * Method jButtonRemoveMouseClicked Used for remove the selected pokemon
	 *
	 * @param evt
	 */
	private void jButtonRemoveMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton2MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListPlayerPokemons.getSelectedValue();

		if (this.listModel2.contains(selectedPokemon))
		{
			for (int i = 0; i < this.listModel2.size(); i++)
			{
				Pokemon temporalPokemon = this.listModel2.get(i);
				if (temporalPokemon.equals(selectedPokemon))
				{
					this.listModel2.remove(i);
				}
			}
		}
	}// GEN-LAST:event_jButton2MouseClicked

	/**
	 * Method jButtonRemoveAllMouseClicked Used for remove all the pokemons seleted
	 *
	 * @param evt
	 */
	private void jButtonRemoveAllMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton3MouseClicked
		this.selectButtonSound();
		this.listModel2.removeAllElements();
	}// GEN-LAST:event_jButton3MouseClicked

	/**
	 * Method jListAllPokemonsMouseClicked Used for get the pokemon selected data
	 * from the all pokemon list to labels
	 *
	 * @param evt
	 */
	private void jListAllPokemonsMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jList1MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListAllPokemons.getSelectedValue();
		ImageIcon icon = new ImageIcon(selectedPokemon.getPokeImage());
		this.jLabelChoseYourPokemon.setIcon(icon);
		this.jLabelChoseYourPokemon.setText(selectedPokemon.getName());

		this.jLabelHealth.setText("Health: " + selectedPokemon.getHealth());
		this.jLabelAttack.setText("Attack: " + selectedPokemon.getAttack());
		this.jLabelDefense.setText("SP-Attack: " + selectedPokemon.getSpAttack());
		this.jLabelSpAttack.setText("Defense: " + selectedPokemon.getDefense());
		this.jLabelSpDefense.setText("SP-Defense: " + selectedPokemon.getSpDefense());
		this.jLabelSpeed.setText("Speed: " + selectedPokemon.getSpeed());
		this.repaint();

	}// GEN-LAST:event_jList1MouseClicked

	/**
	 * Method jButtonSelectMouseClicked Used for get the pokemon selected from the
	 * all pokemon list
	 *
	 * @param evt
	 */
	private void jButtonSelectMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton1MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListAllPokemons.getSelectedValue();

		// --IF THE POKEMON SELECTED ALRREADY EXIST ON THE SELECTED POKEMONS LAUNCH POP
		// UP WARNING---
		if (this.listModel2.contains(selectedPokemon))
		{
			JOptionPane.showMessageDialog(this, "You alrready select " + selectedPokemon.getName());
		}
		else if (this.listModel2.size() < 5)
		{
			this.listModel2.add(0, selectedPokemon);
			this.jListPlayerPokemons.setModel(this.listModel2);
			logger.info(this.listModel2);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "You have 5 Pokemons selected!");
		}
	}// GEN-LAST:event_jButton1MouseClicked

	/**
	 * Method jListPlayerPokemonsMouseClicked Used for get the pokemon selected data
	 * from the selected pokemon list to labels
	 *
	 * @param evt
	 */
	private void jListPlayerPokemonsMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jList2MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListPlayerPokemons.getSelectedValue();
		if (selectedPokemon != null)
		{
			ImageIcon icon = new ImageIcon(selectedPokemon.getPokeImage());
			this.jLabelChoseYourPokemon.setIcon(icon);
			this.jLabelChoseYourPokemon.setText(selectedPokemon.getName());

			this.jLabelHealth.setText("Health: " + selectedPokemon.getHealth());
			this.jLabelAttack.setText("Attack: " + selectedPokemon.getAttack());
			this.jLabelDefense.setText("SP-Attack: " + selectedPokemon.getSpAttack());
			this.jLabelSpAttack.setText("Defense: " + selectedPokemon.getDefense());
			this.jLabelSpDefense.setText("SP-Defense: " + selectedPokemon.getSpDefense());
			this.jLabelSpeed.setText("Speed: " + selectedPokemon.getSpeed());
			this.repaint();
		}
	}// GEN-LAST:event_jList2MouseClicked

	/**
	 * Method selectButtonSound The buttons sound
	 */
	private void selectButtonSound()
	{

		AudioInputStream audioInputStream = null;
		try
		{
			audioInputStream = AudioSystem.getAudioInputStream(new File("./audio/butonSelect.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}
		catch (UnsupportedAudioFileException exception)
		{
			String error = "UnsupportedAudioFileException";
			PlayerTwoSelection.logger.error(error, exception);
		}
		catch (IOException exception)
		{
			String error = "IOException";
			PlayerTwoSelection.logger.error(error, exception);
		}
		catch (LineUnavailableException exception)
		{
			String error = "LineUnavailableException";
			PlayerTwoSelection.logger.error(error, exception);
		}
		finally
		{
			try
			{
				audioInputStream.close();
			}
			catch (IOException exception)
			{
				String error = "IOException";
				PlayerTwoSelection.logger.error(error, exception);
			}
		}
	}

	/**
	 * Method jumpPokemonAnimationThread The jump pokemon animation
	 */
	private void jumpPokemonAnimationThread()
	{
		Thread jumpThread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				int speed = 1;

				// --INFINITE LOOP , FOR INFINITE ANIMATION----
				while (true)
				{
					for (int i = 0; i < 10; i++)
					{

						PlayerTwoSelection.this.jLabelChoseYourPokemon.setLocation(
								PlayerTwoSelection.this.jLabelChoseYourPokemon.getX(),
								PlayerTwoSelection.this.jLabelChoseYourPokemon.getY() + speed);
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException exception)
						{
							String error = "InterruptedException";
							PlayerTwoSelection.logger.error(error, exception);
						}
					}
					for (int i = 0; i < 10; i++)
					{

						PlayerTwoSelection.this.jLabelChoseYourPokemon.setLocation(
								PlayerTwoSelection.this.jLabelChoseYourPokemon.getX(),
								PlayerTwoSelection.this.jLabelChoseYourPokemon.getY() + (speed * -1));
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException exception)
						{
							String error = "InterruptedException";
							PlayerTwoSelection.logger.error(error, exception);
						}
					}
				}
			}
		});
		jumpThread.start();
	}

}