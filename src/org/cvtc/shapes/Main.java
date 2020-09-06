package org.cvtc.shapes;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1, 2, 3);
        Cylinder cylinder = new Cylinder(2,3);
        Sphere sphere = new Sphere(3);

        cuboid.render();
        cylinder.render();
        sphere.render();

    }
}
