/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_example;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class EmpData extends variable_class implements EmployeeSetting{

    @Override
    public void setEmpData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Please Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.println("Please Enter Employee Designation: ");
        String designation = sc.nextLine();
        
        setName(name);
        setEmployeeId(id);
        setEmployeeDesignation(designation);
        
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmpData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Employee Name: "+getName()+" & ID : "+getEmployeeId()+ " & The Designation is: "+getEmployeeDesignation();
    }
    
}
