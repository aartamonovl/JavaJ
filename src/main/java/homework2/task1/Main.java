package homework2.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /**
     * Задача 1:
     * Создайте абстрактный класс "Animal" с полями "name" и "age".
     * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
     * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
     * Выведите на экран информацию о каждом объекте.
     * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
     */

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Animal[] animals = {new Dog("Dog1", 2, "low", "mid")
                , new Cat("Cat1", 4, "high", "Box")
                , new Dog("Dog2", 8, "mid", "mid")};
        Class<?>[] classs = new Class[animals.length];
        for (int i = 0; i < animals.length; i++) {
            classs[i] = animals[i].getClass();
        }
        for (Class<?> clazz : classs) {
            System.out.println("Class:");
            System.out.println("    " + clazz.getName());
            System.out.println("Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("    " + field.getName());
            }
            System.out.println("Parent Fields:");
            for (Field field : clazz.getSuperclass().getDeclaredFields()) {
                System.out.println("    " + field.getName());
            }
            System.out.println("Methods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("    " + method.getName());
            }
            System.out.println("Parent Methods:");
            for (Method method : clazz.getSuperclass().getDeclaredMethods()) {
                System.out.println("    " + method.getName());
            }
        }
        for (Animal animal: animals){
            System.out.println(animal.getClass().getSimpleName() + " say:");
            Method makeSoundMethod = animal.getClass().getMethod("makeSound");
            makeSoundMethod.invoke(animal);
        }
    }
}
