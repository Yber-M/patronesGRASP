package com.mycompany.creator.reproductor;

public class CreadorReproductorAudio {

    public static ReproductorAudio crearReproductorAudio(String formato) {
        if (formato.equalsIgnoreCase("mp3")) {
            return new ReproductorMP3();
        } else if (formato.equalsIgnoreCase("wav")) {
            return new ReproductorWAV();
        } else if (formato.equalsIgnoreCase("flac")) {
            return new ReproductorFLAC();
        } else {
            throw new IllegalArgumentException("Formato de archivo no soportado");
        }
    }
}


