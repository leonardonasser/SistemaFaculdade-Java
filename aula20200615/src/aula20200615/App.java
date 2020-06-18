package aula20200615;

public class App {
	
	public static void main(String[] args) {
		
		Endereco end1Leo =  new Endereco("Avenida taltal",298,"Apto","Zona 5","Maringá","Paraná",true);
		Endereco end2Leo =  new Endereco("R. Inhaúma",398,"casa","Zona 3","Maringá","Paraná",false);
		Alunos alunoleo = new Alunos(1);
		alunoleo.setNome("leo");
		alunoleo.setSobrenome("Nasser");
		alunoleo.setDataNascimento("24/08/2001");
		alunoleo.addEndereco(end1Leo);
		alunoleo.addEndereco(end2Leo);
		
		Endereco endJoao = new Endereco("R. Rosana",398,"casa","Sol nascente","Maringá","Paraná",true);
		Avalistas avaJoao =  new Avalistas(1);
		avaJoao.setNome("Joao");
		avaJoao.setSobrenome("Santos");
		avaJoao.setDataNascimento("01/10/1980");
		avaJoao.addEndereco(endJoao);
		
		ContratosEducacionais c1 = new ContratosEducacionais(1,avaJoao,alunoleo);
		alunoleo.addContrato(c1);
		
		//Caso queira ver se está matriculado ou não
		System.out.println("Aluno matriculado? "+alunoleo.statusAlunos());
		
		Endereco end1Luis =  new Endereco("Av taltal",498,"Casa","Zona 1","Maringá","Paraná",true);
		Endereco end2Luis =  new Endereco("R. seila",198,"casa","Zona 2","Maringá","Paraná",false);
		Coordenadores coordLuis = new Coordenadores(1);
		coordLuis.setNome("Luis");
		coordLuis.setSobrenome("Nascimento");
		coordLuis.setDataNascimento("02/05/1985");
		coordLuis.addEndereco(end1Luis);
		coordLuis.addEndereco(end2Luis);
		
		Endereco endLucas =  new Endereco("Av morangueira",321,"apto","Alvorada","Maringpa","Paraná",true);
		Professor profLucas = new Professor(1);
		profLucas.setNome("Lucas");
		profLucas.setSobrenome("Bores");
		profLucas.setDataNascimento("10/05/1990");
		profLucas.addEndereco(endLucas);
		
		
		Cursos nutricao = new Cursos("Nutrição",1,coordLuis);
		Turma turmaA = new Turma("Turma A Nutrição",1,nutricao);
		Disciplina anatomia =  new Disciplina(1,"Anatomia");
		
	}

}
