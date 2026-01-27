import java.util.ArrayList;

public class r0e16 {
    public static Boolean verificarNumeroEnArray(Integer valor, ArrayList<Integer> arrayNumeros) {
        Boolean estaEnArray = false;
        for (int i = 0; i < arrayNumeros.size(); i++) {
            if (arrayNumeros.get(i) == valor) {
                estaEnArray = true;
            }
        }
        return estaEnArray;
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
        System.out.println(verificarNumeroEnArray(1, numerosArrayPrueba));
    }
}