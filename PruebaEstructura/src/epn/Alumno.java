package epn;

public class Alumno extends Persona {
	private int cod;

	public Alumno(int cod,String nom) {
		super(nom);
		this.cod = cod;
	}

	public Alumno() {
		super();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return ""+ super.toString()+"- codigo alum=" + cod + "\n";
	}
	
}
