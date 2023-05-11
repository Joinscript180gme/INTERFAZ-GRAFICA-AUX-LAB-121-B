/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author CRISTIAN
 */
public class Futbolista extends Persona implements Serializable{
    private String posicion;
    private int titulos_ganados;
    private int nro_casaca;

    public Futbolista() {
    }

    
    public Futbolista(String posicion, int titulos_ganados, int nro_casaca, int ci, String nombre, String apellido, String fecha_nac) {
        super(ci, nombre, apellido, fecha_nac);
        this.posicion = posicion;
        this.titulos_ganados = titulos_ganados;
        this.nro_casaca = nro_casaca;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getTitulos_ganados() {
        return titulos_ganados;
    }

    public void setTitulos_ganados(int titulos_ganados) {
        this.titulos_ganados = titulos_ganados;
    }

    public int getNro_casaca() {
        return nro_casaca;
    }

    public void setNro_casaca(int nro_casaca) {
        this.nro_casaca = nro_casaca;
    }
    
}
