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
public class deleteword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance");
        String str = sc.nextLine();
        System.out.println("Enter a word to delete");
        String str1 = sc.nextLine();
        str= str.replaceAll(str1, "");
        System.out.println(str);
    }
}
