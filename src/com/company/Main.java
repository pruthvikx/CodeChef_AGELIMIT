package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i = 0; i < testCase; i++){
            int minAge = scan.nextInt();
            int maxAge = scan.nextInt();
            int currAge = scan.nextInt();

            if (currAge >= minAge && currAge < maxAge){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
