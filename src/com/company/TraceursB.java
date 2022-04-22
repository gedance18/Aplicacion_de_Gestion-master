package com.company;

public class TraceursB {
  private int IDTraceur;
  private String nombre;
  private int edad;
  private float altura;
  private int experiencia;
  private GruposParkourA GrupoParkour;


  public TraceursB(int IDTraceur,String nombre,int edad,float altura,int experiencia,GruposParkourA GrupoParkour){
    this.IDTraceur = IDTraceur;
    this.nombre = nombre;
    this.edad = edad;
    this.altura = altura;
    this.experiencia = experiencia;
    this.GrupoParkour = GrupoParkour;
  }

  public String toString(){

    return "";
  }
}
