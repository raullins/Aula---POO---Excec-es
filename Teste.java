
public class Teste {

	public static void main(String[] args) {

		Loja loja = new Loja();

		loja.Comprar(0);
		System.out.println(loja.getSaldo());
		loja.Comprar(50);
		System.out.println(loja.getSaldo());
		loja.Comprar(151);
		System.out.println(loja.getSaldo());

		loja.Vender(0);
		System.out.println(loja.getSaldo());
		loja.Vender(100);
		System.out.println(loja.getSaldo());
		loja.Vender(201);
		System.out.println(loja.getSaldo());
		loja.Vender(-1);
		System.out.println(loja.getSaldo());

	}

}
