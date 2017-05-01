package aula3.alura.curso.java;

class Funcionario {
	 	String nome;
	    String departamento;
	    double salario;
	    Data dataDeEntrada;
	    String rg;

	    void recebeAumento(double valorDoAumento){
	        this.salario += valorDoAumento;
	    }

	    double calculaGanhoAnual(){
	        return this.salario * 12;
	    }
	    	    
	    void mostra(){
	    	System.out.println("Nome: " + this.nome);
	    	System.out.println("Departamento: " + this.departamento);
	    	System.out.println("Salário: " + this.salario);
	    	System.out.println("Data de Entrada: " + this.dataDeEntrada.getFormatada());
	    	System.out.println("RG: " + this.rg);
	    }
	
	   
}
