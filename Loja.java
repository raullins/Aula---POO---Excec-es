
public class Loja {

	private ContaCorrente conta;

	public Loja() {
		this.conta = new ContaCorrente(100, 100);
	}

	public void Vender(double valor) {
		this.conta.deposita(valor);
	}

	public void Comprar(double valor) {
		try {
			this.conta.saca(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public double getSaldo() {
		return conta.getSaldo();
	}

}
