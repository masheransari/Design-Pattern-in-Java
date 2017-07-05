/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern1;

/**
 *
 * @author asher.ansari
 */
public class ItemBuilder {
        public MobileType builderMotorola(){
        MobileType type = new MobileType();
        type.addItem(new Motorola());
        return type;
    }
        public MobileType builderLG(){
        MobileType type = new MobileType();
        type.addItem(new LG());
        return type;
    }
        public MobileType builderSamsung(){
        MobileType type = new MobileType();
        type.addItem(new Samsung());
        return type;
    }
}
