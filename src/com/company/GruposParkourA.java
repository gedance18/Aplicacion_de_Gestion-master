package com.company;

import java.util.ArrayList;

public class GruposParkourA {
    private int IDGrupoParkour;
    private String nombre;
    private ArrayList<TraceursB> lista_de_traceurs = new ArrayList();


    public GruposParkourA(int IDGrupoParkour, String nombre, ArrayList<TraceursB> lista_de_traceurs){
        this.IDGrupoParkour = IDGrupoParkour;
        this.lista_de_traceurs = lista_de_traceurs;
        this.nombre = nombre;
    }

    public GruposParkourA(ArrayList<TraceursB> lista_de_traceurs){
        this.lista_de_traceurs = lista_de_traceurs;
    }

    public String toString(){

        return "";
    }



}
