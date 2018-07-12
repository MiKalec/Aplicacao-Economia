package br.com.ch.address.model.concepts;

import java.util.*;

public class Inflacao {

	public final String definicao = "A taxa de inflação é o aumento no nível de preços. "
			+ "Ou seja, é a média do crescimento dos preços de um conjunto de bens e serviços em um determinado período.";


	public String gastoPublico(String caso){
		switch(caso){
			case "aumenta":
				return  "Se o governo gasta mais que arrecada isso faz com que uma maior inflação seja necessária para balancear gastos com o que ganha.";
            case "diminui":
                return "Diminuindo os gastos públicos podem fazer com que as arrecadações superem os gastos tornando maior a receita e tendendo a diminuir a inflação."
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
                return ""
        }
		return null;
	}

	public String cartel(String caso){
		switch(caso){

        }
		return null;
	}

	public String producaoBaixa(String caso){
		switch(caso){

		}
		return null;
	}

	public String Indexacao(String caso){
		switch(caso){

		}
		return null;
	}

	public String inercia(String caso){
		switch(caso){

		}
		return null;
	}



}
