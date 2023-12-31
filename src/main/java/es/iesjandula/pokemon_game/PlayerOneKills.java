/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.iesjandula.pokemon_game;

import java.awt.Toolkit;
import java.util.List;

import javax.swing.ImageIcon;

import es.iesjandula.pokemon_game.models.Pokemon;

/**
 *
 * @author David Martinez Flores
 */
public class PlayerOneKills extends javax.swing.JFrame
{
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabelPlayerOne;
	private javax.swing.JLabel jLabelPokemonFive;
	private javax.swing.JLabel jLabelPokemonFour;
	private javax.swing.JLabel jLabelPokemonOne;
	private javax.swing.JLabel jLabelPokemonThree;
	private javax.swing.JLabel jLabelPokemonTwo;
	// End of variables declaration//GEN-END:variables

	/**
	 * Creates new form PlayerOneKills
	 */
	public PlayerOneKills(List<Pokemon> listPlayer, int x, int y)
	{
		// ---THE ORDER ITS IMPORTANT----

		this.initComponents();
		this.setTitle("Player One Cards Defeated");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("./images/pokeball.png"));

		this.setResizable(false);
		this.setLocation(x, y);
		this.jLabelPokemonOne.setIcon(new ImageIcon("./images/0.png"));
		this.jLabelPokemonTwo.setIcon(new ImageIcon("./images/0.png"));
		this.jLabelPokemonThree.setIcon(new ImageIcon("./images/0.png"));
		this.jLabelPokemonFour.setIcon(new ImageIcon("./images/0.png"));
		this.jLabelPokemonFive.setIcon(new ImageIcon("./images/0.png"));

		// ---USING THE LIST SIZE FOR PUT IMAGE ICONS ON THE POKEMON BOXES (LABELS)
		if (listPlayer.size() > 0)
		{
			this.jLabelPokemonOne.setIcon(new ImageIcon(listPlayer.get(0).getPokeImage()));
			this.jLabelPokemonOne.setToolTipText(listPlayer.get(0).getSpeed() + "");
		}
		if (listPlayer.size() > 1)
		{
			this.jLabelPokemonOne.setIcon(new ImageIcon(listPlayer.get(0).getPokeImage()));
			this.jLabelPokemonTwo.setIcon(new ImageIcon(listPlayer.get(1).getPokeImage()));
			this.jLabelPokemonOne.setToolTipText(listPlayer.get(0).getSpeed() + "");
			this.jLabelPokemonTwo.setToolTipText(listPlayer.get(1).getSpeed() + "");
		}
		if (listPlayer.size() > 2)
		{
			this.jLabelPokemonOne.setIcon(new ImageIcon(listPlayer.get(0).getPokeImage()));
			this.jLabelPokemonTwo.setIcon(new ImageIcon(listPlayer.get(1).getPokeImage()));
			this.jLabelPokemonThree.setIcon(new ImageIcon(listPlayer.get(2).getPokeImage()));
			this.jLabelPokemonOne.setToolTipText(listPlayer.get(0).getSpeed() + "");
			this.jLabelPokemonTwo.setToolTipText(listPlayer.get(1).getSpeed() + "");
			this.jLabelPokemonThree.setToolTipText(listPlayer.get(2).getSpeed() + "");

		}
		if (listPlayer.size() > 3)
		{
			this.jLabelPokemonOne.setIcon(new ImageIcon(listPlayer.get(0).getPokeImage()));
			this.jLabelPokemonTwo.setIcon(new ImageIcon(listPlayer.get(1).getPokeImage()));
			this.jLabelPokemonThree.setIcon(new ImageIcon(listPlayer.get(2).getPokeImage()));
			this.jLabelPokemonFour.setIcon(new ImageIcon(listPlayer.get(3).getPokeImage()));
			this.jLabelPokemonOne.setToolTipText(listPlayer.get(0).getSpeed() + "");
			this.jLabelPokemonTwo.setToolTipText(listPlayer.get(1).getSpeed() + "");
			this.jLabelPokemonThree.setToolTipText(listPlayer.get(2).getSpeed() + "");
			this.jLabelPokemonFour.setToolTipText(listPlayer.get(3).getSpeed() + "");

		}
		if (listPlayer.size() > 4)
		{
			this.jLabelPokemonOne.setIcon(new ImageIcon(listPlayer.get(0).getPokeImage()));
			this.jLabelPokemonTwo.setIcon(new ImageIcon(listPlayer.get(1).getPokeImage()));
			this.jLabelPokemonThree.setIcon(new ImageIcon(listPlayer.get(2).getPokeImage()));
			this.jLabelPokemonFour.setIcon(new ImageIcon(listPlayer.get(3).getPokeImage()));
			this.jLabelPokemonFive.setIcon(new ImageIcon(listPlayer.get(4).getPokeImage()));
			this.jLabelPokemonOne.setToolTipText(listPlayer.get(0).getSpeed() + "");
			this.jLabelPokemonTwo.setToolTipText(listPlayer.get(1).getSpeed() + "");
			this.jLabelPokemonThree.setToolTipText(listPlayer.get(2).getSpeed() + "");
			this.jLabelPokemonFour.setToolTipText(listPlayer.get(3).getSpeed() + "");
			this.jLabelPokemonFive.setToolTipText(listPlayer.get(4).getSpeed() + "");
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		this.jLabelPokemonOne = new javax.swing.JLabel();
		this.jLabelPokemonThree = new javax.swing.JLabel();
		this.jLabelPokemonFour = new javax.swing.JLabel();
		this.jLabelPokemonFive = new javax.swing.JLabel();
		this.jLabelPokemonTwo = new javax.swing.JLabel();
		this.jLabelPlayerOne = new javax.swing.JLabel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		this.jLabelPokemonOne.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		this.jLabelPokemonOne.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

		this.jLabelPokemonThree.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		this.jLabelPokemonThree.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

		this.jLabelPokemonFour.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		this.jLabelPokemonFour.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

		this.jLabelPokemonFive.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		this.jLabelPokemonFive.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

		this.jLabelPokemonTwo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		this.jLabelPokemonTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

		this.jLabelPlayerOne.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		this.jLabelPlayerOne.setForeground(new java.awt.Color(255, 0, 0));
		this.jLabelPlayerOne.setText("CARDS DEFEATED BY PLAYER ONE");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
		this.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(103, 103, 103)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(this.jLabelPokemonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelPokemonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelPokemonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelPokemonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(this.jLabelPokemonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addGap(46, 46, 46).addComponent(this.jLabelPlayerOne)))
				.addContainerGap(53, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap(17, Short.MAX_VALUE).addComponent(this.jLabelPlayerOne)
				.addGap(18, 18, 18)
				.addComponent(this.jLabelPokemonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(this.jLabelPokemonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18)
				.addComponent(this.jLabelPokemonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(12, 12, 12)
				.addComponent(this.jLabelPokemonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18).addComponent(this.jLabelPokemonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
						javax.swing.GroupLayout.PREFERRED_SIZE)));

		this.pack();
	}// </editor-fold>//GEN-END:initComponents
}
