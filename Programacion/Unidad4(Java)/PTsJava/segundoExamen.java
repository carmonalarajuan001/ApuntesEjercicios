import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class segundoExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String DIENTE = "D";
        final int NUMERODIENTES = 10;
        final int MAXDIENTESPICADOS = 5;
        final char DIENTESANO = 'b';
        final char DIENTEDANIADO = 'm';
        final int DIENTESPICADOS = (int) (Math.random() * MAXDIENTESPICADOS) + 1;

        final int DIENTESNOPICADOS = NUMERODIENTES - DIENTESPICADOS;
        final String JUGADOR1 = null;
        final String JUGADOR2;

        Boolean juegoPerdido = false;
        ArrayList<Integer> tableroInterno = new ArrayList<Integer>();
        ArrayList<String> tableroVisible = new ArrayList<String>();
        String jugadorActual = JUGADOR1;
        String mensajeFinPrograma = "Enhorabuena, ambos ganan";
        int posicionSeleccionada = 0;
        int dientesPicadosIntroducidos = 0;
        int posicionDienteIntroducir = 0;

        for (int i = 0; i < NUMERODIENTES; i++) {
            tableroInterno.add(0);
            
        }
        System.out.println(tableroInterno);


        while (dientesPicadosIntroducidos<=DIENTESPICADOS) {
            posicionDienteIntroducir = (int) (Math.random() * NUMERODIENTES);
            if (tableroInterno.get(posicionDienteIntroducir).equals(0)) {
                tableroInterno.set(posicionDienteIntroducir, 1);
                dientesPicadosIntroducidos++;
            }
        }

        for (int i = 0; i < NUMERODIENTES; i++) {
            tableroVisible.add(DIENTE);
        }
        for (int i = 0; i < DIENTESNOPICADOS && !juegoPerdido; i++) {
            
            do {
                System.out.print(jugadorActual + " elige: ");
                posicionSeleccionada = Scanner.nextInt();
            } while (tableroVisible);
        }
        
        
    }
}