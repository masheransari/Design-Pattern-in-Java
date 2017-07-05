/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.design.pattern;

/**
 *
 * @author asher.ansari
 */
public class EmployeeRecord implements Prototype {

    @Override
    public Prototype getClone() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new EmployeeRecord(id, name, destignation, salary, address);
    }

    private int id;
    private String name, destignation;
    private double salary;
    private String address;

    public EmployeeRecord() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
    }
    
    public EmployeeRecord(int id, String name, String designation, double salary, String address){
        this.id = id;
        this.name = name;
        this.destignation = designation;
        this.salary = salary;
        this.address = address;
    }
 public void showRecord(){  
          
        System.out.println(id+"\t"+name+"\t"+destignation+"\t"+salary+"\t"+address);  
   }  
}
