package com.mycompany.creator.reproductor ;

public class ReproductorWAV implements ReproductorAudio{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo WAV");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando archivo WAV");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo archivo WAV");
    }
}
