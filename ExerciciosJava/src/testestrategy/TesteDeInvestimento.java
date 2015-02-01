package testestrategy;

import strategy.Investimento;
import strategy.InvestimentoConservador;
import strategy.InvestimentoModerado;
import strategy.TipoInvestimento;

public class TesteDeInvestimento {
	
	public static void main(String[] args) {
		
        testeConservador();		
        testeModerado();

		
	}
	
	public static void testeConservador() {
		
		Investimento investimento = new Investimento(100);
		
		TipoInvestimento tipo = new InvestimentoConservador();
		
		double RetornoSobreInvestimento = tipo.calcula(investimento);
		
		System.out.println("Teste Conservador Resultado");
		System.out.println(RetornoSobreInvestimento);
		
		
	}
	
	public static void testeModerado() {
		
		Investimento investimento = new Investimento(100);
		
		TipoInvestimento tipo = new InvestimentoModerado();
		
		double RetornoSobreInvestimento = tipo.calcula(investimento);
		
		System.out.println("Teste Moderado");
		System.out.println(RetornoSobreInvestimento);
		
		
	}

	
	

}