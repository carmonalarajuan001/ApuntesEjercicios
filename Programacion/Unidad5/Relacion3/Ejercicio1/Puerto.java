package Programacion.Unidad5.Relacion3.Ejercicio1;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    ArrayList<Amarre> amarres;
    ArrayList<Embarcacion> embarcaciones;
    ArrayList<String> matriculasAmarradas;

    public Puerto(String nombre, String ubicacion, int capacidadMaxima, String telefonoContacto,
            ArrayList<Amarre> amarres, ArrayList<Embarcacion> embarcaciones, ArrayList<String> matriculasAmarradas) {
        setNombre(nombre + "");

        this.ubicacion = ubicacion;
        setCapacidadMaxima(capacidadMaxima);
        this.telefonoContacto = telefonoContacto;
        setAmarres(amarres);
        setEmbarcaciones(embarcaciones);
        setMatriculasAmarradas(matriculasAmarradas);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (amarres.size() <= capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
        }
    }

    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void setAmarres(ArrayList<Amarre> amarres) {
        // COMPLETAR
    }

    public ArrayList<Embarcacion> getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(ArrayList<Embarcacion> embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public ArrayList<String> getMatriculasAmarradas() {
        return matriculasAmarradas;
    }

    public void setMatriculasAmarradas(ArrayList<String> matriculasAmarradas) {
        this.matriculasAmarradas = matriculasAmarradas;
    }

    public void AsignarNombre() {
        setNombre("Puerto-" + numeroPuertos);
        numeroPuertos++;
    }

    public boolean registrarEmbarcacion(Embarcacion e) {
        boolean embarcacionRegistrada = false;
        if (!embarcaciones.contains(e)) {
            embarcaciones.add(e);
            matriculasAmarradas.add("VACIO");
            embarcacionRegistrada = true;
        }
        return embarcacionRegistrada;
    }

    public boolean altaAmarre(Amarre a) {
        boolean amarreRegistrado = false;
        if (!amarres.contains(a)) {
            amarres.add(a);
            amarreRegistrado = true;
        }
        return amarreRegistrado;
    }

    // Devuelve la embarcacion si la encuenra o null si no
    public  Embarcacion buscarEmbarcacion(String matricula){
        Embarcacion embarcacionBuscar=null;
        for (Embarcacion embarcacion : embarcaciones) {
            if (matricula.equals(embarcacion.getMatricula())) {
                embarcacionBuscar = 
            }
        }
    }

    public boolean asignarAmarre(String matricula, int numeroAmarre) {
        boolean amarreAsignado = true;
        Amarre amarreAsignar = amarres.get(numeroAmarre);
        Embarcacion embarcacionAsignar = buscarEmbarcacion(matricula);
        if (!matriculasAmarradas.contains(embarcacionAsignar.getMatricula())) {
            if (!amarreAsignar.getOcupado()) {
                if (embarcacionAsignar.getEslora() <= amarreAsignar.getLongitudMaxima()) {
                    matriculasAmarradas.set(numeroAmarre, matricula);
                    amarreAsignado = true;
                }
            }
        }

        return amarreAsignado;
    }

}
