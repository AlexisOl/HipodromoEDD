/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 * Clase del objeto Apuesta
 * @author alexis
 */
public class Apuesta extends Apostador{
    private Double monto;
    
    private int[] apuestaCaballosOrden ; 
    private int puntosTotales;
    private boolean valida;

    //constructor Vacio
    public Apuesta(){}
        public Apuesta(Double monto, int[] apuestaCaballosOrden, String nombre) {
        super(nombre);
        this.monto = monto;
        this.apuestaCaballosOrden = apuestaCaballosOrden;
        this.valida = valida;
    }
    //constructor de la clase
    public Apuesta(Double monto, int[] apuestaCaballosOrden,int puntosTotales, String nombre) {
        super(nombre);
        this.monto = monto;
        this.apuestaCaballosOrden = apuestaCaballosOrden;
        this.valida = valida;
    }

    /*
    Getters y Setters
    */
    
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int[] getApuestaCaballosOrden() {
        return apuestaCaballosOrden;
    }

    public void setApuestaCaballosOrden(int[] apuestaCaballosOrden) {
        this.apuestaCaballosOrden = apuestaCaballosOrden;
    }
    
    
    public boolean getValida(){
        return this.valida;
    }
    
    public void setValida(boolean valida){
        this.valida = valida;
    }
    
    
    public int getPunteo(){
    return this.puntosTotales;
    }
    
    public void incrementoPunteo(int punteoParcial){
        this.puntosTotales+=punteoParcial;
    
    }

    @Override
    public String toString() {
        return "Apuesta{" + "monto=" + monto + ", apuestaCaballosOrden=" + apuestaCaballosOrden + ", puntosTotales=" + puntosTotales + ", valida=" + valida + '}';
    }
    public  void mostraCaballo() {
        for (int i =0; i < this.apuestaCaballosOrden.length; i++) {
            System.out.println(apuestaCaballosOrden[i]);
        }
    }
    
}
