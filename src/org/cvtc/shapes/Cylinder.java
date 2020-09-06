package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape {

    //these represent the sides, i wouldn't mind making them final, but the spec says that all fields must have corresponding setter...
    private float radius, height;


    //fully specified constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;

    }

    //getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }




    //inherited methods
    @Override
    public float surfaceArea() { //calculates surface area
        return (float) (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public float volume() { //calculates volume
        return (float) (Math.PI * radius * radius * height);
    }



    @Override
    public void render() { // This takes all the data in this object and crams it into a popup dialog box.
        // any idea why showMessage dialog is fine with a string entered directly but balks at a string local field??

        JOptionPane.showMessageDialog(null, "The details of this cylinder are:" + System.lineSeparator() +
                "Radius = " + radius + System.lineSeparator() +
                "Height = " + height + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}
