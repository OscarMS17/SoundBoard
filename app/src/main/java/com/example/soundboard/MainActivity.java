package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     //se declara el archivo multimedia
    MediaPlayer Delfines;
    MediaPlayer Gato;
    MediaPlayer Gallo;
    MediaPlayer Lobesno;
    MediaPlayer Mono;
    MediaPlayer Loquillo;
    MediaPlayer Perro;
    MediaPlayer Pajarito;
    MediaPlayer Vacas;


    //declaracion de botones a usar
    Button gato1;
    Button Caballo;
    Button gallo;
    Button lobesno;
    Button mono;
    Button loquillo;
    Button perro;
    Button pajarito;
    Button vacas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se indica cual es la ruta donde se encuentra el arcvhivo a reproducirse
        Delfines = MediaPlayer.create(this, R.raw.delfines);
        Gato = MediaPlayer.create(this, R.raw.gato);
        Gallo = MediaPlayer.create(this, R.raw.gallodespertador);
        Lobesno = MediaPlayer.create(this, R.raw.lobo);
        Mono = MediaPlayer.create(this, R.raw.mono);
        Loquillo = MediaPlayer.create(this, R.raw.pajaroloco);
        Perro = MediaPlayer.create(this, R.raw.perro);
        Pajarito = MediaPlayer.create(this, R.raw.silbidopajaro);
        Vacas = MediaPlayer.create(this, R.raw.vacas);


       //Conectamos los botones de la vista con los botones locales

        Caballo = (Button) findViewById(R.id.Delfin);
        gato1 = (Button) findViewById(R.id.Nekito);
        gallo = (Button) findViewById(R.id.GalloDespertador);
        lobesno = (Button) findViewById(R.id.Lobo);
        mono = (Button) findViewById(R.id.Mono);
        loquillo = (Button) findViewById(R.id.PajaroLoco);
        perro = (Button) findViewById(R.id.Perro);
        pajarito = (Button) findViewById(R.id.Pajaro);
        vacas = (Button) findViewById(R.id.Vaca);

        //les asignamos uso a los botones para que reproduscan el sonido

        gato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Gato.isPlaying()){
                    Gato.seekTo(0);
                    Gato.start();

                }
                else{
                    Gato.pause();
                }
            }
        });
        Caballo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Delfines.isPlaying()){
                    Delfines.seekTo(0);
                    Delfines.start();
                }
                else{
                    Delfines.pause();
                }
            }
        });
        gallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Gallo.isPlaying()){
                    Gallo.seekTo(0);
                    Gallo.start();
                }
                else{
                    Gallo.pause();
                }
            }
        });
        lobesno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Lobesno.isPlaying()){
                    Lobesno.seekTo(0);
                    Lobesno.start();
                }
                else{
                    Lobesno.pause();
                }
            }
        });
        mono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Mono.isPlaying()){
                    Mono.seekTo(0);
                    Mono.start();
                }
                else{
                    Mono.pause();
                }
            }
        });
        loquillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Loquillo.isPlaying()){
                    Loquillo.seekTo(0);
                    Loquillo.start();
                }
                else{
                    Loquillo.pause();
                }
            }
        });
        perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Perro.isPlaying()){
                    Perro.seekTo(0);
                    Perro.start();
                }
                else{
                    Perro.pause();
                }
            }
        });
        pajarito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Pajarito.isPlaying()){
                    Pajarito.seekTo(0);
                    Pajarito.start();
                }
                else{
                    Pajarito.pause();
                }
            }
        });
        vacas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!Vacas.isPlaying()){
                    Vacas.seekTo(0);
                    Vacas.start();
                }
                else{
                    Vacas.pause();
                }
            }
        });



    }
}
