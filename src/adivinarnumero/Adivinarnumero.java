/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Adivinarnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numeroaleatorio, intento;
    System.out.println("Adivina el número entre 1 y 100: ");
    while (true){
    System.out.print("Ingresa tu suposición: ");
    intento = scanner.nextInt();
    if (intento > numeroaleatorio){
    System.out.println("Demasiado alto, intenta nuevamente.");
    }else if(intento < numeroaleatorio){
    System.out.println("Demasiado bajo, intenta nuevamente.");
    }else{
    System.out.println("¡Felicidades! Adivinaste el número.");
    break;
    }
    }
  }
    
}
