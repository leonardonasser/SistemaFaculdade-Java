package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String descricao;
	private int codTurma;
	
	private Cursos curso;
	private List<Alunos> alunos = new ArrayList<>();
	
	public Turma(String descricao, int codTurma, Cursos curso) {
		this.descricao = descricao;
		this.codTurma = codTurma;
		this.curso = curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCodTurma() {
		return codTurma;
	}

	public Cursos getCurso() {
		return curso;
	}

	public List<Alunos> getAlunos() {
		return alunos;
	}
	
	public void addAlunos(Alunos a) {
		alunos.add(a);
	}
	
	
}
