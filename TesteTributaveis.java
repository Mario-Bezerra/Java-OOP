
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(6514, 321321);
		cc.deposita(500);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());

	}

}
