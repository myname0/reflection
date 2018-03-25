package eliseeva;

import eliseeva.figure.Square;
import eliseeva.reflection.Reflection;

public class Main {

    public static void main(String[] args) {

        Reflection reflection = new Reflection();
        reflection.getAllMethods(Square.class);
        reflection.getAllMethodsWithAnnotation(Square.class);
        reflection.getAllPublicMethodsWithAnnotation(Square.class);
    }
}
