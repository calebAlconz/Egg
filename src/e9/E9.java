/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9;

import Entidades.Matematica;
import Servicios.Servicios;

/**
 *
 * @author Notebook
 */
public class E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios mt= new Servicios();
        Matematica mate=mt.altaServicios();
        mt.devolverMayor(mate);
        mt.calcularPotencia(mate);
        mt.calculaRaiz(mate);
    }
    
}
