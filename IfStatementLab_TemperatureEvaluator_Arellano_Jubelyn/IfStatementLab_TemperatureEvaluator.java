/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_jubelyn_project2;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Arellano_Jubelyn_Project2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius.");
        
        double Temperature=input.nextDouble();
        if(Temperature<0){
            System.out.println("Freezing point .");
        } else {
            if(Temperature<=25){
                System.out.println("Normal weather.");
            } else {
                System.out.println("Hot weather.");
            }
        }
    }
}
