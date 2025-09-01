package org.example.AbstractFactory;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AbstractFactory<Shape> abstractFactory = (AbstractFactory<Shape>) FactoryProducer.getFactory("shape");
        Shape shape = abstractFactory.getFactory("Rectangle");
        shape.draw();
    }
}
