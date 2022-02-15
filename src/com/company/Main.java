package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number=2,total=0;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Bir sayı giriniz = ");
            number = scanner.nextInt();
            if (number%4==0){
                total+=number;
            }
        }while (number%2==0);
            System.out.println("Toplam = " + total);
    }
}
