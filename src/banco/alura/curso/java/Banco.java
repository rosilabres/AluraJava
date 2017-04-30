package banco.alura.curso.java;

class Conta {
	int numero;
	Pessoa titular;
	double saldo;
	int agencia;
	
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca(double valorASerSacado){
		if (this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
		}
	
	void transfere (double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

class Pessoa{
	String nome;
	int cpf;
	String endereco;
}

class Banco {

	public static void main (String[] args){
		Conta rosi = new Conta();
		rosi.numero = 123;
		rosi.saldo = 1000;
		rosi.titular = "Rosilene Labres";
		rosi.agencia = 938;
		
		rosi.deposita(2000);
		
		System.out.println(rosi.saldo);
	}
	
}
