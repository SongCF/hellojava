package com.songcf.sometype;

public class ShapeSquare implements Shape {
    public void name() {
        Printer.println("ShapeSquare:name");
    }
    public void draw() {
        Printer.println("ShapeSquare:draw");
    }
    public void shapeSquare() {
        Printer.println("ShapeSquare:shapeSquare [special method]");
    }
}
