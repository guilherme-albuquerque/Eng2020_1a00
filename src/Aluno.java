
public class Aluno{
	
   private String nome;
   private int id;

   public String getNome() {
      return nome;
   }

   public int getId() {
      return id;
   }

public void setNome(String nome) {
	this.nome = nome;
}

public void setId(int id) {
	this.id = id;
}

    public Aluno(String nome) {
        this.nome = nome;
    }

	public Aluno(int id) {
		this.id = id;
	}
}
   