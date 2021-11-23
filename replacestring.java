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
public class replacestring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a string");
        String s1= sc.next();  
        System.out.println("replacing a to z");
        String s2 = sc.next();
        String replaceString=s1.replace("a","z");  
        System.out.println(replaceString);  
}
}  

