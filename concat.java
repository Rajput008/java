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
public class concat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String a = sc.nextLine();
        System.out.println("Enter Second string");
        String b = sc.nextLine();
        String concat = a + b ;
        System.out.println("Concat:"+concat);
    }
}
