/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Программа калькулятор");
        System.out.println("Введите операцию: (+, -, *, /)");
        String znak = scanner.nextLine();
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        int result = 0;
        if("+".equals (znak)) {
            result = number1 + number2;
        }
        if("-".equals (znak)) {
            result = number1 - number2;
        }
        if("*".equals (znak)) {
            result = number1 * number2;
        }
        if("/".equals (znak)) {
            result = number1 / number2;
        }
        
        System.out.println("Результат: ");
        System.out.println(result);
        System.out.println("Пока");
    }
    
}
