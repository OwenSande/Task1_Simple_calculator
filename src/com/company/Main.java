package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        float firstNumberSande;
        float secondNumberSande;
        float sum;
        float subtraction;
        float product;
        float quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculates sum, difference, product and quotient of two numbers.");
        System.out.println("Enter the first number and press Enter");
        firstNumberSande = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number and press Enter");
        secondNumberSande = Float.parseFloat(br.readLine());

        sum = firstNumberSande + secondNumberSande;
        subtraction = firstNumberSande - secondNumberSande;
        product = firstNumberSande * secondNumberSande;
        quotient = firstNumberSande / secondNumberSande;

        System.out.printf("You entered two number, the first is: "+ "%2.2f", firstNumberSande );
        System.out.printf("and the second is: "+ "%2.2f", secondNumberSande );

        System.out.println();
        System.out.printf("Sum = "+ "%2.2f, \n", + sum);
        System.out.printf("Difference = "+ "%2.2f, \n", + subtraction);
        System.out.printf("Product = "+ "%2.2f, \n", + product);
        System.out.printf("Quotient = "+ "%2.2f, \n", + quotient);
    }
}
