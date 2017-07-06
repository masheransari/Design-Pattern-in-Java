/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.pattern;

/**
 *
 * @author asher.ansari
 */
public abstract class Shape {

    protected DrawApi api;

    public Shape(DrawApi api) {
        this.api = api;
    }

    public abstract void draw();
}
