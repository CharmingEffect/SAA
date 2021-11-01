package entity;

import java.io.Serializable;

public class Module implements Serializable {

    private String moduleCode;
    private String moduleName;
 

    public Module(String moduleCode, String moduleName){
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;

    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    };
    
}
