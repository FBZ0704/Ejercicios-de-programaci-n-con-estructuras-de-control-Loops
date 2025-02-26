// Package
//package Clases;
import java.util.Scanner;

/* Calcular el promedio de un alumno que tiene 7 calificaciones en la materia
   de Cálculo.
*/

public class NotasCalculo {
 
  public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);

    // Variables
    int c = 0;
    double promedio;
    double suma = 0;

    double[] notas = new double[7];

    for (int i = 0; i < 7; i++) {
      System.out.println("Digite la Nota " + (i+1) + ":");
      notas[i] = dato.nextDouble();
    }
    while (c < notas.length) {
      System.out.println("Nota " + (c + 1) + ": " + notas[c]);
      suma = suma + notas[c];
      System.out.println("La Suma Va En: " + suma);
      c++;
    }
    System.out.println("Suma: " + suma);
    promedio = (suma / 7);
    System.out.println("El Nota Promedio Es: " + promedio);
    dato.close();
  }
}


