/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_example;

/**
 *
 * @author asher.ansari
 */
public class variable_class {

    private String name;
    private String employeeId;
    private String employeeDesignation; 

    public variable_class(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }
    
}
