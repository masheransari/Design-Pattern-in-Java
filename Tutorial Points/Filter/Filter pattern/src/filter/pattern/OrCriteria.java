/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter.pattern;

import java.util.List;

/**
 *
 * @author asher.ansari
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria oldCriteria;

    public OrCriteria(Criteria criteria, Criteria oldCriteria) {
        this.criteria = criteria;
        this.oldCriteria = oldCriteria;
    }
    
    @Override
    public List<Person> meetCriteria(List<Person> list) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<Person> firstCriteria = criteria.meetCriteria(list);
        List<Person> otherMeetCriteria = oldCriteria.meetCriteria(list);
        
        for (Person person : otherMeetCriteria) {
            if(!firstCriteria.contains(person))
            {
                firstCriteria.add(person);
            }
        }
        return firstCriteria;
    }
    
}
