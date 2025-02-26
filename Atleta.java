import java.util.Scanner;

/* 2.14. Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco kilómetros durante 10 días,
  para determinar si es apto para la prueba de 5 Km. o debe buscar otra especialidad.
  Para considerarlo apto debe cumplir por lo menos una de las siguientes condiciones:
· Que en ninguna de las pruebas haga un tiempo mayor a 16 minutos.
· Que al menos en una de las pruebas realice un tiempo mayor a 16 minutos.
· Que su promedio de tiempos sea menor o igual a 15 minutos.
*/

public class Atleta {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Variables
    double suma = 0;
    int c = 0;
    double tiempo_Alto = 0;
    double tiempo_Bajo = 0;
    double promedio = 0;
    double[] tiempo = new double[10];

    for (int i = 0; i < 10; i++) {
      System.out.println("Indica El Tiempo Del Dia " + (i + 1) + ":");
      tiempo[i] = teclado.nextInt();
    }
    while (c < tiempo.length) {
      System.out.println("El Tiempo Del Dia " + (c + 1) + " Es: " + tiempo[c] + " Minutos");
      suma = suma + tiempo[c];
      if (tiempo[c] > 16) {
          tiempo_Alto = tiempo_Alto + 1;
        } else if (tiempo[c] <= 16) {
          tiempo_Bajo = tiempo_Bajo + 1;
        }
      c++;
    }
    if (tiempo_Alto == 0 && promedio <= 15) {
      System.out.println("Felicitaciones....Eres Apto Para La Prueba De 5 Kms");
    } else if (tiempo_Alto == 1) {
      System.out.println("Tuviste Una Prueba con tiempo Alto.....Eres Apto Pero Debes Mejorar");
    }
    promedio = (suma / 10);
    System.out.println("Tienes Un Tiempo Promedio De: " + promedio);
    teclado.close();
  }
}
