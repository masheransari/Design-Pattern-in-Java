/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class CompositePattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee a = new Employee("Muhammad Asher Ansari", "Developer", 40000);
        Employee b = new Employee("Nabeel Hasnain Zaidi", "Developer", 40000);
        Employee c = new Employee("Sheryar Ahmed Khan", "Developer", 40000);
        Employee d = new Employee("Zeeshan Ahmed", "Developer", 40000);
        Employee e = new Employee("Osama Shakeel", "Developer", 40000);
        Employee f = new Employee("Abdul Rafay", "Developer", 40000);
        Employee g = new Employee("Ammar Shaikh", "Developer", 40000);
        Employee h = new Employee("Syed Hamza Ali Rizvi", "Developer", 40000);

        a.addItem(a);
        a.addItem(b);
        a.addItem(c);
        a.addItem(d);
        a.addItem(e);
        a.addItem(f);
        a.addItem(g);
        a.addItem(h);

        for (Employee e1 : a.getList()) {
            System.out.println(""+e1);
        }
    }

}
