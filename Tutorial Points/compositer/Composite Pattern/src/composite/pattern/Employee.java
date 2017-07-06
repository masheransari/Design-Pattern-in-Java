/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class Employee {

    private String name;
    private String dept;
    private int sal;
    List<Employee> subCoordinate = new ArrayList<>();

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
     }

    public void add(Employee e) {
        subCoordinate.add(e);
    }

    public void remmove(Employee e) {
        subCoordinate.remove(e);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSal() {
        return sal;
    }

    public List<Employee> getSubCoordinate() {
        return subCoordinate;
    }

    @Override
    public String toString() {
        return "Employee{\t" + "name=" + name + ",\tdept=" + dept + ",\tsal=" + sal + "}";
    }

}
