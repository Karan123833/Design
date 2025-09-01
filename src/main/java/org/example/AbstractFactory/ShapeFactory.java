package org.example.AbstractFactory;

public class ShapeFactory implements AbstractFactory<Shape>{
    @Override
    public Shape getFactory(String var) {
        switch(var.toLowerCase()) {
            case "rectangle":return new Rectangle();
            case "sqaure" : return new Square();
            default: throw new RuntimeException("it is not required");
        }
    }
}
