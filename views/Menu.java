package views;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.Position;

import javafx.scene.layout.Background;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Container;
import controllers.ImagePanel;
import controllers.Controller;
import entity.Module;

public class Menu extends JFrame {

    JButton addStudentBtn, searchStudentButton, addModuleBtn; 
    AddStudentPanel panel = new AddStudentPanel(); // zmienic na panelStudent
    AddModulePanel panelAddModule = new AddModulePanel();
    JPanel menuPanel = new JPanel();
    
    //ImagePanel imagePanel = new ImagePanel(new ImageIcon("icons/bg.png").getImage());
    public Menu(){

        initGui();

    }


    public void initGui(){



        this.setPreferredSize(new Dimension(800, 600));
       
        this.setTitle("Student Assessment Administration");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
       
        
        //background.setIcon(icon);
        addStudentBtn = new JButton();
        addModuleBtn = new JButton();
        searchStudentButton = new JButton();
        Font font = new Font("serif", Font.PLAIN, 20);
        addStudentBtn.setFont(font);
        searchStudentButton.setFont(font);

        addModuleBtn.setFont(font);
        menuPanel.setBackground(Color.CYAN);
        getContentPane().setBackground(Color.CYAN);


        //icons
        addStudentBtn.setIcon(new ImageIcon(getClass().getResource("/icons/person-plus-fill.png")));
        addModuleBtn.setIcon(new ImageIcon(getClass().getResource("/icons/file-earmark-plus-fill.png")));
        searchStudentButton.setIcon(new ImageIcon(getClass().getResource("/icons/search.png")));

       


        //menuPanel.setBackground(Color.CYAN); backgroudn will be blob 
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        
        addStudentBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        addStudentBtn.setContentAreaFilled(false); 
        addStudentBtn.setFocusPainted(false); 
        addStudentBtn.setOpaque(false);
        addStudentBtn.setToolTipText("Add new student to the database.");

        addModuleBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        addModuleBtn.setContentAreaFilled(false); 
        addModuleBtn.setFocusPainted(false); 
        addModuleBtn.setOpaque(false);
        addModuleBtn.setToolTipText("Add new module to the database");

        searchStudentButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchStudentButton.setContentAreaFilled(false); 
        searchStudentButton.setFocusPainted(false); 
        searchStudentButton.setOpaque(false);
        searchStudentButton.setToolTipText("Search student");

        menuPanel.add(addStudentBtn);
        menuPanel.add(Box.createRigidArea(new Dimension(50, 50))); //gap between buttons 
        menuPanel.add(addModuleBtn);
        menuPanel.add(Box.createRigidArea(new Dimension(50, 50)));
        menuPanel.add(searchStudentButton);
        

    

       
        addStudentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudentButtonAction(e);
            }
        });
      

        addModuleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addModuleButtonAction(e);
            }
        });
        panel.setVisible(false);
        panelAddModule.setVisible(false);
        add(menuPanel);
        add(panel);
        add(panelAddModule);
        //panel.setVisible(false);
        pack();
        

    }   
    
    public void addStudentButtonAction(ActionEvent e){
   
        panel.setVisible(true);
        panelAddModule.setVisible(false);
        

    }

    public void addModuleButtonAction(ActionEvent e){
   
       panel.setVisible(false);
       panelAddModule.setVisible(true);
        

    }

}




