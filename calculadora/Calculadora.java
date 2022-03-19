/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jdara
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     float a,b;
    
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Ingrese el primer numero");
    a=entrada.nextFloat();
    
    System.out.println("Ingrese el segundo numero");
    b=entrada.nextFloat();
    
    Proyecto calculadora=new Proyecto();
    
    calculadora.suma(a, b);
    
    
    System.out.println(calculadora.suma(a, b));
    
    }
    
    
   
   
}
