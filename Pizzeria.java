import java.util.Scanner;

/* Una pizzería, vende sus pizzas en tres tamaños:
  · Pequeña (10 pulg. de diámetro)
  · Mediana (12 pulg. de diámetro)
  · Grandes (16 pulg. de diámetro)
  Una pizza puede ser sencilla (con sólo salsa y carne), o con ingredientes extras, tales como peperonni,
  champiñones, carnes o pollo.
  Los propietarios desean desarrollar un programa que calcule el precio de venta de una pizza, dándole el tamaño y
  el número de ingredientes extras. El precio de venta será 1.5 veces el costo total, que viene determinado por el
  área de la pizza, más el numero de ingredientes.
  En particular el costo total se calcula sumando:
  · Un costo fijo de preparación.
  · Un costo base variable que es proporcional al tamaño de la pizza.
  · Un costo adicional por cada ingrediente extra. Por simplicidad se supone que cada ingrediente extra tiene el
  mismo costo por unidad de área.
  */

public class Pizzeria {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    // Variables
    //int p_v_p;
    double costoTotal;
    double costoFijo = 5000;
    double cantIngredientes = 0;
    double costoIngExtrapq = 3000;
    double costoIngExtramd = 4500;
    double costoIngExtragd = 6000;
    double costoVariablepq = 5000;
    //double costoVariablemd = 7000;
    //double costoVariablegd = 9000;
    double ingredientes;
    
    System.out.println("De Que Tamaño Quieres Tu Pizza: ");
    System.out.println("1 - Pequeña (10 Pulgadas)\n2 - Mediana (12 Pulgadas)\n3 - Grande (16 Pulgadas)");
    int tamañoPizza = teclado.nextInt();
    System.out.println("Deseas Agregar Ingredientes Adicionales: ");
    do {
      System.out.println("1 - Champiñones \n2 - Peperoni \n3 - Carnes \n4 - Pollo \n5 - Maizcitos\n6 - Ningun Ingrediente");
      ingredientes = teclado2.nextInt();
      if (ingredientes == 6) {
        break;
      } else {
        cantIngredientes++;
      }
    } while (ingredientes != 6);
    if (cantIngredientes == 0) {
      switch (tamañoPizza){
          case 1:
            costoTotal = (costoFijo + costoVariablepq) * 1.5;
            System.out.println(" Tu Pizza Sencilla Pequeña Cuesta: " + costoTotal);
            break;
          case 2:
            costoTotal = (costoFijo + (costoVariablepq * 1.4)) * 1.5;
            System.out.println(" Tu Pizza Sencilla Mediana Cuesta: " + costoTotal);
            break;
          case 3:
            costoTotal = (costoFijo + (costoVariablepq * 1.8)) * 1.5;
            System.out.println(" Tu Pizza Sencilla Grande Cuesta: " + costoTotal);
            break;
        }
      } else {
        switch (tamañoPizza) {
          case 1:
            costoTotal = (costoFijo + costoVariablepq + (costoIngExtrapq * cantIngredientes)) * 1.5;
            System.out.println(" Tu Pizza Pequeña Cuesta: " + costoTotal);
            break;
          case 2:
            costoTotal = (costoFijo + (costoVariablepq * 1.4) + (costoIngExtramd * cantIngredientes)) * 1.5;
            System.out.println(" Tu Pizza Mediana Cuesta: " + costoTotal);
            break;
          case 3:
            costoTotal = (costoFijo + (costoVariablepq * 1.8) + (costoIngExtragd * cantIngredientes)) * 1.5;
            System.out.println(" Tu Pizza Grande Cuesta: " + costoTotal);
            break;
        }
      }
      teclado.close(); 
      teclado2.close();
    }
  }
