package br.com.ch.address.model.concepts;
@SuppressWarnings("all")
public class Demanda {

    private final String definicao = "Demanda é um conceito subjetivo sobre a quantidade requerida de" +
            " uma produção qualquer. A Demanda é definida pelo consumidor e diversos fatores podem " +
            "influenciá-la, como variação dos preços dos produtos, variação na renda da sociedade, " +
            "desejo do consumidor, faixa etária e outros muitos fatores.";

    public String getDefinicao() {
        return definicao;
    }

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

    public String getRendaDemanda(String caso) {
        switch (caso) {
            case "aumenta":
                //coloca img na tela
                return "Aumentando-se a renda, há um consequente aumento na demanda, pois com mais recursos" +
                        " financeiros, o poder de compra da sociedade aumenta, tendo efeito parecido com a " +
                        "diminuição de preços";
            case "diminui":
                //coloca img na tela
                return "Diminuindo-se a renda, há uma redução na demanda, pois há a perda de poder aquisitivo" +
                        " da sociedade, ocasionando menos compras, tendo efeito parecido com o aumento dos preços";
        }
        return null;
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
