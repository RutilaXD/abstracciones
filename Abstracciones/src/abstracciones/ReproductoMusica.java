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
public class ReproductoMusica {
    private int canciones;
    private int albumes;
    private int artistas;
    private boolean virtual;
    private String cancionAct;

    public ReproductoMusica() {
        canciones = 50;
        albumes = 10;
        artistas = 5;
        virtual = true;
        cancionAct = "Quiero x2";
    }

    public ReproductoMusica(int canciones, int albumes, int artistas, boolean virtual, String cancionAct) {
        this.canciones = canciones;
        this.albumes = albumes;
        this.artistas = artistas;
        this.virtual = virtual;
        this.cancionAct = cancionAct;
    }

    /**
     * @return the canciones
     */
    public int getCanciones() {
        return canciones;
    }

    /**
     * @param canciones the canciones to set
     */
    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    /**
     * @return the albumes
     */
    public int getAlbumes() {
        return albumes;
    }

    /**
     * @param albumes the albumes to set
     */
    public void setAlbumes(int albumes) {
        this.albumes = albumes;
    }

    /**
     * @return the artistas
     */
    public int getArtistas() {
        return artistas;
    }

    /**
     * @param artistas the artistas to set
     */
    public void setArtistas(int artistas) {
        this.artistas = artistas;
    }

    /**
     * @return the virtual
     */
    public boolean isVirtual() {
        return virtual;
    }

    /**
     * @param virtual the virtual to set
     */
    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    /**
     * @return the cancionAct
     */
    public String getCancionAct() {
        return cancionAct;
    }

    /**
     * @param cancionAct the cancionAct to set
     */
    public void setCancionAct(String cancionAct) {
        this.cancionAct = cancionAct;
    }
}
