package com.example.demo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println("Hello");
        AddNumber addNumbers = new AddNumber(10,20);

        AddNumber addNumberss = new AddNumber(num3,num4);

        int result = addNumbers.CalculateSum();
        int finalresult = addNumberss.CalculateSum();

        System.out.println(finalresult);
    }
}
