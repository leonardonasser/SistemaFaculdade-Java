package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
	
	private int idProfessor;
	
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Professor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	public void addDisciplina(Disciplina d) {
		disciplinas.add(d);
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	
	
	
	

}
