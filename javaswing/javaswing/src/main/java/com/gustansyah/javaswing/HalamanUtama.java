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
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gustansyah
 */
public class HalamanUtama extends JFrame {
    
    public HalamanUtama(){
        setTitle("Halaman Utama");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1));
        
        JPanel mPanel = new JPanel();
        
        
        mPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        mPanel.setLayout(new GridLayout(12, 1,10,10));
        add(mPanel);

        JLabel welcomeLabel = new JLabel("Welcome, [Mr./Mrs.][Username]!");
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(24.0f));
        mPanel.add(welcomeLabel);
        
        JLabel instructionLabel = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
        mPanel.add(instructionLabel);
        
        JLabel panjangLabel = new JLabel("Panjang");
        JLabel lebarLabel = new JLabel("Lebar");
        JLabel tinggiLabel = new JLabel("Tinggi");
        JTextField panjangField = new JTextField();
        JTextField lebarField = new JTextField();
        JTextField tinggiField = new JTextField();
        
        JPanel panjangPanel = new JPanel();
        panjangPanel.setLayout(new GridLayout(1,2));
        mPanel.add(panjangPanel);
        
        JPanel lebarPanel = new JPanel();
        lebarPanel.setLayout(new GridLayout(1,2));
        mPanel.add(lebarPanel);
        
        JPanel tinggiPanel = new JPanel();
        tinggiPanel.setLayout(new GridLayout(1,2));
        mPanel.add(tinggiPanel);
        
        
        
        
        
        panjangPanel.add(panjangLabel);
        panjangPanel.add(panjangField);
        lebarPanel.add(lebarLabel);
        lebarPanel.add(lebarField);
        tinggiPanel.add(tinggiLabel);
        tinggiPanel.add(tinggiField);
        
        JButton hitungButton = new JButton("Hitung");
        JButton resetButton = new JButton("Reset");
        
        mPanel.add(hitungButton);
        mPanel.add(resetButton);
        
        JLabel hasilLabel = new JLabel("Hasil");
        hasilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mPanel.add(hasilLabel);
        
        JPanel luasPanel = new JPanel();
        luasPanel.setLayout(new GridLayout(1,2));
        mPanel.add(luasPanel);
        
        JPanel kelilingPanel = new JPanel();
        kelilingPanel.setLayout(new GridLayout(1,2));
        mPanel.add(kelilingPanel);
        
        JPanel volumePanel = new JPanel();
        volumePanel.setLayout(new GridLayout(1,2));
        mPanel.add(volumePanel);
        
        JPanel luasPermukaanPanel = new JPanel();
        luasPermukaanPanel.setLayout(new GridLayout(1,2));
        mPanel.add(luasPermukaanPanel);
        
        JLabel luasLabel = new JLabel("Luas Persegi");
        JLabel kelilingLabel = new JLabel("Keliling Persegi");
        JLabel volumeLabel = new JLabel("Volume Balok");
        JLabel luasPermukaanLabel = new JLabel("Luas Permukaan Balok");
        JLabel luasText = new JLabel("[Hasil Berupa Angka]");
        JLabel kelilingText = new JLabel("[Hasil Berupa Angka]");
        JLabel volumeText = new JLabel("[Hasil Berupa Angka]");
        JLabel luasPermukaanText = new JLabel("[Hasil Berupa Angka]");
        
        luasPanel.add(luasLabel);
        luasPanel.add(luasText);
        kelilingPanel.add(kelilingLabel);
        kelilingPanel.add(kelilingText); 
        volumePanel.add(volumeLabel);
        volumePanel.add(volumeText);
        luasPermukaanPanel.add(luasPermukaanLabel);
        luasPermukaanPanel.add(luasPermukaanText);
        
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HalamanUtama frame = new HalamanUtama();
            frame.setVisible(true);
        });
    }
    
}
