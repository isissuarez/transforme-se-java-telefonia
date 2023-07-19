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
public class PlanoPos extends Plano {
    
    private double minutosUtilizados;

    public PlanoPos(Cliente Cliente, String tipo) {
        super(Cliente, tipo);
        this.minutosUtilizados = 0;
    }

    @Override
    public String ligar(double minutos) {
        this.minutosUtilizados += minutos;
        return "Ligação efetuada";
    }
@Override
       public String toString() {

        String info = "";
        info += "Tipo: " + this.tipo + "\n";
        info += "Numero: " + this.numero + "\n";
        info += "Nome: " + this.Cliente.getNome() + "\n";
        info += "Sexo: " + this.Cliente.getSexo() + "\n";
        info += "até o momento já foram utilizados" + minutosUtilizados + "minutos" + "\n";
        info += "------------------------------------------------------\n";
        info += "Total de contas ativas" + qtdLinhasAtivas;
        info += "------------------------------------------------------\n";

        return info;

    }
}
