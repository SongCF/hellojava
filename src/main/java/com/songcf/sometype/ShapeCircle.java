package com.songcf.sometype;

public class ShapeCircle implements Shape {
    public void name() {
        Printer.println("ShapeCircle:name");
    }
    public void draw() {
        Printer.println("ShapeCircle:draw");
    }
    public void shapeCircle() {
        Printer.println("ShapeCircle:shapeCircle [special method]");
    }
}
