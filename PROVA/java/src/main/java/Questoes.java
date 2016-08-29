/** 
* Problema Programação Curta - Quantum
* @autor Danielle Caled 
*
*/

import br.com.quantumfinance.selecaoEstagio.dto.Acao;
import br.com.quantumfinance.selecaoEstagio.leitor.LeitorDeArquivo;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

/** 
 * Esta classe implementa as soluções das questões de 1 a 5, cada uma delas em um método distinto.
 * Os resultados das questões são retornados em linha de comando.
 */

public class Questoes 
{

	/** Método para a a execução das questões de 1 a 5.
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
		throw new UnsupportedOperationException("calculaMenorFechamentoPorAcao não implementado");
	}

	private static void calculaMaiorRetornoPorAcao(List<String> acoes){
		// implemente aqui o calculo de maior retorno
		throw new UnsupportedOperationException("calculaMaiorRetornoPorAcao não implementado");
	}

	private static void calculaVolumeMedioPorAcao(List<String> acoes){
		// implemente aqui o calculo de volume medio
		throw new UnsupportedOperationException("calculaVolumeMedioPorAcao não implementado");
	}
}
