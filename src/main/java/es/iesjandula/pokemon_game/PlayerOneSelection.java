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
public class PlayerOneSelection extends javax.swing.JFrame implements Serializable
{
	/** Attribute logger */
	private static final Logger logger = LogManager.getLogger();

	/** Attribute playerOneName */
	private String playerOneName;

	/** Attribute mainTheme */
	private Clip mainTheme;

	/** Attribute temporalListModel */
	private DefaultListModel<Pokemon> temporalListModel = new DefaultListModel<>();

	/** Attribute listModel */
	private DefaultListModel<Pokemon> listModel = new DefaultListModel<>();

	/** Attribute listModel2 */
	private DefaultListModel<Pokemon> listModel2 = new DefaultListModel<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SpriteSelectedPlayerOne;
    private javax.swing.ButtonGroup buttonGroupPlayerOneSprite;
    private javax.swing.JButton jButtonRandom;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonRemoveAll;
    private javax.swing.JButton jButtonResetFilter;
    private javax.swing.JButton jButtonSelect;
    private javax.swing.JButton jButtonSelectionComplete;
    private javax.swing.JLabel jLabelAttack;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelChoseYourPokemon;
    private javax.swing.JLabel jLabelDeffense;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelHelath;
    private javax.swing.JLabel jLabelPlayerName;
    private javax.swing.JLabel jLabelPlayerOneName;
    private javax.swing.JLabel jLabelSpAttack;
    private javax.swing.JLabel jLabelSpDefense;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JList<Pokemon> jListAllPokes;
    private javax.swing.JList<Pokemon> jListSelectedPokes;
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
	 * Creates new form MainJFrmae
	 *
	 * @param clip
	 */
	public PlayerOneSelection(Clip clip)
	{
		// ---THE ORDER ITS IMPORTANT---
		this.initComponents();
		this.setTitle("Player One Selection");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("./images/pokeball.png"));

