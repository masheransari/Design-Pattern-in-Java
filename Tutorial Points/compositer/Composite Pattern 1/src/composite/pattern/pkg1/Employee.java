/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class Employee {

    private String name;
    private String designation;
    private float sal;
    List<Employee> list = new ArrayList<>();

    public Employee(String name, String designation, float sal) {
        this.name = name;
        this.designation = designation;
        this.sal = sal;
    }

    public List<Employee> getList() {
        return list;
    }

    public void addItem(Employee e) {
        list.add(e);
    }

    public void removeItem(Employee e) {
        list.remove(e);
    }

    @Override
    public String toString() {
        return "Employee{\t" + "name=" + name + ",\tdesignation=" + designation + ",\tsal=" + sal + '}';
    }

}
