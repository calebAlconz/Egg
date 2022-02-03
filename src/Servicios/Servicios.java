/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
/*
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.

• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class Servicios {
    Scanner leer=new Scanner(System.in);
    public Matematica altaServicios(){
        Matematica mt= new Matematica();
        System.out.println("--------------------------------");
        System.out.println("Ingrese el valor del primer numero:");
        mt.setNum1(Math.random()*100);
        System.out.println("Ingrese el valor del segundo numero:");
        mt.setNum2(Math.random()*100);
        System.out.println("--------------------------------");
        return mt;
    }
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica mt){
        System.out.println("Mostrar en pantalla el numero mas grande:");
        if(mt.getNum1()>mt.getNum2()){
            System.out.println("El numero mas grande es el: "+ mt.getNum1());
        }else{
            System.out.println("el numero mas grande es el: "+ mt.getNum2());
        }
        System.out.println("--------------------------------");
    }
    
 //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica mt){
        double numer1, numer2;
        double potencia;
        numer1=Math.round(mt.getNum1());
        numer2=Math.round(mt.getNum2());
        System.out.println("Pongamos como potencia al menor numero:");
        if(mt.getNum1()>mt.getNum2()){
            System.out.println("El numero mas grande es el: "+ mt.getNum1());
            potencia=Math.pow(numer1,numer2);
        }else{
            System.out.println("el numero mas grande es el: "+ mt.getNum2());
            potencia=Math.pow(numer2,numer1);
        }
        System.out.println("--------------------------------");
    }
    /*
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public void calculaRaiz(Matematica mt){
        System.out.println("Calcular la raiz de los 2 valores :");
        double numer1, numer2, raiz1, raiz2;
        numer1=Math.round(mt.getNum1());
        numer2=Math.round(mt.getNum2());
        raiz1=Math.sqrt(numer1);
        raiz2=Math.sqrt(numer2);
        System.out.println("La raiz de: "+mt.getNum1()+" es: "+ raiz1);
        System.out.println(" y........");
        System.out.println("La raiz de: "+mt.getNum2()+" es: "+ raiz2);
    }
    
    
}
