/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_jubelyn_project4;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Arellano_Jubelyn_Project4 {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter the radius of the circle.");
        
        double r=input.nextDouble();
        if (r<=0){
            System.out.println("Invalid radius.");
        } else {
            double a= Math.PI * r * r;  
            System.out.println("Area: " + a);
            double c= 2 * Math.PI * r;
            System.out.println("Circumference: " + c );
            double d= 2 * r;
            System.out.println("Diameter: " +  d);
            
            
        }
    }
}
