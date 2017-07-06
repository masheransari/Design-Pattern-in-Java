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
public interface Criteria {

    public List<Person> meetCriteria(List<Person> list);
}
