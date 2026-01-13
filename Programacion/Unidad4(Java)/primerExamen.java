import java.util.Scanner;

public class primerExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de pedidos: ");
        int numeroPedidos = sc.nextInt();

        System.out.print("Stock de arroz (g): ");
        double stockArroz = sc.nextDouble();

        System.out.print("Stock de agua (L): ");
        double stockAgua = sc.nextDouble();

        double sumaTotalAgua = 0;
        double sumaTotalArroz = 0;
        double cajaTotal = 0;

        int sumaMaki = 0;
        int sumaNigiri = 0;
        int sumaSashimi = 0;

        for (int i = 1; i <= numeroPedidos; i++) {

            System.out.print("Tipo de plato (maki/nigiri/sashimi): ");
            String tipo = sc.next();

            System.out.print("Unidades: ");
            int unidades = sc.nextInt();

            double arroz = 0;
            double agua = 0;
            double coste = 0;

            if (tipo.equals("maki")) {
                arroz = 120 * unidades;
                agua = 0.10 * unidades;
                coste = 8 * unidades;
            } 
            else if (tipo.equals("nigiri")) {
                arroz = 50 * unidades;
                agua = 0.05 * unidades;
                coste = 10 * unidades;
            } 
            else if (tipo.equals("sashimi")) {
                arroz = 0;
                agua = 0.02 * unidades;
                coste = 12 * unidades;
            }

            //variable para controlar si el pedido es válido
            boolean pedidoValido = true;

            if ((sumaTotalArroz + arroz) > stockArroz || (sumaTotalAgua + agua) > stockAgua) {
                System.out.println("❌ Stock insuficiente. Pedido cancelado.");
                pedidoValido = false;
            }

            //solo se acumula si el pedido es válido
            if (pedidoValido) {
                sumaTotalArroz += arroz;
                sumaTotalAgua += agua;
                cajaTotal += coste;

                if (tipo.equals("maki")) sumaMaki += unidades;
                else if (tipo.equals("nigiri")) sumaNigiri += unidades;
                else if (tipo.equals("sashimi")) sumaSashimi += unidades;

                System.out.println("Plato: " + tipo + " | Unidades: " + unidades + " | Importe: " + coste + " €");
                System.out.println("Arroz pedido: " + arroz + " g | Acumulado: " + sumaTotalArroz);
                System.out.println("Agua pedido: " + agua + " L | Acumulado: " + sumaTotalAgua);
                System.out.println("---------------------------------");
            }
        }

        double arrozRestante = stockArroz - sumaTotalArroz;
        double aguaRestante = stockAgua - sumaTotalAgua;

        System.out.println("\n📊 RESUMEN DEL DÍA");
        System.out.println("Maki: " + sumaMaki + " | Nigiri: " + sumaNigiri + " | Sashimi: " + sumaSashimi);
        System.out.println("Arroz usado: " + sumaTotalArroz + " g");
        System.out.println("Agua usada: " + sumaTotalAgua + " L");
        System.out.println("Arroz restante: " + arrozRestante + " g");
        System.out.println("Agua restante: " + aguaRestante + " L");
        System.out.println("Caja total: " + cajaTotal + " €");

        System.out.println("Registro completado ✅");

        sc.close();
    }
}
