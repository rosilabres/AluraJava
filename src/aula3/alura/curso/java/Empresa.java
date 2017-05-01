package aula3.alura.curso.java;


class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;

	
	void adicionar(Funcionario f) {
		this.funcionarios[this.livre] = f;
	    this.livre++;
	}
	
	void imprimeFuncionarios(){
		for (int i = 0; i < this.funcionarios.length; i++){
			Funcionario funcionario = this.funcionarios[i];
			if (funcionario == null) continue;
			System.out.println("Nome: " + funcionario.nome);
			System.out.println("Salário: " + funcionario.salario);
		}
	}
	
		void mostraTodasAsInformacoes(){
			for (int i = 0; i < this.funcionarios.length; i++){
				Funcionario funcionario = this.funcionarios[i];
				if (funcionario == null) continue;
				funcionario.mostra();				
			}
		}
		
		 boolean contem(Funcionario f) {
			 for (int i = 0; i < this.funcionarios.length; i++){
				if (this.funcionarios[i] == f) return true;
				}
			return false;  
		 }

}