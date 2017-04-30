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
	String cpf;
	String endereco;
}

class Banco {

	public static void main (String[] args){
		Conta c = new Conta();
		
		Pessoa rosi = new Pessoa();
		
		c.titular.nome = "Rosilene Labres";
		c.titular.cpf = "96739054019";
		c.titular.endereco = "Rua das Flores";
	}
	
}
