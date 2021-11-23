/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Rajput
 */
public class stringtodate {
    public static void main(String args[]) throws ParseException{
      // String s = "dec 31 2020";
        
      String s="31-12-1998";  
    Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(s);  
    System.out.println(s+"\t"+date1);  
    }
}
