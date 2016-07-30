package orientacaoObjetoClassica;

public class Funcionario {
	String nome;
	double salario;
	Data dataDeEntrada = new Data();
	String departamento;
	String rg;
	Boolean estaAtivo;

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
}
