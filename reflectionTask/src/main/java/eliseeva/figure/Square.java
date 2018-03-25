package eliseeva.figure;

import eliseeva.annotation.Star;

public class Square extends Shape {
    @Override
    @Star
    public void draw() {
        System.out.println("square");
    }

    private void hiddenMethod(){
        System.out.println("square");
    }
}
