/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarSwing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author Gustansyah Dwi Putra
 */
class KotakFrame extends JFrame {
    //Menginisiasi objek tulisan 
    JLabel tulisan = new JLabel("Helllo World!❤");
    
    //Menginisiasi objek tombol
    JButton tombolLogin = new JButton("Login");
    
    //Menginisiasi objek dropdown
    String[] semester ={
    "Semester1",
    "Semester2",
    "Semester3",
    "Semester4",
    "Semester5",
    "Semester6",
    "Semester7",
    "Semester8",
};
    JComboBox pilihanSemester =  new JComboBox(semester);
    
    JTextField inputNama = new JTextField();
    
    JLabel labelInputNama = new JLabel("Nama Lengkap: ");
    
    JRadioButton pilihlaki = new JRadioButton("Laki-Laki");
    JRadioButton pilihperempuan = new JRadioButton("Perempuan");
    
    
    KotakFrame(){
        setVisible(true);
        setSize(720, 480);
        setTitle("Belajar Bikin Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(tulisan);
        tulisan.setBounds(320, 180, 150, 100);
        
        add(tombolLogin);
        tombolLogin.setBounds(210, 54, 80, 100);
        
        add(pilihanSemester);
        pilihanSemester.setBounds(100, 20, 50, 100);
        
        add(inputNama);
        inputNama.setBounds(210, 144, 120, 32);
        
        add(labelInputNama);
        labelInputNama.setBounds (100,144, 100, 32);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihlaki);
        pilihJenisKelamin.add(pilihperempuan);

        add(pilihlaki);
        pilihlaki.setBounds (210, 186, 100, 32);
        
        add(pilihperempuan);
        pilihperempuan.setBounds (320, 186, 100, 32);
        
    }
}
        
public class BelajarSwing {
    public static void main(String[] args){
//        JFrame kotakFrame = new JFrame();
//        
//        //Buat nampilin frame
//        kotakFrame.setVisible(true);
//        
//        //Ngasih ukuran default dari frame
//        kotakFrame.setSize(480, 720);
//        
//        //Ngasih judul di frame
//        kotakFrame.setTitle("Belajar Bikin Frame");
//        
//        //Mmebuat supaya kalo frame ditutup, programnya berhenti
//        kotakFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        KotakFrame kotakFrame = new KotakFrame();
    }
}
