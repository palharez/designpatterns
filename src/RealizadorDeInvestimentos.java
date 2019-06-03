// Exercício para fixação do padrão!

class Conta {
	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}

interface Investimento {
	public double executa(double valorDeInvestimento);
}

class Conservador implements Investimento {

	@Override
	public double executa(double valorDeInvestimento) {
		return valorDeInvestimento * 0.008;
	}

}

class Moderado implements Investimento {

	@Override
	public double executa(double valorDeInvestimento) {
		if (new java.util.Random().nextDouble() > 0.50) {
			return valorDeInvestimento * 0.025;
		} else {
			return valorDeInvestimento * 0.07;
		}
	}

}

class Arrojado implements Investimento {

	@Override
	public double executa(double valorDeInvestimento) {
		if (new java.util.Random().nextDouble() <= 0.20) {
			return valorDeInvestimento * 0.05;
		} else if (new java.util.Random().nextDouble() <= 0.50) {
			return valorDeInvestimento * 0.03;
		} else {
			return valorDeInvestimento * 0.006;
		}
	}

}

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento investimento) {
		double resultado = investimento.executa(conta.getSaldo());

        conta.deposita( resultado * 0.75 );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
	}

}
