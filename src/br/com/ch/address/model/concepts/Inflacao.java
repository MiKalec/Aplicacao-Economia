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
