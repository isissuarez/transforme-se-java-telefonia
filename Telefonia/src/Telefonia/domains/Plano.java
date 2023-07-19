package Telefonia.domains;

import Telefonia.domains.Cliente;

public abstract class Plano {

    protected String numero;
    protected Cliente Cliente;
    protected String tipo;
    protected double minutos = 0;

    public static int geraNumero = 0;
    public static int qtdLinhasAtivas = 0;

    public Plano(Cliente Cliente, String tipo) {

        this.Cliente = Cliente;
        this.tipo = tipo;

        Plano.geraNumero += 1;
        this.numero = String.valueOf(geraNumero);
        Plano.qtdLinhasAtivas += 1;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMinutos() {
        return minutos;
    }

   abstract String ligar (double minutos);

    public String ligarACobrar(double minutos, Plano destino) {
  if (destino.tipo == "pre" && minutos <= destino.minutos || destino.tipo == "controle" && minutos <= destino.minutos || destino.tipo == "pos"){ 
         destino.ligar(minutos);
         return "ligação efetuada!";
  }
      {
         return "impossivel completar a ligação";
     }
    
    }
     @Override
       public String toString() {

        String info = "";
        info += "Tipo: " + this.tipo + "\n";
        info += "Numero: " + this.numero + "\n";
        info += "Nome: " + this.Cliente.getNome() + "\n";
        info += "Sexo: " + this.Cliente.getSexo() + "\n";
        info += "Saldo disponivel " + minutos + " minutos ";
        info += "------------------------------------------------------\n";
        info += "Total de contas ativas" + qtdLinhasAtivas;
        info += "------------------------------------------------------\n";

        return info;

    }
}
