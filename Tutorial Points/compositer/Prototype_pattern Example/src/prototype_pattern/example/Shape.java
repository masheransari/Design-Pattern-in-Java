/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype_pattern.example;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asher.ansari
 */
public abstract class Shape implements Cloneable {

    public String _id;
    public String type;

    public String getId() {
        return _id;
    }

    public String getType() {
        return type;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public void setType(String name) {
        this.type = name;
    }

    abstract void draw(); 
    
    public Object clone(){
        
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }

}
