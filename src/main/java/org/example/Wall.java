package org.example;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Hamcrest'teki instanceOf(Double.class) için wrapper döndürüyoruz
    public Double getWidth()  { return width; }
    public Double getHeight() { return height; }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
