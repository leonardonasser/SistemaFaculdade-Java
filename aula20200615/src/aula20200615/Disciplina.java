package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private int idDisciplina;
	private String nome;
	
	private List<Professor> professores =  new ArrayList<>();

	public Disciplina(int idDisciplina, String nome) {
		this.idDisciplina = idDisciplina;
		this.nome = nome;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}
	
	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
	

}
