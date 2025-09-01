package org.example.Factory;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        switch(shape.toLowerCase()) {
            case "square": return new Square();
            case "rectangle": return new Rectangle();
            default:throw new RuntimeException("not found");
        }
    }
}
