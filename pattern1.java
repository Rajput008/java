/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;

import java.util.Scanner;

/**
 *
 * @author Rajput
 */
public class pattern1 {
    public static void main(String [] args){
        int i,j,row;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        row = sc.nextInt();
        for(i=0; i<row; i++)   
        {   
            for(j=0; j<=i; j++)   
            {   
                System.out.print("* ");   
            }   
            System.out.println();     
        }
    } 
}
