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
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Person> persons = new ArrayList<>();

        for (Person p : list) {
            if (p.getGender().equalsIgnoreCase("Male")) {
                persons.add(p);
            }
        }
        return persons;
    }
}
