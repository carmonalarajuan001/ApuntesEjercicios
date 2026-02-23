package Programacion.Unidad5.Relacion3.Ejercicio1;

import java.time.Year;

public class Embarcacion {

    private static int numeroEmbarcacaciones;
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario,
            int anioFabricacion) {

        setMatricula(matricula);
        numeroEmbarcacaciones++;
        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado < 0 ? 0 : valorEstimado;
    }

    // GETTERS//
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    // SETTERS//

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.isBlank()) {
            this.matricula = matricula;
            numeroEmbarcacaciones++;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Velero") ||
                tipo.equals("Lancha") ||
                tipo.equals("Yate") ||
                tipo.equals("Catamarán") ||
                tipo.equals("Moto de agua")) {
            this.tipo = tipo;
            //TAMBIEN SE PUEDE HACER CON UN ARRAY.CONTAINS
        }
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setAnioFabricaion(int anioFabricacion) {
        //Uso el codigo correspondiente para usar el año actual y como codigo y no como un año concreto.
        if (anioFabricacion > 1950 && anioFabricacion < Year.now().getValue()) {
            this.anioFabricacion = anioFabricacion;
        }
    }

    public void setValorEstimado(double valorEstimado) {
        if (valorEstimado >= 0) {
            this.valorEstimado = valorEstimado;
        } else {
            this.valorEstimado = 0;
        }

    }

    @Override
    public String toString() {
        return nombre + " matricula = " + matricula + "con eslora=" + eslora + " m de eslora de " + propietario + ". Es una embarcación tipo=" + tipo
                 + " del año = " + anioFabricacion + "con un valor estimado de = " + valorEstimado;
    }

    
}
