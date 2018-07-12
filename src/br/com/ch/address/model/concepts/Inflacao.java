package br.com.ch.address.model.concepts;

import java.util.*;

/*
 INFLA��O DE CUSTOS. Processo inflacion�rio
gerado (ou acelerado) pela eleva��o dos custos
de produ��o, especialmente das taxas de juros,
de c�mbio, de sal�rios ou dos pre�os das
importa��es.
 */

/*INFLA��O DE DEMANDA. Tamb�m chamada
de infla��o dos compradores, � o processo
inflacion�rio gerado pela expans�o dos rendimentos.
Ocorre que os meios de pagamento crescem
al�m da capacidade de expans�o da economia,
ou antes que a produ��o esteja em plena
capacidade, o que impede que a maior demanda
decorrente da expans�o dos rendimentos seja
atendida. Com isso, aumentam os pre�os e, por
extens�o, os sal�rios e os rendimentos em geral,
dando origem a uma espiral inflacion�ria.
*/

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
                        +"Se as taxas de juros sobem, o custo também sobe."
                        +"Se o governo eleva a carga tributária, o preço final dos produtos também aumenta."
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
