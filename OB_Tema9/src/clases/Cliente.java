package clases;

public class Cliente extends Persona {
	private float credito;

	

	public Cliente(int edad, String nombre, String telefono, float credito) {
		super(edad, nombre, telefono);
		this.credito = credito;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
	
}
