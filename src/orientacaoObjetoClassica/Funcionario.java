package orientacaoObjetoClassica;

public class Funcionario {
	private String nome;
	private double salario;
	private Data dataDeEntrada = new Data();
	private String departamento;
	private String rg;
	private Boolean estaAtivo;
	
	public Funcionario(String nome){
		this.nome = nome;
	}

	public Funcionario(){
		
	}
	
	void recebeAumento(double aumento) {
		this.salario = this.salario + aumento;
	}

	String calculaGanhoAnual() {
		return "O ganho anual de " + this.nome + " �: " + (this.salario * 12);
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data De Entrada: " + this.dataDeEntrada.dataFormatada());
		System.out.println("Departamento: " + this.departamento);
		System.out.println("RG: " + this.rg);
		System.out.println("estaAtivo: " + this.estaAtivo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Boolean getEstaAtivo() {
		return estaAtivo;
	}

	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	
	
}
