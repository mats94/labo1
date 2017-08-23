package administracion;

import utils.Dentre;

public class Empleado{
	private int legajo;
	private float sueldo;
	private float diasvacas;
	private int diasT;
	private String nombre;
	private String sexo;
	private int dni;
	public void modificarEmpleado() {
		String nombre = Dentre.texto("\n Ingrese nombre del  empleado: ");
		String sexo = Dentre.texto("\n Ingrese sexo del  empleado: ");
		int legajo = Dentre.entero("\n Ingrese legajo del  empleado: ");
		float sueldo = Dentre.flotante("\n Ingrese sueldo del  empleado: ");
		setNombre(nombre);
		setSexo(sexo);
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
		setNombre(nombre);
		setSexo(sexo);
		setDni(dni);
		setLegajo(legajo);
		setSueldo(sueldo);
	}
	
	public void aumentosueldo(int aumento) {
		setSueldo(getSueldo() * aumento);
	}
	public void vacaciones(int diast) {
		setDiasvacas(diasT / 6);
		System.out.println("Dias de vacaciones: " + getDiasvacas());
		}
	
	
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public float getDiasvacas() {
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}
