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
public class reversestring {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("After reversing");
        System.out.println(sb);
    }
}

