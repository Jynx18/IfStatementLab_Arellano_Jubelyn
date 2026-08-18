/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jubarellano;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JubArellano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age.");
        
        int Age=input.nextInt();
        if (Age<=12){
            System.out.println("You are a child.");
        } else{
            if(Age<=19){
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are an adult.");
            }
        }
    }
        
     
        
       
                
                
}                  
             
       
                           
      
   
           
                
        
        
         
    
    

