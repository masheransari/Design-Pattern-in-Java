/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pattern;

/**
 *
 * @author asher.ansari
 */
public abstract class AbstractFactory {

    abstract shape getShape(int shape);

    abstract Color getColor(int color);
}
