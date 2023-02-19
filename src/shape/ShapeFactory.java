package shape;

public class ShapeFactory {
    //private ShapeEnum shapeEnum;
    //private ColorEnum colorEnum;

    public Shape createShape(ShapeEnum shapeEnum, ColorEnum colorEnum) {

        Color color = createColor(colorEnum);
        switch(shapeEnum){
            case CIRCLE: return new Circle(color);
            case SQUARE: return new Square(color);
            default:
                throw new IllegalStateException("Unexpected value: " + shapeEnum);
        }
    }
    private Color createColor(ColorEnum colorEnum){
        switch (colorEnum){
            case RED: return new Red();
            case BLUE : return new Blue();
            default:
                throw new IllegalStateException("Unexpected value: " + colorEnum);
        }
    }

}
