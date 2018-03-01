/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import abstracciones.*;
import java.util.Scanner;
/**
 *
 * @author Raul
 */
public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
//        Hacemos uso de los vaores por defecto que tiene la clase
        ControlRemoto c1 = new ControlRemoto();
        System.out.print("\nMostramos Control remoto 1: ");
        System.out.print("\ntamanio: "+c1.getTamanio());
        System.out.print("\ncolor: "+c1.getColor());
        System.out.print("\nmarca: "+c1.getMarca());
        System.out.print("\ntPilas: "+c1.gettPilas());
        System.out.print("\nenUso: "+c1.isEnUso());
        System.out.print("\ncontrola: "+c1.getControla()+"\n");
        
        Guitarra g1 = new Guitarra();
        System.out.print("\nMostranto Guitarra 1:");
        System.out.print("\ncolor: "+g1.getColor());
        System.out.print("\nmaterial: "+g1.getMaterial());
        System.out.print("\ntipoGuitarra: "+g1.getTipoGuitarra());
        System.out.print("\ncuerdas: "+g1.getCuerdas());
        System.out.print("\nmarca: "+g1.getMarca());
        System.out.print("\ntrastes: "+g1.getTrastes()+"\n");
        
        ReproductoMusica r1 = new ReproductoMusica();
        System.out.print("\nMostramos reprod 1: ");
        System.out.print("\ncanciones: "+r1.getCanciones());
        System.out.print("\nalbumes: "+r1.getAlbumes());
        System.out.print("\nartistas: "+r1.getArtistas());
        System.out.print("\nvirtual "+r1.isVirtual()); 
        System.out.print("\ncancion Actual: "+r1.getCancionAct()+"\n");
        
//        Creamos desde este programa otros objetos utilizando el constructor sobrecargado
        System.out.println("*****************************************************");
        System.out.println("\nAhora creamos otros objs...");
        
        ControlRemoto c2 = new ControlRemoto(15,"gris","VIOS","AAA",true,"DVD");
        Guitarra g2 = new Guitarra("ambar","madera","electro-acustica","acero","yamaha",22);
        ReproductoMusica r2 = new ReproductoMusica(20,5,2,true,"la la la");
        
        System.out.println("Mostrando su informacion...");
        System.out.print("\nMostramos Control remoto 2: ");
        System.out.print("\ntamanio: "+c2.getTamanio());
        System.out.print("\ncolor: "+c2.getColor());
        System.out.print("\nmarca: "+c2.getMarca());
        System.out.print("\ntPilas: "+c2.gettPilas());
        System.out.print("\nenUso: "+c2.isEnUso());
        System.out.print("\ncontrola: "+c2.getControla()+"\n");        
        
        System.out.print("\nMostranto Guitarra 2:");
        System.out.print("\ncolor: "+g2.getColor());
        System.out.print("\nmaterial: "+g2.getMaterial());
        System.out.print("\ntipoGuitarra: "+g2.getTipoGuitarra());
        System.out.print("\ncuerdas: "+g2.getCuerdas());
        System.out.print("\nmarca: "+g2.getMarca());
        System.out.print("\ntrastes: "+g2.getTrastes()+"\n");        
        
        System.out.print("\nMostramos reprod 2: ");
        System.out.print("\ncanciones: "+r2.getCanciones());
        System.out.print("\nalbumes: "+r2.getAlbumes());
        System.out.print("\nartistas: "+r2.getArtistas());
        System.out.print("\nvirtual "+r2.isVirtual()); 
        System.out.print("\ncancion Actual: "+r2.getCancionAct()+"\n");    
        
        
//        Aqui hacemos que el usuario cree el objeto con los valores que ingrese
        System.out.println("*****************************************************");
        System.out.println("\nAhora crea tu otros objs...");
        System.out.println("Para control remoto 3....");
        System.out.print("Tamanio: ");
        int tamanio = in.nextInt();
        System.out.print("\nColor: ");
        String color = in.next();
        System.out.print("\nMarca: ");
        String marca = in.next();
        System.out.print("\ntipo pilas: ");
        String tPilas = in.next();
        System.out.print("\nControla: ");
        String controla = in.next();
        ControlRemoto c3 = new ControlRemoto(tamanio, color, marca, tPilas, true, controla);
        
        System.out.println("Para Guitarra 3....");
        System.out.print("Color: ");
        color = in.next();
        System.out.print("\nMaterial: ");
        String material = in.next();
        System.out.print("\nTipo de guitarra: ");
        String tipoGuitarra = in.next();
        System.out.print("\nCuerdas: ");
        String cuerdas = in.next();
        System.out.print("\nMarca: ");
        marca = in.next();
        System.out.print("\nTrastes: ");
        int trastes = in.nextInt();
        Guitarra g3 = new Guitarra(color, material, tipoGuitarra, cuerdas, marca, trastes);
        
        System.out.println("Para reproductor 3....");
        System.out.print("No. canciones: ");
        int canciones = in.nextInt();
        System.out.print("\nNo. albumesl: ");
        int albumes = in.nextInt();
        System.out.print("\nNo. artistas: ");
        int artistas = in.nextInt();
        System.out.print("\nCancion actual: ");
        String cancionAct = in.next();
        ReproductoMusica r3 = new ReproductoMusica(canciones, albumes, artistas, true, cancionAct);
        
        System.out.println("Mostrando su informacion...");
        System.out.print("\nMostramos Control remoto 3: ");
        System.out.print("\ntamanio: "+c3.getTamanio());
        System.out.print("\ncolor: "+c3.getColor());
        System.out.print("\nmarca: "+c3.getMarca());
        System.out.print("\ntPilas: "+c3.gettPilas());
        System.out.print("\nenUso: "+c3.isEnUso());
        System.out.print("\ncontrola: "+c3.getControla()+"\n");        
        
        System.out.print("\nMostranto Guitarra 3:");
        System.out.print("\ncolor: "+g3.getColor());
        System.out.print("\nmaterial: "+g3.getMaterial());
        System.out.print("\ntipoGuitarra: "+g3.getTipoGuitarra());
        System.out.print("\ncuerdas: "+g3.getCuerdas());
        System.out.print("\nmarca: "+g3.getMarca());
        System.out.print("\ntrastes: "+g3.getTrastes()+"\n");        
        
        System.out.print("\nMostramos reprod 3: ");
        System.out.print("\ncanciones: "+r3.getCanciones());
        System.out.print("\nalbumes: "+r3.getAlbumes());
        System.out.print("\nartistas: "+r3.getArtistas());
        System.out.print("\nvirtual "+r3.isVirtual()); 
        System.out.print("\ncancion Actual: "+r3.getCancionAct()+"\n");   
        
        System.out.println("********************¡Adios!*********************");
    }
}
