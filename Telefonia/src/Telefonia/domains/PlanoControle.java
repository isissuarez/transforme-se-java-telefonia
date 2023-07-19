/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonia.domains;

/**
 *
 * @author DELL
 */
public class PlanoControle extends PlanoPre {
    
    
    
    public PlanoControle(Telefonia.domains.Cliente Cliente, String tipo, double minutos) {
        super(Cliente, tipo);
        this.minutos = minutos;
    }
    
}
