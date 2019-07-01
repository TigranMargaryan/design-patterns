package factory_method;

public class ShapeFactory {

    public static Shape getShape(String shape){
        switch (shape){
            case "circle":
                return new Cirlce();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                    return null;
        }
    }
}
