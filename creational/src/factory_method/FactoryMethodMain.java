package factory_method;

import java.util.Scanner;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        System.out.print("Type Shape: ");

        String type = text.nextLine();

        Shape object = ShapeFactory.getShape(type);

        object.drow();
    }
}
