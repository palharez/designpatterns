// Exercício para fixação do padrão Chain of Responsability!

class ContaDois {
	private String titular;
	private double saldo;

	public ContaDois(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void adicionaSaldo(double valor) {
		this.saldo += valor;
	}
}

enum Formato {
	XML, CSV, PORCENTO
}

class Requisicao {
	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}

interface Resposta {

	void responde(Requisicao req, ContaDois conta);

}

class RespostaEmXml implements Resposta {
	private Resposta outraResposta;

	public RespostaEmXml(Resposta resposta) {
		this.outraResposta = resposta;
	}

	public void responde(Requisicao req, ContaDois conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			this.outraResposta.responde(req, conta);
		}
	}
}

class RespostaEmCsv implements Resposta {
	private Resposta outraResposta;

	public RespostaEmCsv(Resposta resposta) {
		this.outraResposta = resposta;
	}

	public void responde(Requisicao req, ContaDois conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}
}

class RespostaEmPorcento implements Resposta {

	public void responde(Requisicao req, ContaDois conta) {
		System.out.println(conta.getTitular() + "%" + conta.getSaldo());
	}
}