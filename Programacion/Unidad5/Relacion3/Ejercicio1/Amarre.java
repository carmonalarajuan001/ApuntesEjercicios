package Programacion.Unidad5.Relacion3.Ejercicio1;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    public double precioDia;
    private boolean ocupado;
    public String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, double precioDia, boolean ocupado, String tipoAmarre) {
        this.numero = numero;
        this.longitudMaxima = longitudMaxima;
        this.precioDia = precioDia;
        this.ocupado = ocupado;
        this.tipoAmarre = tipoAmarre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(){
        if (numero>0) {
            this.numero=numero;
        }else{
            System.out.println("Numero debe ser mayor que 0");
        }
    }

    public double getLongitudMaxima(){
        return longitudMaxima;
    }




    public void calcularPrecio() {
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
    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
            calcularPrecio(); // recalcular precio
        } else {
            System.out.println("La longitud mínima es 4.0 metros.");
        }
    }

    public void setTipoAmarre(String tipoAmarre){
        if (tipoAmarre.equals("Normal") ||
            tipoAmarre.equals("Premium") ||
            tipoAmarre.equals("Megayate")) {

            this.tipoAmarre = tipoAmarre;
            calcularPrecio(); // recalcular precio
        } else {
            System.out.println("Tipo de amarre no válido.");
        }
    }
    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void ocupacionBarco(){
        
    }
}
