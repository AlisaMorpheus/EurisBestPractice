package bridgeshape;

public class Main {
    public static void main(String[] args) {
        /*
        Shape blueCricle = new Circle(new Blue());
        Shape redSquare = new Square(new Red());
        Shape blueSquare = new Square(new Blue());
        Shape redCircle = new Circle(new Red());
        */
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeEnum shapeEnum = ShapeEnum.SQUARE;
        ColorEnum colorEnum = ColorEnum.RED;
        Shape shape = shapeFactory.createShape(shapeEnum, colorEnum);
    }
}
