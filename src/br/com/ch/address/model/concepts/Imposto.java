package br.com.ch.address.model.concepts;

import javafx.scene.image.Image;

import br.com.ch.address.model.pics.*;

public class Imposto {
	//private Double valorPorcentagem;
    //outros atributos e mÃ©todos
	
	Image image = new Image("curva_de_laffer.jpg");
    
    private final String definicao = "Impostos s䯠recursos que o governo retira da sociedade, de modo previsl, para poder fornecer bens p򢬩cos e tocar seus programas de gastos.";

    public String getDefinicao() {
    	return this.definicao;
    }
    
    public String getImpostoPIB (String caso) {
    	switch(caso) {
    	
    	case "aumenta":
    		
    		return "Aumentar a alíquota dos impostos, até certo nível, aumenta a arrecadação do governo. A partir desse nível, novos aumentos da alíquota passam a gerar menor arrecadação. Esse efeito é a chamada curva de Laffer.";
    	case "diminui":
    		
    		return "Caso o governo diminua a taxa de impostos e mantenha os gastos, acumulará dívidas e terá um déficit. Assim, inevitavelmente será necessário no futuro o aumento da alíquota.";
    	}
    	return null;
    }
    
   public String getImpostoPreco (String caso) {
	   Demanda demanda; //n󳠶amos invocar a chamada de m굯dos dentro de outros deste jeito?
	   
	   switch(caso) {
	   
	   case "aumenta":
		   //demanda.getPrecoDemanda(aumenta);
		   return "Se o imposto sobre um produto aumentar, seu valor de mercado sobe.";
	   case "diminui":
		   //demanda.getPrecoDemanda(diminui);
		   return "Se o imposto sobre um produto diminuir, seu valor de mercado desce, e sua demanda aumenta.";
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
