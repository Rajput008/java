/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;

/**
 *
 * @author Rajput
 */
public class factorial_recur {
      
    static int fact(int n){    
    if (n == 0)    
    return 1;    
  else    
    return(n * fact(n-1));    
 }    
 public static void main(String args[]){  
  int fact=1;  
  int number=8;    
  fact = fact(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

