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
public class deletespace {
    public static void main(String args[]){
        String s = " A r i s g l o b a l    ";
         s = s.replaceAll("\\s", "");
        System.out.println(s);
    }
}
