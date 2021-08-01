package org.pokeTamagochi;

public class Pokemon {
    private int id;
    private String nombre;
    private String tipo;
    private int nivel;

    //setters/getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pokemon(){}

    public Pokemon(int id, String nombre, String tipo, int nivel){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
