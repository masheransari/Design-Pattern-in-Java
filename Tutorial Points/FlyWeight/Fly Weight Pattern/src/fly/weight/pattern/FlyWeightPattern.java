package fly.weight.pattern;

public class FlyWeightPattern {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            CircleShape circleShape = (CircleShape) ShapeFactory.getCircle(getRandomColor());
            circleShape.setX(getX());
            circleShape.setY(getY());
            circleShape.setRadius(100);
            circleShape.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getX() {
        return (int) (Math.random() * 100);
    }

    private static int getY() {
        return (int) (Math.random() * 100);
    }
}
