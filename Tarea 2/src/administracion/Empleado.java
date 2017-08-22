package administracion;

import utils.Dentre;

public class Empleado extends Persona{
	private int legajo;
	private float sueldo;
	private int diasvacas;
	private int diasT;
	public void modificarEmpleado() {
		String nombre = Dentre.texto("\n Ingrese nombre del  empleado: ");
		String sexo = Dentre.texto("\n Ingrese sexo del  empleado: ");
		int legajo = Dentre.entero("\n Ingrese legajo del  empleado: ");
		float sueldo = Dentre.flotante("\n Ingrese sueldo del  empleado: ");
		super.setNombre(nombre);
		super.setSexo(sexo);
		setLegajo(legajo);
		setSueldo(sueldo);
	}
	public void listarEmpleados(Empleado e){
		System.out.println(e.getNombre() + e.getSexo() + e.getDni() + e.getLegajo() + e.getSueldo());
	}
	public void altaemp() {
		String nombre = Dentre.texto("\n Ingrese nombre del nuevo empleado: ");
		String sexo = Dentre.texto("\n Ingrese sexo del nuevo empleado: ");
		int dni = Dentre.entero("\n Ingrese dni sin . ni , del nuevo empleado: ");
		int legajo = Dentre.entero("\n Ingrese legajo del nuevo empleado: ");
		float sueldo = Dentre.flotante("\n Ingrese sueldo del nuevo empleado: ");
		super.setNombre(nombre);
		super.setSexo(sexo);
		super.setDni(dni);
		setLegajo(legajo);
		setSueldo(sueldo);
	}
	
	public void aumentosueldo(int aumento) {
		setSueldo(getSueldo() * aumento);
	}
	public void vacaciones(int dias) {
		if((diasT / 6) >= (getDiasvacas() + dias)) {
		setDiasvacas(getDiasvacas() + dias);
		}
		else {
			System.out.println("no es posible darle esa cantidad de dias");
		}
	}
	
	
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public int getDiasvacas() {
		return diasvacas;
	}
	public void setDiasvacas(int diasvacas) {
		this.diasvacas = diasvacas;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getDiasT() {
		return diasT;
	}

	public void setDiasT(int diasT) {
		this.diasT = diasT;
	}
}
