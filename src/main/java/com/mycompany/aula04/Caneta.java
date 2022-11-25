
package com.mycompany.aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p; 
    }
    public void Status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
    }

    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }
}
