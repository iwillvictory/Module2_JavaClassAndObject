package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        System.out.flush();
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
        QuadraticEquation equation= new QuadraticEquation(a,b,c);
        System.out.println(equation);

    }
}
