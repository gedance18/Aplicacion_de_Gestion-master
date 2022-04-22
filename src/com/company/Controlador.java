package com.company;

import java.util.ArrayList;

public class Controlador {
    ArrayList<TraceursB> lista_de_classes = new ArrayList();

    public void CrearTraceur(int IDTraceur, String nombre, int edad, float altura, int experiencia, GruposParkourA GrupoParkour){
        TraceursB traceur = new TraceursB(IDTraceur, nombre, edad, altura, experiencia, GrupoParkour);
    }

    public void CrearGrupoParkour(int IDGrupoParkour, String nombre, ArrayList<TraceursB> lista_de_traceurs){
        GruposParkourA grupo_de_parkour = new GruposParkourA(IDGrupoParkour, nombre, lista_de_traceurs);
    }

    public void EliminarTraceur(){

    }

    public void EliminarGrupoParkour(){

    }

    public void VisualizarTraceur(){

    }

    public void VisualizarGrupoParkour(){

    }

    public void ModificarTraceur(){

    }

    public void ModificarGrupoParkour(){

    }

    public void listado_Traceurs_y_GruposParkour(){

    }
}
