package controllers;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entity.Module;

public class ModuleController {
    
    ArrayList<Module> modules;

    public ModuleController(){
        this.modules = new ArrayList<Module>();

        populateArrayList();


    }

    public void addModule(String moduleCode, String moduleName){

        Module module = new Module(moduleCode, moduleName);

        modules.add(module);
        saveModule();

    }

    public void populateArrayList() {   //populate array list 

        try {

            FileInputStream file = new FileInputStream("modules.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;

            while (!endOfFile) {

                try {

                    modules.add((Module) inputFile.readObject());

                } catch (EOFException e) {

                    endOfFile = true;

                } catch (Exception f) {

                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public void saveModule() {

        try {
            FileOutputStream file = new FileOutputStream("modules.dat"); // try to create a file if not created
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
    
            for (int i = 0; i < modules.size(); i++) {
    
                outputFile.writeObject(modules.get(i));
    
            }
    
            outputFile.close();
    
            JOptionPane.showMessageDialog(null, "The module has been sacessfully added");
           
    
        } catch (IOException e) {
    
            JOptionPane.showMessageDialog(null, e.getMessage());
    
        }
    
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }


 


}
