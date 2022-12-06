package listas;

public class Funcionarios {

	private Integer id;
	protected String nome;
	protected Double salario;
	
	public Funcionarios(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	public String toString() {
		return id + ", "+ nome + ", "+ String.format("%.2f", salario);
	}
	
}
