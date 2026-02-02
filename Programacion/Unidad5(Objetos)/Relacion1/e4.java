public class e4 {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Corolla", 0);
        Auto auto2 = new Auto("Seat", "Ibiza", 50);

        auto1.acelerar(30);
        auto1.frenar(10);

        auto2.frenar(20);
        auto2.acelerar(40);

        System.out.println("Auto: " + auto1.marca + " " + auto1.modelo +
                " Velocidad: " + auto1.velocidadActual);

        System.out.println("Auto: " + auto2.marca + " " + auto2.modelo +
                " Velocidad: " + auto2.velocidadActual);
    }
}

class Auto {

    String marca;
    String modelo;
    int velocidadActual;

    Auto(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    void acelerar(int cantidad) {
        this.velocidadActual = this.velocidadActual + cantidad;
    }

    void frenar(int cantidad) {
        this.velocidadActual = this.velocidadActual - cantidad;
    }
}
