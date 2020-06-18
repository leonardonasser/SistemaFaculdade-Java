package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
	
	private String descricao;
	private int idCurso;
	
	private Coordenadores coordenador;
	
	private List<Turma> turmas = new ArrayList<>(); 
	private List<Disciplina> diciplinas = new ArrayList<>();

	public Cursos(String descricao, int idCurso, Coordenadores coordenador) {
		this.descricao = descricao;
		this.idCurso = idCurso;
		this.coordenador = coordenador;
	}
	
	
	

}
