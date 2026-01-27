import java.util.ArrayList;

public class r1e8 {

    public static Integer elementoAleatorio(ArrayList<Integer> arrayParametro) {
        int elemenAle = 0;
        int numeroAleatorio;
        elemenAle=(int) Math.floor(Math.random() * arrayParametro.size()); 
        numeroAleatorio=arrayParametro.get(elemenAle);
        return numeroAleatorio;
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
        System.out.println(elementoAleatorio(numerosArrayPrueba));
    }

}

