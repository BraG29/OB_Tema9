package clases;

public class Trabajador extends Persona{
	private float salario;

	public Trabajador(int edad, String nombre, String telefono, float salario) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
