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
	double indiceAcumulado;
	
	ArrayList<Double> historico_de_precos = new ArrayList<Double>();
	ArrayList<Double> historico_ipca = new ArrayList<Double>();
	
	public void setIndices () {
		if(historico_de_precos.size() < 2) return;
		else {
			indice = (historico_de_precos.get(historico_de_precos.size() - 1) / historico_de_precos.get(historico_de_precos.size() - 2))-1;
			
			indiceAcumulado = indiceAcumulado + indice;
			
			historico_ipca.add(indice);
		}
	}
	
	public double getIndice() {
		return this.indice;
	}
	
	public double getIndiceAcumulado() {
		return this.indiceAcumulado;
	}
	
	public boolean aumentou() {
		return (historico_ipca.get(historico_ipca.size()-1) > historico_ipca.get(historico_ipca.size()-2));
	}
	
	
	
	
	
	

}
