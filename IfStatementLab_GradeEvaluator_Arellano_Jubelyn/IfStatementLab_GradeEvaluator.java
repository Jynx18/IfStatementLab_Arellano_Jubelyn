/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_jubelyn_project3;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Arellano_Jubelyn_Project3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score.");
        
        int Score=input.nextInt();
        if (Score>=90){
            System.out.println("Excellent.");
        } else{
            if(Score>=75){
                System.out.println("Good.");
            } else {
                System.out.println("Needs Improvement.");
            }
        }
    }
}
