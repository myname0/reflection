package netcracker.eliseeva.figure;

import netcracker.eliseeva.figure.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("square");
    }

    private void hiddenMethod(){
        System.out.println("square");
    }
}
