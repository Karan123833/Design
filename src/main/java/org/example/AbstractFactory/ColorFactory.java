package org.example.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color getFactory(String var) {
        return switch (var.toLowerCase()) {
            case "red" -> new Red();
            case "blue" -> new Blue();
            default -> throw new RuntimeException("ntop found rang");
        };
    }
}
