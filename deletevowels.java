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
public class deletevowels {
     public static void main(String args[])
   {
       String str1, str2;
       Scanner scan = new Scanner(System.in);
 
       System.out.print("Enter a String : ");
       str1 = scan.nextLine();
       str2 = str1.replaceAll("[aeiouAEIOU]", "");
       System.out.print("All Vowels Removed : " +str2);
 
   }
}
