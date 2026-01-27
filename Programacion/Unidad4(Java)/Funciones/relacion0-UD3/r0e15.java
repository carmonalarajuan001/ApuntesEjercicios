import java.util.ArrayList;

public class r0e15 {
    public static ArrayList<Integer> filtrarNumerosMayores(Integer valor, ArrayList<Integer> arrayNumeros) {

        ArrayList<Integer> numerosMayores = new ArrayList<>();
        for (int i = 0; i < arrayNumeros.size(); i++) {
            if (arrayNumeros.get(i) > valor) {
                numerosMayores.add(arrayNumeros.get(i));
            }
        }

        return numerosMayores;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numerosArrayPrueba = new ArrayList<>();
        numerosArrayPrueba.add(45);
        numerosArrayPrueba.add(50);
        numerosArrayPrueba.add(78);
        numerosArrayPrueba.add(93);
        numerosArrayPrueba.add(14);
        numerosArrayPrueba.add(77);
        numerosArrayPrueba.add(20);
        //TRATAR EL ARRAY ANTES DE PONERLO EN CONSOLA CON UN FOR
        System.out.println(filtrarNumerosMayores(20, numerosArrayPrueba));
    }
}
