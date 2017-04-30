class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataDeEntrada;
    String rg;

    void recebeAumento(double valorDoAumento){
        this.salario += valorDoAumento;
    }

    double calculaGanhoAnual(){
        return this.salario * 12;
    }

}

class Programa2 {

	public static void main(String[] args) {
		Funcionario maria = new Funcionario();
        maria.nome = "Maria Adelaide";
        maria.departamento = "Gerente";
        maria.salario = 3500;
        maria.dataDeEntrada = "10/12/2000";
        maria.rg = "2369541255";

        System.out.println("Anual sem aumento: " + maria.calculaGanhoAnual());
      
        maria.recebeAumento(350);
        
        System.out.println("Anual com aumento: " + maria.calculaGanhoAnual());

	}

}

