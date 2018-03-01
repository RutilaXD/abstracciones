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
public class Guitarra {
    private String color;
    private String material;
    private String tipoGuitarra;
    private String cuerdas;
    private String marca;
    private int trastes;

    public Guitarra() {
        color = "negro 6 ambar";
        material = "acero";
        tipoGuitarra = "electrica";
        cuerdas = "acero";
        marca = "smith fire";
        trastes = 23;
        
    }

    public Guitarra(String color, String material, String tipoGuitarra, String cuerdas, String marca, int trastes) {
        this.color = color;
        this.material = material;
        this.tipoGuitarra = tipoGuitarra;
        this.cuerdas = cuerdas;
        this.marca = marca;
        this.trastes = trastes;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the cuerdas
     */
    public String getCuerdas() {
        return cuerdas;
    }

    /**
     * @param cuerdas the cuerdas to set
     */
    public void setCuerdas(String cuerdas) {
        this.cuerdas = cuerdas;
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
     * @return the trastes
     */
    public int getTrastes() {
        return trastes;
    }

    /**
     * @param trastes the trastes to set
     */
    public void setTrastes(int trastes) {
        this.trastes = trastes;
    }

    /**
     * @return the tipoGuitarra
     */
    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    /**
     * @param tipoGuitarra the tipoGuitarra to set
     */
    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }
}
