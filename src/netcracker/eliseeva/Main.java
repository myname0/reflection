package netcracker.eliseeva;

import netcracker.eliseeva.figure.Square;
import netcracker.eliseeva.reflection.Reflection;

public class Main {

    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        reflection.getAllMethods(Square.class);
        reflection.getAllMethodsWithAnnotation(Square.class);
    }
}
