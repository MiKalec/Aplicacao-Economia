package br.com.ch.address.model.concepts;

public class Imposto {
	//private Double valorPorcentagem;
    //outros atributos e mÃƒÂ©todos
    
    private final String definicao = "Impostos são recursos que o governo retira da sociedade, de modo previsível, para poder fornecer bens públicos e tocar seus programas de gastos.";

    public String getDefinicao() {
    	return this.definicao;
    }
    
    public String getImpostoPIB (String caso) {
    	switch(caso) {
    	
    	case "aumenta":
    		//curva de Laffer https://voyager1.net/wp-content/uploads/2017/03/cl-curva-de-laffer-gr%C3%A1fico.jpg
    		return "Aumentar a alÃ­quota dos impostos, atÃ© certo nÃ­vel, aumenta a arrecadaÃ§Ã£o do governo. A partir desse nÃ­vel, novos aumentos da alÃ­quota passam a gerar menor arrecadaÃ§Ã£o. Esse efeito Ã© a chamada curva de Laffer.";
    	case "diminui":
    		//equivalÃªncia ricardiana
    		return "Caso o governo diminua a taxa de impostos e mantenha os gastos, acumularÃ¡ dÃ­vidas e terÃ¡ um dÃ©ficit. Assim, inevitavelmente serÃ¡ necessÃ¡rio no futuro o aumento da alÃ­quota.";
    	}
    	return null;
    }
    
   public String getImpostoPreco (String caso) {
	   Demanda demanda; //nós vamos invocar a chamada de métodos dentro de outros deste jeito?
	   
	   switch(caso) {
	   
	   case "aumenta":
		   //demanda.getPrecoDemanda(aumenta);
		   return "Se o imposto sobre um produto aumentar, seu valor de mercado sobe.;
	   case "diminui":
		   //demanda.getPrecoDemanda(diminui);
		   return "Se o imposto sobre um produto diminuir, seu valor de mercado desce, e sua demanda aumenta.;
	   }
	   return null;
   }
    
    //public Double getValorPorcentagem() {
    //    return valorPorcentagem;
    //}

    //public void setValorPorcentagem(Double valorPorcentagem) {
    //   this.valorPorcentagem = valorPorcentagem;
    //}
}
