package Programacion.Unidad5.Relacion3.Ejercicio1;

public class Amarre {

     private static int numeroAmarres;
    private int numero;
    private double longitudMaxima;
    public double precioDia;
    private boolean ocupado;
    public String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, double precioDia, boolean ocupado, String tipoAmarre) {
        this.numero = numero;
        this.longitudMaxima = longitudMaxima;
        this.ocupado = ocupado;
        setTipoAmarre(tipoAmarre);
        calcularPrecioDia();
    }


     private void asignarAmarre(){
        numero = numeroAmarres;
        numeroAmarres++;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getOcupado() {
    return ocupado;
}
    public void setNumero() {
        if (numero > 0) {
            this.numero = numero;
        } else {
            imprimirMensajeError("Numero debe ser mayor que 0");
        }
    }

    private void imprimirMensajeError(String mensajeError){
        System.err.println(mensajeError);
    }

    public double getLongitudMaxima() {
        if (longitudMaxima == -1) {
            imprimirMensajeError("Longitud maxima con valor erroneo al ser menos de 4.0M");
        }
        return longitudMaxima;
    }

    public double getPrecioDia() {
        if (precioDia == -1) {
            imprimirMensajeError("Longitud máxima con valor erroneo al ser menor de 4.0M. Solucionelo por favor");
        }
        return precioDia;    }
    private void calcularPrecioDia() {
        if (tipoAmarre!=null&&longitudMaxima!=0.0) { 
        if (tipoAmarre.equals("Normal")) {
            precioDia = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equals("Premium")) {
            precioDia = 60 + (2.2 * longitudMaxima);
        } else if (tipoAmarre.equals("Megayate")) {
            precioDia = 120 + (3.5 * longitudMaxima);
        } else {
            precioDia = 0;
        }
    }
    }

    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
            calcularPrecioDia();
        } else {
            //añado valor por defecto si falla el setlongitudmaxima a -1
            //para cumplir las restriciones ya que 0 no seria valor añadido
            this.longitudMaxima = -1;
            precioDia = -1;
        }
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (tipoAmarre.equals("Normal") ||
                tipoAmarre.equals("Premium") ||
                tipoAmarre.equals("Megayate")) {

            this.tipoAmarre = tipoAmarre;
        } else {
            System.out.println("Tipo de amarre no válido.");
        }
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado=ocupado;
    }

    @Override
public String toString() {
    return "El amarre número " + numero +
           " es de tipo " + tipoAmarre +
           ", tiene un precio por día de " + precioDia + " euros" +
           " y actualmente está " + (getOcupado()) + ".";
}

    

    
}
