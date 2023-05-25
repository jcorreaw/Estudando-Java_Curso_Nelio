package Abstract.entities;

import Abstract.Enuns.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(String color, Double radius) {
        super(Color.valueOf(color));
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
