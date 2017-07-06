/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter.pattern;

/**
 *
 * @author asher.ansari
 */
public class Person {

    private String name;
    private String gender;
    private String materialStatus;

    public Person(String name, String gender, String materialStatus) {
        this.name = name;
        this.gender = gender;
        this.materialStatus = materialStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }
     
}
