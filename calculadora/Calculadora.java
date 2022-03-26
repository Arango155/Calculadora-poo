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
     float x,y;
    
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Bienvenido a la calculadora para la funcion de suma, resta, multiplicacion, division, potencia y raiz de los numeros que ingrese");
    System.out.println("Se le solicita que ingrese los numeros que se le piden acontinuacion");
    
    System.out.println("Ingrese el primer numero: ");
    a=entrada.nextFloat();
    
    System.out.println("Ingrese el segundo numero: ");
    b=entrada.nextFloat();
    
    Proyecto calculadora=new Proyecto();
    
    calculadora.suma(a, b);
    
    System.out.println("El valor de la suma entra ambos numeros es:");
    System.out.println(calculadora.suma(a, b));
    
    System.out.println("El valor de la resta entre ambos numeros es:");
     System.out.println(calculadora.resta(a, b));
     
     System.out.println("El valor de la multiplicacion entre ambos numeros es:");
     System.out.println(calculadora.multi(a, b));
     
       System.out.println("El valor de la division entre ambos numeros es:");
     System.out.println(calculadora.div(a, b));
    
     System.out.println("El valor de la potencia del primer numero es de:");
     System.out.println(calculadora.pota(a));
    
     System.out.println("El valor de la potencia del segundo numero es de:");
     System.out.println(calculadora.potb(b));
    
     System.out.println("El valor de la raiz cuadrada del primer numero es de:");
     System.out.println(calculadora.raiza(a));
     
      System.out.println("El valor de la raiz cuadrada del segundo numero es de:");
     System.out.println(calculadora.raizb(b));
     
     System.out.println("Ahora se haran algunas operaciones especiales en la calculadora ");
     
    System.out.println("Se le solicita que ingrese los numeros que se le piden acontinuacion");
    
    System.out.println("Ingrese el primer numero (base): ");
    x=entrada.nextFloat();
    
    System.out.println("Ingrese el segundo numero (exponente): ");
    y=entrada.nextFloat();
    
        System.out.println("El valor de la potencia de la base de su primer numero y el exponente del segundo es:");
     System.out.println(calculadora.pot(x,y));
         
        System.out.println("El valor de la raiz cuadrada del primer numero es de:");
     System.out.println(calculadora.raizx(x));
     
      System.out.println("El valor de la raiz cuadrada del segundo numero es de:");
     System.out.println(calculadora.raizy(y));
     
     System.out.println("El valor random de su numero random es:");
     System.out.println(calculadora.randomx(x));
     
     
     System.out.println("El primer numero multiplicado por pi es:");
     System.out.println(calculadora.pi(x));
    
  
    }
    
    
    
   
}
