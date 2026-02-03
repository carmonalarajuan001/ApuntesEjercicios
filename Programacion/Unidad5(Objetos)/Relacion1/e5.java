import java.util.Scanner;
public class e5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una temperatura en Celsius:");
        double temp = sc.nextDouble();

        termometro termometro1 = new termometro(temp);
        termometro1.convertirAFahrenheit();
        System.out.println(termometro1);

        sc.close();
    }
}

class termometro {
    double temperatura;

    termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    void convertirAFahrenheit(){
        temperatura = (temperatura * 9 / 5) + 32;
    }
    @Override
    public String toString() {
        return "Temperatura en Fahrenheit: " + temperatura;
    }
}
