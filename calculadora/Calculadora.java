package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    
     float a,b,x,y;
    
    Scanner entrada=new Scanner(System.in);    
    
    int [] vector = {1,2};
    float suma = 0,resta = 0, multiplicacion=1,division=1, potencia = 0, raiza = 0,raizb = 0;
    
    for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese un numero: ");
            vector[i] = entrada.nextInt();
            
            suma=suma+vector[i];
            resta=vector[0]-vector[1];
            multiplicacion=multiplicacion*vector[i];
            division=vector[0]/vector[1];
            potencia= (int) Math.pow(vector[0],vector[1]);
            raiza= (int) Math.sqrt(vector[0]);
            raizb= (int) Math.sqrt(vector[1]);     
        }
        
        System.out.println("la suma dada es: "+ suma);
        System.out.println("la resta dada es: "+ resta);
        System.out.println("la multiplicacion dada es: "+multiplicacion);
        System.out.println("la division dada es: "+ division);
        System.out.println("la potencia dada es: "+potencia);
        System.out.println("la raiz cuadrada del primer numero es: "+raiza);
        System.out.println("la raiz cuadrada del segundo numero es: "+raizb);
    
    

    
    }
}        

  