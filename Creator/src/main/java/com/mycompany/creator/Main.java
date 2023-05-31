
package com.mycompany.creator;

import com.mycompany.creator.reproductor.CreadorReproductorAudio;
import com.mycompany.creator.reproductor.ReproductorAudio;


public class Main {

    public static void main(String[] args) {
        // Crear un objeto de tipo ReproductorAudio utilizando el ReproductorAudioFactory
        ReproductorAudio reproductor = CreadorReproductorAudio.crearReproductorAudio("mp3");

        // Utilizar los métodos del reproductor de audio
        reproductor.reproducir();
        reproductor.pausar();
        reproductor.detener();
    }
}
