package aula20200615;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	
	private List<Endereco> enderecos = new ArrayList<>();


	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void addEndereco(Endereco e) {
		enderecos.add(e);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", enderecos=" + enderecos + "]";
	}

	
	

	
	



	
	
}
