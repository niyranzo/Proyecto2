package clases;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class Capa {
    private static int siguienteNumeroCapa;
    private int numero;
    private BufferedImage lienzo;
    private Lapiz lapiz;

    public Capa(int ancho, int alto){
        siguienteNumeroCapa+=1;
        this.numero=siguienteNumeroCapa;
        this.lienzo=new BufferedImage(ancho, alto, BufferedImage.TYPE_4BYTE_ABGR);
        this.lapiz= new LapizSwing(this.lienzo.getGraphics());
    }
    public int getNumero(){
        return this.numero;
    }
    public Lapiz getLapiz(){
        return this.lapiz;
    }
    public BufferedImage getLienzo(){
        return this.lienzo;
    }
    public int getAncho(){
        return this.lienzo.getWidth();
    }
    public int getAlto(){
        return this.lienzo.getHeight();
    }

    public static Image dibujarCapas(List<Capa> capas, int capaPrincipal){
        BufferedImage bf = new BufferedImage(capas.get(0).getAncho(), capas.get(0).getAlto(), BufferedImage.TYPE_4BYTE_ABGR);

        Graphics2D graphics = (Graphics2D) bf.getGraphics();
        for (int i = 0; i < capas.size(); i++) {
            if (capas.get(i).getNumero()==capaPrincipal){
                graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
                graphics.drawImage(bf, null, 0,0);
            }else {
                graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));

            }
        } Image image = SwingFXUtils.toFXImage(bf, null);
        return image;
    }

    public static void combinarCapas(List<Capa> capas){
        capas.get(0).getLapiz();

    }

    @Override
    public String toString() {
        return "capa " + this.numero;
    }
}
