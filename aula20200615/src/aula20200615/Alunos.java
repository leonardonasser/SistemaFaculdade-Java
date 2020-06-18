package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Alunos extends Pessoa {

	private int ra;
	private boolean status = false;

	public Alunos(int ra) {
		this.ra = ra;
	}

	private ContratosEducacionais contrato;
	private List<Turma> turmas = new ArrayList<>();

	public void addContrato(ContratosEducacionais c) {
		if (status == false) {
			contrato = c;
			status = true;
		}
	}

	public boolean statusAlunos() {
		return status;
	}

	public void addTurma(Turma t) {
		turmas.add(t);
	}

}
