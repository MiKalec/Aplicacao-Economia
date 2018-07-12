package br.com.ch.address.model.atores;

import br.com.ch.address.model.concepts.Imposto;
import br.com.ch.address.model.concepts.Inflacao;

public class Consumidores {
  
    private double rendaReal;

    private double rendaNominal; //A Rentabilidade Nominal eh o rendimento bruto

    private Inflacao inflacao;
    //outros atributos e métodos

    double CalculaRendaR(double rendaNominal, double inflacao){ // calcula renda nominal
        rendaReal = (( (rendaNominal + 1) / (inflacao + 1) ) - 1);

        return rendaReal;
    }
    double getRendaNominal(){

        return rendaNominal;
    }


}
