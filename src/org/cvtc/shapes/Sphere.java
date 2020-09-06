package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape {
    //these represent the sides, i wouldn't mind making them final, but the spec says that all fields must have corresponding setter...
    private float radius, height;


    //fully specified constructor
    public Sphere(float radius) {
        this.radius = radius;

    }

    //getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //inherited methods
    @Override
    public float surfaceArea() { //calculates surface area
        return (float) (4 * Math.PI * radius * radius);
    }

    @Override
    public float volume() { //calculates volume
        return (float) ((4.0 / 3) * Math.PI * radius * radius * radius);
    }



    @Override
    public void render() { // This takes all the data in this object and crams it into a popup dialog box.
        // any idea why showMessage dialog is fine with a string entered directly but balks at a string local field??

        JOptionPane.showMessageDialog(null, "The details of this sphere are:" + System.lineSeparator() +
                "Radius = " + radius + System.lineSeparator() +
                "Surface Area = " + surfaceArea() + System.lineSeparator() +
                "Volume = " + volume());


    }
}
