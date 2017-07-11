/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryabstractmethod;

/**
 *
 * @author asher.ansari
 */
public class FactoryAbstractMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFactory abstractShape = FactoryProduces.getFactory("Shape");
        AbstractFactory abstractColor = FactoryProduces.getFactory("color");    
    
        for (int i = 0; i < 3; i++) {
            Shape s = abstractShape.getShape(i);
            Color c = abstractColor.getColor(i);
            System.out.println("Shape: "+s.getdraw()+" and Color: "+c.fillColor());
        }
    }
    
}
