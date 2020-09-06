package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shape {

    //these represent the sides, i wouldn't mind making them final, but the spec says that all fields must have corresponding setter...
    private float width, height, depth;


    //fully specified constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //getters and setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }




    //inherited methods
    @Override
    public float surfaceArea() { //calculates surface area
        return 2 * (depth * width + width * height + height * depth);
    }

    @Override
    public float volume() { //calculates volume
        return depth * width * height;
    }



    @Override
    public void render() { // This takes all the data in this object and crams it into a popup dialog box.
        // any idea why showMessage dialog is fine with a string entered directly but balks at a string local field??

        JOptionPane.showMessageDialog(null, "The details of this cuboid are:" + System.lineSeparator() +
                "Width = " + width + System.lineSeparator() +
                "Height = " + height + System.lineSeparator() +
                "Depth = " + depth + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}
