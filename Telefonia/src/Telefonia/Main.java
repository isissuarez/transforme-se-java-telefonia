/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Telefonia;

import Telefonia.domains.Cliente;
import Telefonia.domains.PlanoControle;
import Telefonia.domains.PlanoPos;
import Telefonia.domains.PlanoPre;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Isis Suarez", 'F',"isissuarez@email.com","casado!");
        PlanoPos pos1 = new PlanoPos(c1, "pos");
        Cliente c2 = new Cliente("Ana Paula Silva", 'F',"anasilva@email.com","solteiro");
        PlanoPre pre1 = new PlanoPre(c2,"pre");
        Cliente c3 = new Cliente("joão Carlos Santos",'M',"joaosantos@email.com","divorciado");
        PlanoControle con1 = new PlanoControle(c3,"controle", 30);
        
       
        
       
        
       
       
      
      
       pre1.recarga(20);
       
       System.out.println(pos1.ligarACobrar(20, con1));
       System.out.println(pre1.ligar(10));
       System.out.println(pos1.ligar(50));
       System.out.println(pos1.toString());
       System.out.println(con1.ligar(10));
       System.out.println(con1.ligar(10));
       System.out.println(con1.recarga(60));
       System.out.println(pre1.toString());
       System.out.println(pre1.ligarACobrar(20,pos1));
       System.out.println(pos1.toString());
       System.out.println(pre1.ligar(10));
       System.out.println(con1.ligar(10));
       System.out.println(pos1.ligarACobrar(10,pre1));
    }
 }
