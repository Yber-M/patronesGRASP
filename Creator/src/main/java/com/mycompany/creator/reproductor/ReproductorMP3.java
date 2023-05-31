package com.mycompany.creator.reproductor;

public class ReproductorMP3 implements ReproductorAudio{

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo MP3");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando archivo MP3");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo archivo MP3");
    }
    
}
