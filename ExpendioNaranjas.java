import java.util.Scanner;

/* 
  2.12. Al cerrar un expendio de naranjas, 15 clientes que aun no han pagado recibirán un 15% de descuento si compran
  más de 10 kilos. Determinar cuanto pagara cada cliente y cuanto percibirá la tienda por esas compras.
*/

public class ExpendioNaranjas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Variables
    //double naranjas;
    double descuento;
    double suma = 0;
    double precio = 3500;
    int c = 0;

    double[] kilos_Naranja = new double[15];
    double[] pago_Total = new double[15];

    for (int i = 0; i < 15; i++) {
      System.out.println("Cliente " + (i + 1) + ":");
      System.out.println(" Digite Cuantos Kilos De naranja Lleva");
      kilos_Naranja[i] = teclado.nextDouble();
      
    }
    while (c < kilos_Naranja.length) {
      if (kilos_Naranja[c] >= 10) {
        descuento = (kilos_Naranja[c] * precio) * 0.15;
        pago_Total[c] = ((kilos_Naranja[c] * precio) - descuento);
      } else {
        pago_Total[c] = kilos_Naranja[c] * precio;
      }

      System.out.println("El Cliente " + (c + 1) + " Paga: " + pago_Total[c]);
      suma = suma + pago_Total[c];
      c++;
    }
    System.out.println("La Tienda Recibe En Total: " + suma);
    teclado.close();
  }
}
