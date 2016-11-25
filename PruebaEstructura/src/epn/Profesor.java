package epn;

public class Profesor extends Persona {
	private int cod;
	
	public Profesor() {
		super();
		this.cod=0;
	}

	
	public Profesor(int cod,String nom) {
		super(nom);
		this.cod = cod;
	}


	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	@Override
	public String toString() {
		return "("+ super.toString()+" - codigo prof=" + cod + ")";
	}
}
