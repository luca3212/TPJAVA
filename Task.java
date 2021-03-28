/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtask;

/**
 *
 * @author luca
 */
public class Task {
    
    //ATRIBUTOS
    private String descripcion;
    private String estado;
    private int dia;
    private int mes;
    private int anio;
    
    //CONSTRUCTOR
    public Task(String descripcion, String estado, int dia, int mes, int anio) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
   
    public Task(){
        this.descripcion = "VACIO";
        this.estado =   "VACIO";
        this.dia =  0;
        this.mes =  0;
        this.anio = 0;
    }
    
    //GETS Y SETS
    //DEVUELVE EL VALOR DE LA VARIABLE "DESCRIPCION"
    public String getDescripcion() {
        return descripcion;
    }
    //RECIBE UN VALOR Y LO GUARDA EN "DESCRIPCION"
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //DEVUELVE EL VALOR DE LA VARIABLE "ESTADO"
    public String getEstado() {
        return estado;
    }
    //RECIBE UN VALOR Y LO GUARDA EN "ESTADO"
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //DEVUELVE EL VALOR DE LA VARIABLE "DIA"
    public int getDia() {
        return dia;
    }
    //RECIBE UN VALOR Y LO GUARDA EN "DIA"
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    //DEVUELVE EL VALOR DE LA VARIABLE "MES"
    public int getMes() {
        return mes;
    }
    //RECIBE UN VALOR Y LO GUARDA EN "MES"
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    //DEVUELVE EL VALOR DE LA VARIABLE "ANIO"
    public int getAnio() {
        return anio;
    }
    //RECIBE UN VALOR Y LO GUARDA EN "ANIO"
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //PROCEDIMIENTOS
    //CAMBIA EL ESTADO ACTUAL AL INVERSO
    public void CambiarEstado(){
        if(this.estado=="COMPLETO"){
            this.estado="INCOMPLETO";
        }else{
            this.estado="COMPLETO";
        }
    }
    
    //REINICIA TODAS LAS VARIABLES
    public void Eliminar(){
        this.descripcion = "VACIO";
        this.estado =   "VACIO";
        this.dia =  0;
        this.mes =  0;
        this.anio = 0;
    }
    
}
