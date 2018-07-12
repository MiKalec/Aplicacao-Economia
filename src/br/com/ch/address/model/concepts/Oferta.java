package br.com.ch.address.model.concepts;

public class Oferta {
    Demanda demanda = new Demanda();
    public final String definicao = "Oferta eh a quantidade de um produto ou servico disponivel para compra."
    +" A oferta varia nao soh com a demanda, mas tambem com fatores que influenciam o preco dela."
            +"Politicas governamentais, condicoes naturais e o proprio preco do produto podem alterar a curva de demanda de 1 ou mais produtos.";

    public void aumenta(Double porcentagem) {
        //implementar lógica de aumento de oferta
    }

    public void reduz(Double porcentagem) {
        //implementar lógica de reducao de oferta
    }

    public String getPrecoOferta(String caso) {
        switch (caso) {
            case "aumenta":
                //coloca img na tela
                return "Para o caso de aumentar o preço a oferta tende a diminuir. "
                        + "O produto mais caro se torna mais custoso a se tornar disponivel para os consumidores e diminui a quantidade.";

            case "diminui":
                //coloca img na tela
                return "Para o caso de diminuir o preço o custo se torna menor para ser produzido. " +
                        "Sabendo que esta fortemente atrelado a demanda e por saber que a tendencia eh aumentar o consumo,"
                        + " por causa da diminuicao do preco, a oferta tambem aumenta";

    }

    public String getImpostoOferta(String caso){
            switch (caso) {
                case "aumenta":
                    return "Com o aumento do imposto o custo pela producao aumenta. Logo a disponibilidade diminui no mercado.";
                case "diminui":
                    return "Com a diminuiçãoo do imposto o custo de producao diminui e se torna mais facil a producao levanda a uma maior oferta.";
            }

        }

    }

    public String getNaturalCondOferta(String caso) { //condicoes naturais fav para producao
        switch (caso) {
            case "aumenta":
                return "Melhorando as condições naturais que afetam a produção daquele tipo de produto leva a menor dificuldade e investimento para compensar."
                        + "Com menor custo envolvendo a produção temos então uma maior oferta dela.";
            case "diminui":
                return "Com as condições naturais não sendo a favor para a produção de específico produto temos então aumento nos preços já que isso envolve"
                        + "mais investimentos para compensar as dificuldades que o ambiente oferece, dessa modo fazendo com que o preco suba e oferta diminua";
        }
    }
}
