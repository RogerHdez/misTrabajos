/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcmasterrace;

/**
 *
 * @author roger
 */
public class PcMasterRace {

    private final String modeloPross;
    private final double frecPros;
    private final String modeloRam;
    private final int ram;

    @Override
    public String toString() {
        return "Mi PC tiene un procesador: " + modeloPross + " con frecuencia de " + frecPros + " GHz, RAM " + modeloRam + " de capacidad " + ram + " GB";
    }

    public PcMasterRace(String procesador, double frecuencia, String modelo, int tamRam) {
        modeloPross = procesador;
        frecPros = frecuencia;
        modeloRam = modelo;
        ram = tamRam;
    }

    public String getModeloPross() {
        return modeloPross;
    }

    public double getFrecPros() {
        return frecPros;
    }

    public String getModeloRam() {
        return modeloRam;
    }

    public int getRam() {
        return ram;
    }
    
   

}
