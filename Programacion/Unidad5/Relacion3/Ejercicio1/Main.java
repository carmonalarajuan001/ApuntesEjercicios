package Programacion.Unidad5.Relacion3.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Crear el puerto
        Puerto puerto = new Puerto("Puerto Central", "Barcelona", 50, "987654321");

        // 2️⃣ Crear amarres
        Amarre a1 = new Amarre(1, 10.0, 0, false, "Normal");
        a1.calcularPrecioDia(); // calcular precio automáticamente
        Amarre a2 = new Amarre(2, 20.0, 0, false, "Premium");
        a2.calcularPrecioDia();
        Amarre a3 = new Amarre(3, 30.0, 0, false, "Megayate");
        a3.calcularPrecioDia();

        puerto.getAmarres()[0] = a1;
        puerto.getAmarres()[1] = a2;
        puerto.getAmarres()[2] = a3;

        // 3️⃣ Crear embarcaciones
        Embarcacion e1 = new Embarcacion("ABC123", "Mar Azul", 9.5, "Velero", "Juan Pérez", 2010);
        e1.setValorEstimado(50000);

        Embarcacion e2 = new Embarcacion("DEF456", "Oleaje", 19.0, "Yate", "María López", 2018);
        e2.setValorEstimado(120000);

        Embarcacion e3 = new Embarcacion("GHI789", "Viento", 28.0, "Catamarán", "Carlos Ruiz", 2020);
        e3.setValorEstimado(250000);

        // 4️⃣ Registrar embarcaciones en el puerto
        puerto.getEmbarcaciones()[0] = e1;
        puerto.getEmbarcaciones()[1] = e2;
        puerto.getEmbarcaciones()[2] = e3;

        // 5️⃣ Asignar amarres manualmente (sencillo, sin métodos complejos aún)
        puerto.getMatriculasAmarradas()[0] = e1.getMatricula();
        a1.setOcupado(  true);

        puerto.getMatriculasAmarradas()[1] = e2.getMatricula();
        a2.setOcupado(  true);

        puerto.getMatriculasAmarradas()[2] = e3.getMatricula();
        a3.setOcupado(  false);

        // 6️⃣ Mostrar algunos datos para comprobar
        System.out.println("Puerto: " + puerto.getNombre());
        System.out.println("Amarres ocupados:");

        for (int i = 0; i < puerto.getAmarres().length; i++) {
            Amarre amarre = puerto.getAmarres()[i];
            if (amarre != null && amarre.getOcupado()) {
                System.out.println("Amarre " + amarre.getNumero() + " ocupado por: " + puerto.getMatriculasAmarradas()[i] + " Precio: " + amarre.precioDia);
            }
        }

        // 7️⃣ Ingresos diarios actuales
        double ingresos = 0;
        for (int i = 0; i < puerto.getAmarres().length; i++) {
            Amarre amarre = puerto.getAmarres()[i];
            if (amarre != null && amarre.getOcupado()) {
                ingresos += amarre.precioDia;
            }
        }
        System.out.println("Ingresos diarios actuales: " + ingresos);

        // 8️⃣ Liberar un amarre
        puerto.getMatriculasAmarradas()[1] = null;
        a2.setOcupado(false); 
        System.out.println("Se liberó el amarre 2");

        // 9️⃣ Ingresos tras liberar
        ingresos = 0;
        for (int i = 0; i < puerto.getAmarres().length; i++) {
            Amarre amarre = puerto.getAmarres()[i];
            if (amarre != null && amarre.getOcupado()) {
                ingresos += amarre.precioDia;
            }
        }
        System.out.println("Ingresos diarios actuales tras liberar un amarre: " + ingresos);
    }
}

    