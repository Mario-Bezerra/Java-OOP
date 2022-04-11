package bytebank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total=0;
	
	//construtor
	public Conta(int agencia, int numero){
		Conta.total++;
	    this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 0;
	}
	
	
	// getters and setters dos dados da conta 
	public static int getTotal(){
	    return Conta.total;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	// metodos de deposito, saque e transferencia
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}


