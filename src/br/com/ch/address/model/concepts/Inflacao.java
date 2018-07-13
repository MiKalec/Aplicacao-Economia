package br.com.ch.address.model.concepts;

import java.util.*;

public class Inflacao implements Concepts{

	public final String definicao = "A taxa de inflação é o aumento no nível de preços. "
            + "Ou seja, é a média do crescimento dos preços de um conjunto de bens e serviços em um determinado período.";


	public String gastoPublico(String caso){
		switch(caso){
			case "aumenta":
				return  "Se o governo gasta mais que arrecada isso faz com que uma maior inflação seja necessária para balancear gastos com o que ganha.";
            case "diminui":
                return "Diminuindo os gastos públicos podem fazer com que as arrecadações superem os gastos tornando maior a receita e tendendo a diminuir a inflação.";
        }
        return null;
    }

	public String custoDeProd(String caso){
		switch(caso){
            case "aumenta":
                return "Empresas buscam empréstimos para viabilizar seus projetos. "
                        +  "Se as taxas de juros sobem, o custo também sobe."
                        + "Se o governo eleva a carga tributária, o preço final dos produtos também aumenta."
                        + "Quando o custo da empresa sobe, ela aumenta os preços.";
            case "diminui":
                return "Com a diminuição do custo de produção se torna mais"
                        +" fácil manter o nível de produção logo o preço dos produtos caem e inflação diminui.";
        }
		return null;
	}

	public String producao(String caso){
		switch(caso){
            case"aumenta":
                return "Caso aumente a produção e ela excede a oferta os preços caem logo a inflação diminui um pouco";
            case "diminui":
                return "Se a produção é baixa o volume de dinheiro é maior que a oferta."
                        +" O consumidor se dispõe a pagar mais pelo mesmo produto e seu valor sobe junto com a inflação";
		}
		return null;
	}


}
