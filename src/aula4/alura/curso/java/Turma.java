package aula4.alura.curso.java;

class Turma {
	Aluno[] alunos;
	
	void imprimeNotas(){
		for (int i = 0; i < this.alunos.length; i++){
			Aluno aluno = this.alunos[i];
			if (aluno == null) continue;
			System.out.println(aluno.nota);
		}
	}
}
