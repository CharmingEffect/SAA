package views;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import controllers.Controller;
import controllers.ModuleController;
import entity.Module;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddModulePanel extends JPanel {

    ArrayList<Module> modules = new ArrayList<Module>();
    ModuleController controller = new ModuleController();

    JTextField moduleIdFld, moduleNameFld;
    
    public AddModulePanel() {

        initGui();

    }

    public void initGui() {

        this.setLayout(null);

        JLabel label = new JLabel("Fill up alll the field and click add to add module.");
        Font font = new Font("serif", Font.PLAIN, 15);
        label.setBounds(140, 100, 400, 70);
        label.setFont(font);
        label.setIcon(new ImageIcon(getClass().getResource("/icons/file-earmark-plus-fill.png")));
        add(label);

        JLabel moduleIdLbl = new JLabel("Module ID: ");
        moduleIdLbl.setBounds(200, 100, 200, 200);
        moduleIdLbl.setFont(font);
        add(moduleIdLbl);

        moduleIdFld = new JTextField();
        moduleIdFld.setBounds(300, 180, 200, 40);
        moduleIdFld.setFont(font);
        add(moduleIdFld);

        JLabel moduleNameLbl = new JLabel("Module name: ");
        moduleNameLbl.setBounds(200, 150, 200, 200);
        moduleNameLbl.setFont(font);
        add(moduleNameLbl);

        moduleNameFld = new JTextField();
        moduleNameFld.setBounds(300, 230, 200, 40);
        moduleNameFld.setFont(font);
        add(moduleNameFld);

        JButton addModuleBtn = new JButton("Add");
        addModuleBtn.setBounds(300, 300, 200, 50);
        addModuleBtn.setFont(font);
        add(addModuleBtn);

        addModuleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addModuleButtonAction(e);
                

            }
        });

    }

    public void addModuleButtonAction(ActionEvent e) {

        if (moduleIdFld.getText().isEmpty() || moduleNameFld.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all the fields");

        }

        else {

          
            String moduleId = moduleIdFld.getText().trim();
            String moduleName = moduleNameFld.getText().trim();
            controller.addModule(moduleId, moduleName);
            this.setVisible(false);

            // clear leftover data
            moduleIdFld.setText("");
            moduleNameFld.setText("");

            // the code below allow to see the changes without manually closing and opening the frame
            //the question is how to make it without closing the frame 

            SwingUtilities.getWindowAncestor(this).dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);

            

        }

    }
}
