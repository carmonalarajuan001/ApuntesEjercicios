import java.util.ArrayList;
import java.util.Scanner;

public class r2e1 {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          ArrayList<Integer> temperaturas = new ArrayList<>();
          Integer temperaturaSolicitada;
          Integer opcion = 0;

          for (int i = 1; i <= 7; i++) {
               System.out.println("Introduzca la temperatura del día");
               temperaturaSolicitada = scanner.nextInt();
               temperaturas.add(temperaturaSolicitada);
          }
          while (opcion!=4) {
            
          
          System.out.println("1. Mostrar la temperatura más alta registrada, 2. Mostrar la temperatura más baja registrada, 3. Calcular la temperatura promedio de la semana, 4. Salir del programa.");
          opcion = scanner.nextInt();


          if (opcion == 1) {

        Integer temperaturaMaxima = temperaturas.get(0);

        for (Integer i = 1; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > temperaturaMaxima) {
                temperaturaMaxima = temperaturas.get(i);
            }
        }
        System.out.println("La temperatura máxima es de " + temperaturaMaxima + " ºC");

    } else if (opcion == 2) {

        Integer temperaturaMinima = temperaturas.get(0);

         for (int i = 1; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) < temperaturaMinima) {
                temperaturaMinima = temperaturas.get(i);
            }
        }

        System.out.println("La temperatura mínima es de " + temperaturaMinima + " ºC");

    } else if (opcion == 3) {

        Integer sumatorioTemperaturas = 0;

        for (Integer i = 0; i < temperaturas.size(); i++) {
            sumatorioTemperaturas += temperaturas.get(i);
        }

        Integer temperaturaMedia = sumatorioTemperaturas / temperaturas.size();

        System.out.println("La temperatura media es de " + temperaturaMedia + " ºC");
    }
    scanner.nextLine();
    }
    scanner.close();
    }
   
}