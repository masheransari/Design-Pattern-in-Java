/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fascade.pattern.pkg1;

/**
 *
 * @author asher.ansari
 */
public class ShapeManager {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeManager() {
        circle = new CircleShape();
        rectangle = new RectangleShape();
        square = new SquareShape();
    }

    public void circleDraw() {
        circle.draw();
    }

    public void rectangleDraw() {
        rectangle.draw();
    }

    public void squareDraw() {
        square.draw();
    }
}
