package br.com.loiane.cursojava.aula60;

public class EscopoVariaveis {

	// o escopo de uma variavel só pode ser feito dentro do bloco onde ela for criada
	// ela poderá ser chamada em diversos lugares se for uma variavel global(que não foi criada dentro de um bloco, seja for/if..., específico)
	private int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		valor = valor + 10;
		
		//this.valor = valor;
		
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		
		if(true) {
			valor--;
		}
		
		//this.valor = valor; referencial valor global/atributo da classe
		
		return valor;
	}
	
	public void outroTeste() {
		for(int i =0; i<10; i++) {
			System.out.println(i);
		}

		//i++; //erro de compilação
		
		int j;
		for(j=0; j<10; j++) {
			System.out.println(j); //j tem valor 10
		}
	}
		public void maisUmTeste() {
			boolean flag = true;
			
			if(flag) {
				int umaVariavel = 10;
				
				umaVariavel++;
				
				System.out.println(umaVariavel);
			}
			//System.out.println(umaVariavel);//erro de compilação, pois a variavel só pode ser referenciada dentro do bloco onde ela foi criada
		}
		
		public void maisUmOutroTeste(int num) {
			int total = 0;
			
			try {
				int outroNum = 0;
				
				total = num/outroNum;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				total++;
				//outroNum++; //erro de compilação
				//e.printStrackTrace(); //erro de compilação
			}
			num++;
			//outroNum++ //erro de compilação
			//e.printStrachTrace(); //erro de compilação
		}
}
