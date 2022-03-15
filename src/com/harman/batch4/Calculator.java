package com.harman.batch4;

import java.util.Scanner;

public class Calculator {

    public int Addition_s(int x, int y)
    {
        int z = x+y;
        return z;
    }

    public static void main(String[] args) {

        Addition Calc=new Addition();
        Substraction adCalc=new Substraction();
        Calculator calc=new Calculator();
        Scanner input=new Scanner(System.in);
        int n1, n2,result1, result2;
        System.out.println("Enter n1: ");
        n1 = input.nextInt();
        System.out.println("Enter n2: ");
        n2 = input.nextInt();
        result1 = Calc.AdditionOp(n1,n2);
        result2 = adCalc.SubstractionOp(n1,n2);
        System.out.println("addition of n1 and n2 is: ");
        System.out.println(result1);
        System.out.println("substraction of n1 and n2 is: ");
        System.out.println(result2);

    }

}
