
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (valor <= 3000) {
			return orcamento.getValor() * 0.07;
		} else {
			return orcamento.getValor() * 0.08;
		}
	}

}
