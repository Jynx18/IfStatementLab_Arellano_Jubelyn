/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_jubelyn_project5;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Arellano_Jubelyn_Project5 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an intenger");
        
        int n= input.nextInt();
        if (n % 2 == 0) {
        System.out.println("Even");
    } else { 
            System.out.println("Odd");
            }
        
        
    }
}
