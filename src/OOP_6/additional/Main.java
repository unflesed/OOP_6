package OOP_6.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Введите два числа:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Сумма = " + Calculator.sum(a,b));
        System.out.println("Разность = " + Calculator.dif(a,b));
        System.out.println("Произведение = " + Calculator.mult(a,b));
        System.out.println("Деление = " + Calculator.div(a,b));
        System.out.println("Деление по модулю = " + Calculator.mod(a,b));
    }
}
