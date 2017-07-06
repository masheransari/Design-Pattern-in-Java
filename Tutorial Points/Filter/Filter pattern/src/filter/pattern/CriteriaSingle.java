/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> persons = new ArrayList<>();

        for (Person p : list) {
            if (p.getMaterialStatus().equalsIgnoreCase("single")) {
                persons.add(p);
            }
        }
        return persons;
    }
}
