package com.gitcj.game;

import javax.swing.*;
public class GameWindow extends JFrame {
    public void launch() {
        this.setVisible(true);
        this.setSize(854, 480);
        this.setLocationRelativeTo(null);
        this.setTitle("Genius_Invokation_TCJ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lblBackground = new JLabel("");
        lblBackground.setIcon(new ImageIcon(GameWindow.class.getResource("1.png")));
    }
}

