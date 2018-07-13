package br.com.ch.address.model.concepts;

public class Imposto implements Concepts {
	//private Double valorPorcentagem;
    //outros atributos e mÃ©todos
    
    private final String definicao = "Taxas obrigatórias pagas ao Estado, que devem reverter à coletividade" +
            " sob forma de benefícios de interesse geral: transporte, educação, saúde etc. Historicamente, " +
            "esse pagamento despontou sob a forma de tributo, exprimindo uma relação de força que um povo " +
            "vencido devia a seus dominadores. Na Idade Média, prevaleceu a idéia de que o imposto não podia" +
            " ser estabelecido sem o consentimento dos contribuintes; ou que o imposto era estabelecido a " +
            "rogo do rei. Seria assim uma ajuda que se oferecia ao soberano, como um complemento de seus " +
            "recursos normais. Mais tarde essas formas de tributos ganharam o sentido de obrigatoriedade, " +
            "de coisa imposta; uma imposição que não pode ser exercida sem o consentimento dos contribuintes," +
            " consentimento este que, nos regimes representativos, é atribuído ao poder legislativo." +
            " A obrigatoriedade dos impostos pode ser entendida em termos de uma relação contratual entre " +
            "os cidadãos e o Estado, que lhes protege os bens e a própria vida. De acordo com outra teoria, " +
            "o imposto corresponderia ao preço que o indivíduo paga pelos serviços prestados pelo Estado à" +
            " coletividade; outros o vêem como uma espécie de dívida social, com a qual os cidadãos teriam de" +
            " arcar pelo simples fato de fazer parte da comunidade política.";

    public String getDefinicao() {
    	return this.definicao;
    }
    
    public String getAliquotaImposto (String caso) {
    	switch(caso) {
    	
    	case "aumenta":
    		//curva de Laffer
    		return "Aumentar a alíquota dos impostos, até certo nível, aumenta a arrecadação do governo. A partir desse" +
					" nível, novos aumentos da alíquota passam a gerar menor arrecadação. Esse efeito é a chamada curva de Laffer.";
    	case "diminui":
    		//equivalência ricardiana
    		return "Caso o governo diminua a taxa de impostos e mantenha os gastos, acumulará dívidas e terá um déficit." +
					" Assim, inevitavelmente será necessário no futuro o aumento da alíquota.";
    	}
    	return null;
    }

}
