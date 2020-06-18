package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class ContratosEducacionais {

	private int idContrato;

	private Alunos aluno;
	private List<Avalistas> avalistas = new ArrayList<>();

	public ContratosEducacionais(int idContrato, Avalistas a, Alunos aluno) {
		this.idContrato = idContrato;
		this.avalistas.add(a);
		this.aluno = aluno;
	}

	public int getIdContrato() {
		return idContrato;
	}

	public Alunos getAluno() {
		return aluno;
	}

	public List<Avalistas> getAvalista() {
		return avalistas;
	}
	
	public void addAvalista(Avalistas a) {
		avalistas.add(a);
	}
	
	
}
