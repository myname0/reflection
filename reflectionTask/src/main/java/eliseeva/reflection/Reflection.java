package eliseeva.reflection;

import eliseeva.annotation.Star;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Reflection {
    public void getAllMethods(Class clazz) {
        do {
            System.out.println(clazz);
            System.out.println(Arrays.asList(clazz.getDeclaredMethods()));
            System.out.println();

            clazz = clazz.getSuperclass();
        } while (clazz != null);
    }

    public void getAllMethodsWithAnnotation(Class clazz) {
        do {
            System.out.println(clazz);

            List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
            for (Method method : methods) {
                if (method.getAnnotation(Star.class) != null) {
                    System.out.println(method.getAnnotation(Star.class).name() + method.toString());
                } else {
                    System.out.println(method);
                }
            }

            System.out.println();

            clazz = clazz.getSuperclass();
        } while (clazz != null);
    }

    public void getAllPublicMethodsWithAnnotation(Class clazz) {
        List<Method> methods = Arrays.asList(clazz.getMethods());
        for (Method method : methods) {
            if (method.getAnnotation(Star.class) != null) {
                System.out.println(method.getAnnotation(Star.class).name() + method.toString());
            } else {
                System.out.println(method);
            }
        }
    }
}
