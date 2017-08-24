package administracion;

import utils.Dentre;

public class Ejecutivo extends Empleado{
	private int edad;
	private float horasT;
	private int diasT;
	private float diasvacas;
	
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
	public String toString(){
		return getNombre() + getSexo() + getDni() + getLegajo() + getSueldo();
	}
	public void vacacioneseje(int dias) {
		setDiasvacas((dias / 6) * 1.5f);
		System.out.println(getDiasvacas());
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

	public float getDiasvacas() {
		return diasvacas;
	}

	public void setDiasvacas(float f) {
		this.diasvacas = f;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
