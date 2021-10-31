package views;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.Position;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

import java.awt.Container;

public class Menu extends JFrame {

    JButton addStudentBtn, searchStudentButton, addModuleBtn; 
    AddStudentPanel panel = new AddStudentPanel();
    public Menu(){

        initGui();

    }


    public void initGui(){

        this.setPreferredSize(new Dimension(800, 600));
        this.setTitle("Student Assessment Administration");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        JPanel menuPanel = new JPanel();
        
        addStudentBtn = new JButton("Add Student");
        addModuleBtn = new JButton("Add Module");
        searchStudentButton = new JButton("Search Student");
        Font font = new Font("serif", Font.PLAIN, 20);
        addStudentBtn.setFont(font);
        searchStudentButton.setFont(font);

        addModuleBtn.setFont(font);
        getContentPane().setBackground(Color.CYAN);
        
       


        //menuPanel.setBackground(Color.CYAN); backgroudn will be blob 
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        menuPanel.add(addStudentBtn);
        menuPanel.add(addModuleBtn);
        menuPanel.add(searchStudentButton);

      

        addStudentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonAction(e);
            }
        });

        add(menuPanel);
        add(panel);
        //panel.setVisible(false);
        pack();

    }   
    
    public void addButtonAction(ActionEvent e){

       
        panel.setVisible(true);
        

    }

}




