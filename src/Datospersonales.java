/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LAB08
 */
public class Datospersonales 
{
 
    
 public static void main(String[] args)
         
 {
  Scanner sc = new Scanner(System.in);
  
    
 System.out.println("Digite su nombre");
 
System.out.println("Digite su edad");
System.out.println("Digite su edad + 20 años");

String nombre = sc.nextLine();

 System.out.println("Bienvenido " +nombre+",en 20 años ud. tendra edad");
 
 }        
         
}
