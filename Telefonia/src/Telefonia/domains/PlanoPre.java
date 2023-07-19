/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonia.domains;

import Telefonia.domains.Cliente;

/**
 *
 * @author DELL
 */
public class PlanoPre extends Plano {

    public PlanoPre(Cliente Cliente, String tipo) {
        super(Cliente, tipo);
        this.minutos = 0;
    }

    @Override
    public String ligar(double minutos) {
        if (minutos <= this.minutos) {
            this.minutos -= minutos;
            return "ligação efetuada";

        }
        else{
            return "Impossível completar a ligação. Efetue uma recarga";
        }
    }

    public double recarga(double minutos) {
       return this.minutos += minutos;
        
    }
  
}
