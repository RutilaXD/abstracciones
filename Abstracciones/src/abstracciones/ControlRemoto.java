/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracciones;

/**
 *
 * @author Raul
 */
public class ControlRemoto {
    private int tamanio;
    private String color;
    private String marca;
    private String tPilas;
    private boolean enUso;
    private String controla;

    public ControlRemoto() {
        tamanio = 10;
        color = "negro";
        marca = "xbox";
        tPilas = "AA";
        enUso = true;
        controla = "xbox";
    }
  
    public ControlRemoto(int tamanio, String color, String marca, String tPilas, boolean enUso, String controla) {
        this.tamanio = tamanio;
        this.color = color;
        this.marca = marca;
        this.tPilas = tPilas;
        this.enUso = enUso;
        this.controla = controla;
    }

    /**
     * @return the tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tPilas
     */
    public String gettPilas() {
        return tPilas;
    }

    /**
     * @param tPilas the tPilas to set
     */
    public void settPilas(String tPilas) {
        this.tPilas = tPilas;
    }

    /**
     * @return the enUso
     */
    public boolean isEnUso() {
        return enUso;
    }

    /**
     * @param enUso the enUso to set
     */
    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    /**
     * @return the controla
     */
    public String getControla() {
        return controla;
    }

    /**
     * @param controla the controla to set
     */
    public void setControla(String controla) {
        this.controla = controla;
    }
}
