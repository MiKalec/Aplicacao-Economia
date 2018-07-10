package br.com.ch.address.model.concepts;

import java.util.*;

/*
 INFLAÇÃO DE CUSTOS. Processo inflacionário
gerado (ou acelerado) pela elevação dos custos
de produção, especialmente das taxas de juros,
de câmbio, de salários ou dos preços das
importações.
 */

/*INFLAÇÃO DE DEMANDA. Também chamada
de inflação dos compradores, é o processo
inflacionário gerado pela expansão dos rendimentos.
Ocorre que os meios de pagamento crescem
além da capacidade de expansão da economia,
ou antes que a produção esteja em plena
capacidade, o que impede que a maior demanda
decorrente da expansão dos rendimentos seja
atendida. Com isso, aumentam os preços e, por
extensão, os salários e os rendimentos em geral,
dando origem a uma espiral inflacionária.
*/

public class Inflacao {
		
	double indice;
	
	ArrayList<Double> historico_de_precos = new ArrayList<Double>();
	
	public void setIndice () {
		if(historico_de_precos.size() < 2) return;
		else {
			indice = historico_de_precos.get(historico_de_precos.size() - 1) / historico_de_precos.get(historico_de_precos.size() - 2);
		}
	}
	
	public double getIndice() {
		return this.indice;
	}
	
	
	
	
	
	

}
