package br.com.ch.address.model.concepts;

public class Oferta {
    Demanda demanda = new Demanda();
    public final String definicao = "Oferta eh a quantidade de um produto ou servico disponivel para compra. A oferta varia nao soh com a demanda, mas tambem com fatores que influenciam o preco dela. Politicas governamentais, condicoes naturais e o proprio preco do produto podem alterar a curva de demanda de 1 ou mais produtos.  "
    public void aumenta(Double porcentagem) {
        //implementar lógica de aumento de oferta
    }

    public void reduz(Double porcentagem) {
        //implementar lógica de reducao de oferta
    }
    public void getPrecoOferta(){

    }
    public void getImpostoOferta(){

    }
    public void getNaturalCondOferta(){ //condicoes naturais fav para producao

    }
}