		this.jLabelBackground.setIcon(new ImageIcon("./images/selectionBack2.jpg"));
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/red.png"));
		this.playerOneName = "Player One";
		this.jLabelPlayerName.setText(this.playerOneName);
		this.listModel.addAll(this.loadAllPokemons());
		this.jListAllPokes.setModel(this.listModel);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.mainTheme = clip;
		this.jumpPokemonAnimationThread();
	}

	/**
	 * Method loadAllPokemons Load the pokemons from Application
	 *
	 * @return List<Pokemon>
	 */
	private List<Pokemon> loadAllPokemons()
	{
		Application application = new Application();

		return application.getPokemonList();
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
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPlayerOneSprite = new javax.swing.ButtonGroup();
        jScrollPane = new javax.swing.JScrollPane();
        jListAllPokes = new javax.swing.JList<>();
        jButtonSelect = new javax.swing.JButton();
        jScrollPaneTwo = new javax.swing.JScrollPane();
        jListSelectedPokes = new javax.swing.JList<>();
        jLabelChoseYourPokemon = new javax.swing.JLabel();
        jButtonRemove = new javax.swing.JButton();
        jButtonRemoveAll = new javax.swing.JButton();
        jLabelHelath = new javax.swing.JLabel();
        jLabelAttack = new javax.swing.JLabel();
        jLabelDeffense = new javax.swing.JLabel();
        jLabelSpAttack = new javax.swing.JLabel();
        jLabelSpDefense = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jButtonSelectionComplete = new javax.swing.JButton();
        jTextFieldFilter = new javax.swing.JTextField();
        jLabelFilter = new javax.swing.JLabel();
        jButtonResetFilter = new javax.swing.JButton();
        jTextFieldPlayerName = new javax.swing.JTextField();
        jLabelPlayerOneName = new javax.swing.JLabel();
        jLabelPlayerName = new javax.swing.JLabel();
        jRadioButtonRed = new javax.swing.JRadioButton();
        jRadioButtonBlue = new javax.swing.JRadioButton();
        SpriteSelectedPlayerOne = new javax.swing.JLabel();
        jRadioButtonRanger = new javax.swing.JRadioButton();
        jRadioButtonFemaleRanger = new javax.swing.JRadioButton();
        jRadioButtonNormalFemale = new javax.swing.JRadioButton();
        jButtonRandom = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuItemLoad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListAllPokes.setBackground(new java.awt.Color(200, 252, 255));
        jListAllPokes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jListAllPokes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListAllPokes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAllPokesMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jListAllPokes);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 421, 273));

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

        jListSelectedPokes.setBackground(new java.awt.Color(227, 227, 227));
        jListSelectedPokes.setForeground(new java.awt.Color(0, 102, 0));
        jListSelectedPokes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListSelectedPokes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListSelectedPokesMouseClicked(evt);
            }
        });
        jScrollPaneTwo.setViewportView(jListSelectedPokes);

        getContentPane().add(jScrollPaneTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 41, 419, 273));

        jLabelChoseYourPokemon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelChoseYourPokemon.setText("         CHOOSE YOUR POKEMON!");
        jLabelChoseYourPokemon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelChoseYourPokemon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelChoseYourPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 355, 363, 165));

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
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 326, -1, -1));

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
        getContentPane().add(jButtonRemoveAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 326, -1, -1));

        jLabelHelath.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHelath.setForeground(new java.awt.Color(0, 117, 0));
        jLabelHelath.setText("HEALTH");
        jLabelHelath.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelHelath.setOpaque(true);
        getContentPane().add(jLabelHelath, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 355, 170, -1));

        jLabelAttack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAttack.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAttack.setText("ATTACK");
        jLabelAttack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelAttack.setOpaque(true);
        getContentPane().add(jLabelAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 381, 160, -1));

        jLabelDeffense.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDeffense.setForeground(new java.awt.Color(51, 51, 255));
        jLabelDeffense.setText("DEFENSE");
        jLabelDeffense.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelDeffense.setOpaque(true);
        getContentPane().add(jLabelDeffense, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 433, 170, -1));

        jLabelSpAttack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpAttack.setForeground(new java.awt.Color(255, 102, 0));
        jLabelSpAttack.setText("SP-ATTACK");
        jLabelSpAttack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpAttack.setOpaque(true);
        getContentPane().add(jLabelSpAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 407, 170, -1));

        jLabelSpDefense.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpDefense.setForeground(new java.awt.Color(0, 204, 204));
        jLabelSpDefense.setText("SP-DEFENSE");
        jLabelSpDefense.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpDefense.setOpaque(true);
        getContentPane().add(jLabelSpDefense, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 459, 170, -1));

        jLabelSpeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSpeed.setForeground(new java.awt.Color(248, 0, 243));
        jLabelSpeed.setText("SPEED");
        jLabelSpeed.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabelSpeed.setOpaque(true);
        getContentPane().add(jLabelSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 485, 170, -1));

        jButtonSelectionComplete.setBackground(new java.awt.Color(51, 204, 0));
        jButtonSelectionComplete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSelectionComplete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelectionComplete.setText("SELECTION COMPLETE");
        jButtonSelectionComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSelectionComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSelectionCompleteMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSelectionComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 526, -1, 46));

        jTextFieldFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFilterActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 6, 136, -1));

        jLabelFilter.setBackground(new java.awt.Color(255, 204, 102));
        jLabelFilter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelFilter.setText("FILTER:");
        jLabelFilter.setOpaque(true);
        getContentPane().add(jLabelFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 9, -1, -1));

        jButtonResetFilter.setText("RESET FILTER");
        jButtonResetFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonResetFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetFilterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResetFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 6, -1, -1));

        jTextFieldPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlayerNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 6, 116, -1));

        jLabelPlayerOneName.setBackground(new java.awt.Color(255, 204, 102));
        jLabelPlayerOneName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPlayerOneName.setText("Player One Name:");
        jLabelPlayerOneName.setOpaque(true);
        getContentPane().add(jLabelPlayerOneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelPlayerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPlayerName.setText("       ");
        getContentPane().add(jLabelPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 9, 207, 20));

        buttonGroupPlayerOneSprite.add(jRadioButtonRed);
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

        buttonGroupPlayerOneSprite.add(jRadioButtonBlue);
        jRadioButtonBlue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonBlue.setText("Blue");
        jRadioButtonBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBlueActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 414, -1, -1));

        SpriteSelectedPlayerOne.setText(" ");
        getContentPane().add(SpriteSelectedPlayerOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 355, 136, 196));

        buttonGroupPlayerOneSprite.add(jRadioButtonRanger);
        jRadioButtonRanger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonRanger.setText("Ranger");
        jRadioButtonRanger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonRanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRangerActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonRanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 443, -1, -1));

        buttonGroupPlayerOneSprite.add(jRadioButtonFemaleRanger);
        jRadioButtonFemaleRanger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButtonFemaleRanger.setText("Female Ranger");
        jRadioButtonFemaleRanger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonFemaleRanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleRangerActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonFemaleRanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 472, -1, -1));

        buttonGroupPlayerOneSprite.add(jRadioButtonNormalFemale);
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
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 610));

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
	 * Method jButtonRandomActionPerformed Generate five random pokemons to the
	 * player selection pokemons
	 *
	 * @param evt
	 */
	private void jButtonRandomActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton6ActionPerformed
		int random = (int) ((Math.random() * 721) + 1);
		PlayerOneSelection.logger.info(random);
		List<Pokemon> randomList = new ArrayList<>();

		for (int i = 0; i < 5; i++)
		{
			random = (int) ((Math.random() * 721) + 1);
			randomList.add(this.listModel.get(random));
		}
		this.listModel2 = new DefaultListModel<>();
		this.listModel2.addAll(randomList);
		this.jListSelectedPokes.setModel(this.listModel2);
	}// GEN-LAST:event_jButton6ActionPerformed

	/**
	 * Method jTextFieldFilterActionPerformed That is used for filter the principal
	 * pokemon list
	 *
	 * @param evt
	 */
	private void jTextFieldFilterActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jTextField1ActionPerformed
		PlayerOneSelection.logger.info("Presiono Enter");
		this.temporalListModel = new DefaultListModel<>();

		for (int i = 0; i < this.listModel.size(); i++)
		{
			if (this.listModel.get(i).getName().toLowerCase().contains(this.jTextFieldFilter.getText().toLowerCase()))
			{
				this.temporalListModel.add(0, this.listModel.get(i));
			}
		}

		this.jListAllPokes.setModel(this.temporalListModel);
	}// GEN-LAST:event_jTextField1ActionPerformed

	/**
	 * Method jButtonResetFilterActionPerformed Used for reset the filters
	 *
	 * @param evt
	 */
	private void jButtonResetFilterActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jButton5ActionPerformed
		this.jListAllPokes.setModel(this.listModel);
		this.jTextFieldFilter.setText("");
	}// GEN-LAST:event_jButton5ActionPerformed

	/**
	 * Method jTextFieldPlayerNameActionPerformed Used for set the player name but
	 * with specific settings
	 *
	 * @param evt
	 */
	private void jTextFieldPlayerNameActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jTextField2ActionPerformed

		// --TRIM FOR DELETE EMPTY NAMES AND SPACES---
		this.playerOneName = this.jTextFieldPlayerName.getText().trim();

		//
		if ((this.playerOneName.length() <= 16) && !this.playerOneName.isEmpty())
		{
			this.jLabelPlayerName.setText(this.playerOneName);
		}
		else
		{
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
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/red.png"));
	}// GEN-LAST:event_jRadioButton1ActionPerformed

	/**
	 * Method jRadioButtonBlueActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonBlueActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton2ActionPerformed
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/blue.png"));
	}// GEN-LAST:event_jRadioButton2ActionPerformed

	/**
	 * Method jRadioButtonRangerActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonRangerActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton3ActionPerformed
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/ranger.png"));
	}// GEN-LAST:event_jRadioButton3ActionPerformed

	/**
	 * Method jRadioButtonFemaleRangerActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonFemaleRangerActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton4ActionPerformed
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/femaleRanger.png"));
	}// GEN-LAST:event_jRadioButton4ActionPerformed

	/**
	 * Method jRadioButtonNormalFemaleActionPerformed Change the sprite
	 *
	 * @param evt
	 */
	private void jRadioButtonNormalFemaleActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jRadioButton5ActionPerformed
		this.SpriteSelectedPlayerOne.setIcon(new ImageIcon("./images/normalFemale.png"));
	}// GEN-LAST:event_jRadioButton5ActionPerformed

	/**
	 * Method jMenuItemLoadActionPerformed Used for load the saved state
	 *
	 * @param evt
	 */
	private void jMenuItemLoadActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_jMenuItem1ActionPerformed
		PlayerOneSelection.logger.info("CARGAR ESTADO");
		Application application = new Application();

		// ---USE A LIST OF OBJECTS TO LOAD ALL----
		List<Object> partyList = null;
		try
		{
			partyList = application.loadState();
		}
		catch (PokemonException exception)
		{
			String error = "An Error Ocurred on the application loading State";
			PlayerOneSelection.logger.error(error, exception);
		}

		if (partyList != null)
		{
			// ---IF THE LOAD ITS COMPLETED , LAUNCH PLAYER VERSUS PLAYER WINDOW WITH THE
			// PARTY LIST---
			this.mainTheme.stop();
			PlayerVersusPlayer loadedPlayerVersusPlayer = new PlayerVersusPlayer(partyList);
			loadedPlayerVersusPlayer.setVisible(true);
			PlayerOneSelection.logger.info(partyList);
			this.dispose();
			JOptionPane.showMessageDialog(null, "STATE DATA LOADED!");

		}
		else
		{
			JOptionPane.showMessageDialog(null, "THE STATE IS CORRUPTED OR DONT EXISTS ANY STATE!");
		}
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	/**
	 * Method jButtonRemoveMouseClicked Remove selected pokemon
	 *
	 * @param evt
	 */
	private void jButtonRemoveMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton2MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListSelectedPokes.getSelectedValue();

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
	 * Method jButtonRemoveAllMouseClicked Remove all selected pokemons
	 *
	 * @param evt
	 */
	private void jButtonRemoveAllMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton3MouseClicked
		this.selectButtonSound();
		this.listModel2.removeAllElements();
	}// GEN-LAST:event_jButton3MouseClicked

	/**
	 * Method jListAllPokesMouseClicked Getting the pokemon selected on all pokemon
	 * list to show the data on the labels
	 *
	 * @param evt
	 */
	private void jListAllPokesMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jList1MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListAllPokes.getSelectedValue();
		ImageIcon icon = new ImageIcon(selectedPokemon.getPokeImage());
		this.jLabelChoseYourPokemon.setIcon(icon);
		this.jLabelChoseYourPokemon.setText(selectedPokemon.getName());

		this.jLabelHelath.setText("Health: " + selectedPokemon.getHealth());
		this.jLabelAttack.setText("Attack: " + selectedPokemon.getAttack());
		this.jLabelDeffense.setText("SP-Attack: " + selectedPokemon.getSpAttack());
		this.jLabelSpAttack.setText("Defense: " + selectedPokemon.getDefense());
		this.jLabelSpDefense.setText("SP-Defense: " + selectedPokemon.getSpDefense());
		this.jLabelSpeed.setText("Speed: " + selectedPokemon.getSpeed());
		this.repaint();

	}// GEN-LAST:event_jList1MouseClicked

	/**
	 * Method jListSelectedPokesMouseClicked Getting the pokemon selected on
	 * selected pokemon list to show the data on the labels
	 *
	 * @param evt
	 */
	private void jListSelectedPokesMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jList2MouseClicked
		Pokemon selectedPokemon = this.jListSelectedPokes.getSelectedValue();
		this.selectButtonSound();
		if (selectedPokemon != null)
		{
			ImageIcon icon = new ImageIcon(selectedPokemon.getPokeImage());
			this.jLabelChoseYourPokemon.setIcon(icon);
			this.jLabelChoseYourPokemon.setText(selectedPokemon.getName());

			this.jLabelHelath.setText("Health: " + selectedPokemon.getHealth());
			this.jLabelAttack.setText("Attack: " + selectedPokemon.getAttack());
			this.jLabelDeffense.setText("SP-Attack: " + selectedPokemon.getSpAttack());
			this.jLabelSpAttack.setText("Defense: " + selectedPokemon.getDefense());
			this.jLabelSpDefense.setText("SP-Defense: " + selectedPokemon.getSpDefense());
			this.jLabelSpeed.setText("Speed: " + selectedPokemon.getSpeed());
			this.repaint();
		}
	}// GEN-LAST:event_jList2MouseClicked

	/**
	 * Method jButtonSelectionCompleteMouseClicked Used for end the player one
	 * selection
	 *
	 * @param evt
	 */
	private void jButtonSelectionCompleteMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton4MouseClicked
		this.selectButtonSound();
		// --ONLY PASS IF THE POKEMONS ARE MORE THAN 0---
		if (this.listModel2.size() > 0)
		{
			PlayerTwoSelection playerTwoSelection = new PlayerTwoSelection(this);
			playerTwoSelection.setVisible(true);
			this.dispose();
		}
		else
		{
			// ---SHOW POP UP WARNING---
			JOptionPane.showMessageDialog(this, "!OH , YOU NEED CHOOSE MINIMUM 1 POKEMON!");
			this.jLabelPlayerName.setText("Player One");
		}
	}// GEN-LAST:event_jButton4MouseClicked

	/**
	 * Method jButtonSelectMouseClicked Get the selected pokemon
	 *
	 * @param evt
	 */
	private void jButtonSelectMouseClicked(java.awt.event.MouseEvent evt)
	{// GEN-FIRST:event_jButton1MouseClicked
		this.selectButtonSound();
		Pokemon selectedPokemon = this.jListAllPokes.getSelectedValue();

		// --IF THE SELECTED POKEMON ARREADY EXIST ON SELECTED POKEMONS , SHOW POP UP
		// WARNING
		if (this.listModel2.contains(selectedPokemon))
		{
			JOptionPane.showMessageDialog(this, "You alrready select " + selectedPokemon.getName());
		}
		else if (this.listModel2.size() < 5)
		{
			this.listModel2.add(0, selectedPokemon);
			this.jListSelectedPokes.setModel(this.listModel2);
			PlayerOneSelection.logger.info(this.listModel2);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "You have 5 Pokemons selected!");
		}

	}// GEN-LAST:event_jButton1MouseClicked

	/**
	 * Method selectButtonSound The button sounds
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
			PlayerOneSelection.logger.error(error, exception);
		}
		catch (IOException exception)
		{
			String error = "IOException";
			PlayerOneSelection.logger.error(error, exception);
		}
		catch (LineUnavailableException exception)
		{
			String error = "LineUnavailableException";
			PlayerOneSelection.logger.error(error, exception);
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
				PlayerOneSelection.logger.error(error, exception);
			}
		}
	}

	/**
	 * Method jumpPokemonAnimationThread Jump pokemon animation
	 */
	private void jumpPokemonAnimationThread()
	{
		Thread jumpThread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				int speed = 1;
				// ---INFINITE LOOP FOR INFINITE ANIMATION---
				while (true)
				{
					for (int i = 0; i < 10; i++)
					{

						PlayerOneSelection.this.jLabelChoseYourPokemon.setLocation(
								PlayerOneSelection.this.jLabelChoseYourPokemon.getX(),
								PlayerOneSelection.this.jLabelChoseYourPokemon.getY() + speed);
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException exception)
						{
							String error = "InterruptedException";
							PlayerOneSelection.logger.error(error, exception);
						}
					}
					for (int i = 0; i < 10; i++)
					{

						PlayerOneSelection.this.jLabelChoseYourPokemon.setLocation(
								PlayerOneSelection.this.jLabelChoseYourPokemon.getX(),
								PlayerOneSelection.this.jLabelChoseYourPokemon.getY() + (speed * -1));
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException exception)
						{
							String error = "InterruptedException";
							PlayerOneSelection.logger.error(error, exception);
						}
					}
				}
			}
		});
		jumpThread.start();
	}
}