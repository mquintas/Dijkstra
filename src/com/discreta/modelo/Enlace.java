package com.discreta.modelo;

public class Enlace{
    
    private Arista arista;
    private Nodo nodo;

    public Enlace(){
        this(new Arista(),new Nodo());
    }
    public Enlace(Arista arista,Nodo nodo){
        this.arista = arista;
        this.nodo = nodo;
    }
    public void setArista(Arista arista){
        this.arista = arista;
    }
    public Arista getArista(){
        return arista;
    }
    public void setNodo(Nodo nodo){
        this.nodo = nodo;
    }
    public Nodo getNodo(){
        return nodo;
    }
}
