package ru.java.sololearn;

/**
 * Переменные
 * <p>
 * Вам дан код, который выводит характеристики автомобиля, но что-то не так.
 * <p>
 * Задача
 * Исправьте код, чтобы выводить характеристики.
 * <p>
 * Выходные данные
 * Name: Toyota
 * Engine: 4.7
 * Year: 2019
 * <p>
 * Обратите внимание на типы переменных. Исправьте их на соответсвующий тип.
 */
public class Lesson22 {

    public static void main(String[] args) {
        //исправьте типы переменных
        double name = "Toyota";
        int engine = 4.7;
        String year = 2019;

        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Year: " + year);
    }

}
