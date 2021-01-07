/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {  
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number");
        int num = in.nextInt();
        if (num >=380 && num <=450){
            System.out.println("Your color is Violet");
        }
        else if (num >=450 && num <=495){
            System.out.println("Your color is Blue");
        }
        else if (num >=495 && num <=570){
            System.out.println("Your color is Green");
        }
        else if (num >=570 && num <=590){
            System.out.println("Your color is Yellow");
        }
        else if (num >=590 && num <=620){
            System.out.println("Your color is Orange");
        }
        else if (num >=620 && num<=750){
            System.out.println("Your color is Red");
        }
        else
            System.out.println("The entered wavelenght is not on the visible spectrum");
        }
        
    }
