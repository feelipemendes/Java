/** 
* Problema Programa��o Curta - Quantum
* @autor Danielle Caled 
*
*/

import br.com.quantumfinance.selecaoEstagio.dto.Acao;
import br.com.quantumfinance.selecaoEstagio.leitor.LeitorDeArquivo;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

/** 
 * Esta classe implementa as solu��es das quest�es de 1 a 5, cada uma delas em um m�todo distinto.
 * Os resultados das quest�es s�o retornados em linha de comando.
 */

public class Questoes 
{

	/** M�todo para a a execu��o das quest�es de 1 a 5.
	 * @return void 
	 */

	public static void main(String[] args) 
	{
		LeitorDeArquivo leitor = new LeitorDeArquivo();
		List<String> cotacoes = leitor.lerArquivo();
		calculaMenorFechamentoPorAcao(cotacoes);
		calculaMaiorRetornoPorAcao(cotacoes);
		calculaVolumeMedioPorAcao(cotacoes);
	}

	private static void calculaMenorFechamentoPorAcao(List<String> acoes){
		// implemente aqui o calculo de menor fechamento
		throw new UnsupportedOperationException("calculaMenorFechamentoPorAcao n�o implementado");
	}

	private static void calculaMaiorRetornoPorAcao(List<String> acoes){
		// implemente aqui o calculo de maior retorno
		throw new UnsupportedOperationException("calculaMaiorRetornoPorAcao n�o implementado");
	}

	private static void calculaVolumeMedioPorAcao(List<String> acoes){
		// implemente aqui o calculo de volume medio
		throw new UnsupportedOperationException("calculaVolumeMedioPorAcao n�o implementado");
	}
}
