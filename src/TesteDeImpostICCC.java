
public class TesteDeImpostICCC {

	public static void main(String[] args) {
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(3000.0);

		CalculadorDeImposto calculador = new CalculadorDeImposto();

		calculador.realizaCalculo(orcamento, iccc);

	}

}
