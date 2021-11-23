/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;
import java.util.UUID;
/**
 *
 * @author Rajput
 */
public class randomstring {
    public static void main(String args[]){
        String random = usingUUID();
        System.out.println("Random String is :"+random);
    }
    
    static String usingUUID() { 
    UUID randomUUID = UUID.randomUUID(); 
    return randomUUID.toString().replaceAll("-", ""); 
  } 
}
