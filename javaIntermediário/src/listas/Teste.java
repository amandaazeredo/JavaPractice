package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> listaFun = new ArrayList<>();
		
		System.out.println("Quantos funcionarios serão cadastrados no sistema?");
		int numFuncionarios = sc.nextInt();
		 
		for(int i = 0; i < numFuncionarios; i++) {
			System.out.println("Funcionario " + (i+1));
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();

			Funcionarios fun = new Funcionarios(id, nome, salario);
			
			listaFun.add(fun);
		}
		
		System.out.println("Informe o id do funcionario que tera seu salario aumentado");
		int id = sc.nextInt();
		/*Funcionarios fun2 = listaFun.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(fun2 == null)*/
		Integer pos = posicaoId(listaFun, id);
		if(pos == null){
			System.out.println("Esse id não corresponde a nenhum funcionario");	
		}else {
			System.out.println("Digite a porcentagem a ser adicionada: ");
			double porcentagem = sc.nextDouble();
			listaFun.get(pos).aumentaSalario(porcentagem);
			
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for(Funcionarios funcionarios : listaFun) {
			System.out.println(funcionarios);
		}
		
		sc.close();
	}
	public static Integer posicaoId(List<Funcionarios> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}