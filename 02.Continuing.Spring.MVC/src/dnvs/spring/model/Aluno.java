package dnvs.spring.model;

public class Aluno {

	private String name;
	private String matricula;
	private String turma;
	private boolean matriculado;
	private String genero;


	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}




}
