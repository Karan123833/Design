package org.example.Factory;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = ShapeFactory.getShape(sc.next());
        shape.draw();
        System.out.println("complete drawing");
    }
}
