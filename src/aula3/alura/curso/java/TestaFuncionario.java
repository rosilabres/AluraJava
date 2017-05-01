package aula3.alura.curso.java;


class TestaFuncionario {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
	    empresa.funcionarios = new Funcionario[10];
		
	    Funcionario f1 = new Funcionario();
	    f1.nome = "Maria";
	    f1.departamento = "Gerência";
	    f1.dataDeEntrada = new Data();
	    f1.dataDeEntrada.alteraData(10, 05, 2010);
	    f1.salario = 8000;
	    f1.rg = "078839454";
	    
	    Funcionario f2 = new Funcionario();
	    f2.nome = "Eduardo";
	    f2.departamento = "Gerência";
	    f2.dataDeEntrada = new Data();
	    f2.dataDeEntrada.alteraData(12, 07, 2014);
	    f2.salario = 5000;
	    f2.rg = "4377839454";
	    
	    empresa.adicionar(f1);
	    empresa.adicionar(f2);
	    
	    //empresa.mostraTodasAsInformacoes();

	  	    
	    if (empresa.contem(f2) == true)
	    	System.out.println("Verdadeiro");
	     
	    else
    		System.out.println("Falso");
	}

}
