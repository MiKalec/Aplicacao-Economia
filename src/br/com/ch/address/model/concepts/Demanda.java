package br.com.ch.address.model.concepts;

public class Demanda {

    public final String definicao = "Demanda é um conceito subjetivo sobre a quantidade requerida de" +
            " uma produção qualquer. A Demanda é definida pelo consumidor e diversos fatores podem " +
            "influenciá-la, como variação dos preços dos produtos, variação na renda da sociedade, " +
            "desejo do consumidor, faixa etária e outros muitos fatores.";

    public String getPrecoDemanda(String caso) {
        switch (caso) {
            case "aumenta":
                //coloca img na tela
                return "Para o caso de aumentar o preço, como um efeito natural, sem outros fatores " +
                        "influenciando, a demanda cai, pois a sociedade pode não considerar um preço" +
                        " justo para aquela produção.";
            case "diminui":
                //coloca img na tela
                return "Para o caso de diminuir o preço, como um efeito natural, sem outros fatores " +
                        "influenciando, a demanda sobe, pois a sociedade que já demandava este produto," +
                        " agora consegue consumir mais do mesmo, devido a queda de preços";
        }
        return null;
    }

    public void getRendaDemanda() {

    }





    /*private Oferta oferta = new Oferta();
    //ver outros atributos e implementar métodos

    public void aumenta(Double porcentagem){
        //implementar lógica de aumento de demanda
    }

    public void reduz(Double porcentagem){
        //implementar lógica de reducao de demanda
    }*/
}
