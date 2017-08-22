package administracion;

import utils.Dentre;

public class Ejecutivo extends Empleado{
	private int edad;
	private float horasT;
	private int diasT;
	private int diasvacas;
	
	public void modificarEjecutivo() {
		String nombre = Dentre.texto("\n Ingrese nombre del nuevo ejecutivo: ");
		String sexo = Dentre.texto("\n Ingrese sexo del nuevo ejecutivo: ");
		int edad = Dentre.entero("\n Ingrese edad del nuevo ejecutivo: ");
		int horasT = Dentre.entero("\n Ingrese horas de trabajo del nuevo ejecutivo: ");
		int legajo = Dentre.entero("\n Ingrese legajo del nuevo ejecutivo: ");
		float sueldo = Dentre.flotante("\n Ingrese sueldo del nuevo ejecutivo: ");
		super.setNombre(nombre);
		super.setSexo(sexo);
		super.setLegajo(legajo);
		super.setSueldo(sueldo);
		setHorasT(horasT);
		setEdad(edad);
	}
	
	public void altaejecutivo() {
		String nombre = Dentre.texto("\n Ingrese nombre del nuevo ejecutivo: ");
		String sexo = Dentre.texto("\n Ingrese sexo del nuevo ejecutivo: ");
		int edad = Dentre.entero("\n Ingrese edad del nuevo ejecutivo: ");
		int horasT = Dentre.entero("\n Ingrese horas de trabajo del nuevo ejecutivo: ");
		int dni = Dentre.entero("\n Ingrese dni sin . ni , del nuevo ejecutivo: ");
		int legajo = Dentre.entero("\n Ingrese legajo del nuevo ejecutivo: ");
		float sueldo = Dentre.flotante("\n Ingrese sueldo del nuevo ejecutivo: ");
		super.setNombre(nombre);
		super.setSexo(sexo);
		super.setDni(dni);
		super.setLegajo(legajo);
		super.setSueldo(sueldo);
		setHorasT(horasT);
		setEdad(edad);
	}
	public void listarEjecutivo(Ejecutivo e){
		System.out.println(e.getNombre() + e.getSexo() + e.getDni() + e.getLegajo() + e.getSueldo());
	}
	public void vacaciones(int dias) {
		if(((diasT / 6) * 1.5) >= (getDiasvacas() + dias)) {
		setDiasvacas(getDiasvacas() + dias);
		}
		else {
			System.out.println("no es posible darle esa cantidad de dias");
		}
	}
	public void disminuirhoras(float horas) {
		setHorasT(horasT - horas);
	}
	
	public float getHorasT() {
		return horasT;
	}
	public void setHorasT(float horasT) {
		this.horasT = horasT;
	}

	public int getDiasvacas() {
		return diasvacas;
	}

	public void setDiasvacas(int diasvacas) {
		this.diasvacas = diasvacas;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
