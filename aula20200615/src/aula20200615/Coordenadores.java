package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Pessoa {

	private int codCoordenador;

	private List<Cursos> cursos = new ArrayList<>();

	public Coordenadores(int codCoordenador) {
		this.codCoordenador = codCoordenador;
	}

	public int getCodCoordenador() {
		return codCoordenador;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void addCurso(Cursos c) {
		cursos.add(c);
	}

}
