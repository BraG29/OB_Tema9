package main;

import clases.Cliente;
import clases.Persona;
import clases.Trabajador;

public class Main {

	public static void main(String[] args) {
		Persona cliente = new Cliente(25, "Pablo", "093278543", 2000);
		printPersona(cliente);
		Persona trabajador = new Trabajador(31, "Miguel", "095346509", 15000);
		printPersona(trabajador);
	}
	
	public static void printPersona(Persona persona) {
		System.out.println("------------------------------");
		System.out.println("Datos para la persona " + persona.getNombre() + ":");
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());
		//Pregunto que tipo de persona es, en caso de ser Cliente muestro su credito 
		//y en caso de ser trabajador muestro su salario
		if(persona instanceof Cliente) {
			Cliente cliente = (Cliente)persona;
			System.out.println("Credito: " + cliente.getCredito());
		//Para este ejercicio se que persona solo puede ser de tipo Cliente o Trabajador
		//por eso solo uso if y else 
		}else {
			Trabajador trabajador = (Trabajador)persona;
			System.out.println("Salario: " + trabajador.getSalario());
		}
		
		System.out.println("------------------------------");
	}
}
