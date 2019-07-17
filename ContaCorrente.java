
public class ContaCorrente {

	private double saldo;
	private double chequeEspecial;

	public ContaCorrente(double x, double y) {
		this.saldo = x;
		this.chequeEspecial = y;
	}

	public boolean deposita(double x) {
		if (x > 0) {
			this.saldo = this.saldo += x;
			System.out.println("Depósito concluído");
			return true;
		}
		System.out.println("Valor inválido");
		return false;
	}

	public void saca(double y) throws Exception {
		if (!(y > 0)) {
			throw new Exception("Valor inválido");
		} else if (y > this.saldo + this.chequeEspecial) {
			throw new Exception("Saldo indisponível");
		}

		this.saldo = this.saldo -= y;
		System.out.println("Saque realizado com sucesso");

	}

	public void setLimite(double z) {
		this.chequeEspecial = z;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
