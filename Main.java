package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Scanner input1 = new Scanner(System.in);
	System.out.println("Введите 1-е число");
	int x = input.nextInt();
	System.out.println("Введите 2-е число");
	int y = input.nextInt();
    System.out.println("Введите операцию: '+', '-', '*', '/'");
    String operator = input1.nextLine();
    switch (operator){
        case "+":
            Operationable <Integer> operation1 = (a,b) -> a+b;
            System.out.println(operation1.calc(x,y));
            break;
        case "-":
            Operationable <Integer> operation2 = (a,b) -> a-b;
            System.out.println(operation2.calc(x,y));
            break;
        case "*":
            Operationable <Integer> operation3 = (a,b) -> a*b;
            System.out.println(operation3.calc(x,y));
            break;
        case "/":
            double x1 = x;
            double y1 = y;
                if(y1 != 0){
                    Operationable <Double> operation4 = (a, b) -> a/b;
                    System.out.println(operation4.calc(x1, y1));
                }
                else {
                    System.out.println("Error");
                }
            break;
    }}
}
interface Operationable<T>{
    T calc(T a, T b);
}
