package Entities;
public class Aluno {

	private String nome;
	private String numMatricula;
	private String curso;
	public String[] disciplinas = new String[3];
	public double[][] notas = new double[3][4];
	public boolean verificarAprovacao;
	
	public void dados() {
		System.out.println("Seus dados são:");
		System.out.println("Nome: " + nome);
		System.out.println("Número da matrícula: " + numMatricula);
		System.out.println("Nome do curso: " + curso);
		System.out.println("Diciplinas: " + disciplinas[0] + ", " + disciplinas[1] + " e " + disciplinas[2]);
		for(int i=0; i<notas.length; i++) {
			System.out.println("Suas notas da diciplina " + disciplinas[i]);
			for(int j=0; j<notas.length; j++) {
				System.out.println(notas[i][j] + " ");
			}
		}
	}
	
	public boolean verificarAprovacao (int indice) {
		
		if(obterMedia(indice) >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public double obterMedia(int indice) {
		double soma = 0;
		
		for(int i=0; i<notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma/4;
		
		return media;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] diciplinas) {
		this.disciplinas = diciplinas;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
}
