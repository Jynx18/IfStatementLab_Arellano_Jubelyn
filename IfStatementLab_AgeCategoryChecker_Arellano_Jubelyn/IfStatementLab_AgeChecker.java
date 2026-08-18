/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_jubelyn_project1;

import java.util.Scanner;


/**
 *
 * @author Asus
 */
public class Arellano_Jubelyn_Project1 {

    public static void main(String[] args) {
        Scanner input= new Scanner( System.in);
        System.out.println("Enter your age.");
        
        int Age=input.nextInt();
        if(Age<12){
            System.out.println("You are a child.");
        } else {
            if(Age<=19){
                System.out.println("You are a teenager.");
            } else{
                System.out.println("You are an adult.");
            }
        }
    }
}
