package bytebank;

public class criaConta {

	public static void main(String[] args) {
		Conta contaMario = new Conta(1234, 5251);
		contaMario.setTitular(new Cliente());
		
		contaMario.deposita(500);
		contaMario.saca(200);
		
		contaMario.getTitular().setNome("Mario Bezerra");
		contaMario.getTitular().setCpf("651.646.546-64");
		contaMario.getTitular().setProfissao("MicroEmpresario");
		
		System.out.println(contaMario.getSaldo());
		System.out.println(contaMario.getTitular().getNome());
		System.out.println(contaMario.getTitular().getCpf());
		System.out.println(contaMario.getTitular().getProfissao());
		
	}
}
