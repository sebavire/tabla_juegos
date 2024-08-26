package com.mycompany.tabla_juegos;

public class Juego {
    private String nombre;
    private String desarrollador;
    private String añoLanzamiento;

    
    public Juego(String nombre, String desarrollador, String añoLanzamiento) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(String añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
}
