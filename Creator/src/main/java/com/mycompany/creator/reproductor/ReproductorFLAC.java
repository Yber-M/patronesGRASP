package com.mycompany.creator.reproductor;

public class ReproductorFLAC implements ReproductorAudio{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo FLAC");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando archivo FLAC");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo archivo FLAC");
    }
}


