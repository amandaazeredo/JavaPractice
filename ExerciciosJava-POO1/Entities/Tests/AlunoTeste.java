package Entities.Tests;
import java.util.Scanner;
import Entities.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 Aluno aluno = new Aluno();
		 
		 System.out.println("Entre com seu nome: ");
		 aluno.setNome(sc.next());
		 
		 System.out.println("Entre com o número da matrícula: ");
		 aluno.setNumMatricula(sc.next());
		 
		 System.out.println("Entre com o nome do seu curso: ");
		 aluno.setCurso(sc.next());
		 
		 for(int i = 0; i < aluno.disciplinas.length; i++) {
			 System.out.println("Entre com o nome da " + (i+1) + " diciplina: ");
			 aluno.disciplinas[i] = sc.next();
		 }
		 for(int i = 0; i < aluno.notas.length; i++) {
			 System.out.println("Entre com as notas da diciplina " + aluno.disciplinas[i]);
			 for(int j=0; j<aluno.notas[i].length; j++) {
				 System.out.println("Entre com a nota: " + (j+1));
				 aluno.notas[i][j] = sc.nextDouble();
			 }
		 }

		 aluno.dados();
		 
		 for(int i=0; i<aluno.disciplinas.length; i++) {
			 if(aluno.verificarAprovacao(i)) {
				 System.out.println("Na disciplina " + aluno.disciplinas[i] + " - foi APROVADO");
			 } else {
				 System.out.println("Na disciplina " + aluno.disciplinas[i] + " - foi REPROVADO");
			 }
		 }
		 
		 sc.close();
	}
}
