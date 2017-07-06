/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pattern.pkg1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asher.ansari
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getClone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }

}
