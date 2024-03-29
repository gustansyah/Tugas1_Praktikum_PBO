/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustansyah.javaswing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gustansyah
 */
public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("Login Page");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));
        
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(9,1,10,10));
        add(loginPanel);
        
        loginPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        

        JLabel welcomeLabel = new JLabel("Selamat Datang!");
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(24.0f));
        loginPanel.add(welcomeLabel);
        
        JLabel instructionLabel = new JLabel("Silakan masuk untuk melanjutkan.");
        loginPanel.add(instructionLabel);

        JTextField usernameField = new JTextField();
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);

        JPasswordField passwordField = new JPasswordField();
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);

        // Gender selection
        
        JLabel genderLabel = new JLabel("Jenis Kelamin:");
        loginPanel.add(genderLabel);
        
        
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new GridLayout(1,2));
        
        loginPanel.add(genderPanel);
        
        JRadioButton maleButton = new JRadioButton("Laki-laki");
        JRadioButton femaleButton = new JRadioButton("Perempuan");

        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            // Handle login
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();

            // Implement your authentication logic here
            // For example, check if username and password match a valid user

            System.out.println(username + ": " + String.valueOf(password));
        });

        loginPanel.add(genderPanel);
        loginPanel.add(loginButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage frame = new LoginPage();
            frame.setVisible(true);
        });
    }
}