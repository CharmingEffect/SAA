package entity;

import java.io.Serializable;

public class Module implements Serializable {

    private String moduleCode;
    private String moduleName;

    public Module(String moduleCode, String moduleName){
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;

    }
    
}
