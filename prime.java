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
public class prime {
     static boolean isPrime(int n){
          if(n==1||n==0)return false;
   
          for(int i=2; i<n; i++){
              if(n%i==0)return false;
          }
          return true;
    }
       public static void main (String[] args)
    {
        int N = 100;
        for(int i=1; i<=N; i++){
           if(isPrime(i)) {
           System.out.print(i + " ");
            }
        }
 
    }
}
