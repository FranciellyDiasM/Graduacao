package appTutoria;

public class Aluno extends Usuario {
	
    public Aluno(String nome, String email, String senha) {
		super(nome, email, senha);
	}
    
    
	private String areaDeInteresse;
    private String nivelConhecimento;
    
    
	public Aluno(String nome, String email, String senha, String areaDeInteresse, String nivelConhecimento) {
		super(nome, email, senha);
		this.areaDeInteresse = areaDeInteresse;
		this.nivelConhecimento = nivelConhecimento;
	}


	public String getAreaDeInteresse() {
		return areaDeInteresse;
	}


	public String getNivelConhecimento() {
		return nivelConhecimento;
	}


	public void setAreaDeInteresse(String areaDeInteresse) {
		this.areaDeInteresse = areaDeInteresse;
	}


	public void setNivelConhecimento(String nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}


	@Override
	public String toString() {
		return "Aluno [areaDeInteresse=" + areaDeInteresse + ", nivelConhecimento=" + nivelConhecimento + "]";
	}
 
    
    
}
