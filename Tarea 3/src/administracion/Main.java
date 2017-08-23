package administracion;
import java.util.ArrayList;

import administracion.*;
import utils.Dentre;
public class Main {
	public static void main(String[] args) {
		boolean sigo = true;
		int cont = 0;
		Empleado[] lista = new Empleado[10];
	    while(sigo && cont < 10) {
	        System.out.println("1-alta empleado");
	        System.out.println("2-alta ejecutivo");
	        System.out.println("3-modificar empleado");
	        System.out.println("4-modificar ejecutivo");
	        System.out.println("5-baja empleado");
	        System.out.println("6-baja ejecutivo");
	        System.out.println("7-aumentar sueldo");
	        System.out.println("8-disminuir horas");
	        System.out.println("9-mostrar empleados/ejecutivos");
	        System.out.println("10-calcular vacaciones");
	        System.out.println("99-salir");
	        int opcion = Dentre.entero("ingrese opcion: ");
	        

	        switch(opcion) {
	        case 1:
	        		System.out.println("caso 1");
	        		lista[cont] = new Empleado();
	        		lista[cont].altaemp();
	        		cont++;
	            break;
	        case 2:
	        		System.out.println("caso 2");
	        		lista[cont] = new Ejecutivo();
	        		((Ejecutivo) lista[cont]).altaejecutivo();
	        		cont++;
	            break;
	        case 3:
	        		int dniem = Dentre.entero("ingrese dni del empelado a modificar");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dniem && lista[i] instanceof Empleado) {
	        				lista[i].modificarEmpleado();
	        				break;
	        			}
	        		}
	        		break;
	        case 4:
	        		int dniej = Dentre.entero("ingrese dni del ejecutivo a modificar");
	        		for(int i = 0;i<10;i++){
	        			if(lista[i].getDni() == dniej && lista[i] instanceof Ejecutivo) {
        				((Ejecutivo)lista[i]).modificarEjecutivo();
        				break;
	        			}
	        		}
	        		break;
	        case 5:
	        		int dnibajaem = Dentre.entero("ingrese dni del empelado a dar de baja");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dnibajaem && lista[i] instanceof Empleado) {
	        				lista[i]=null;
	        				break;
	        			}
	        		}
	        		break;
	        case 6:
	        		int dnibajaej = Dentre.entero("ingrese dni del empelado a modificar");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dnibajaej && lista[i] instanceof Empleado) {
	        				lista[i]=null;
	        				break;
	        			}
	        		}
	        		break;
	        case 7:
	        		int dniaumento = Dentre.entero("ingrese dni del empelado/ejecutivo");
	        		int aumento = Dentre.entero("ingrese aumento");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dniaumento) {
	        				lista[i].aumentosueldo(aumento);
	        				break;
	        			}
	        		}
	        		break;
	        case 8:
	        		int dniejec = Dentre.entero("ingrese dni del empelado/ejecutivo");
	        		Float disminucionh = Dentre.flotante("ingrese horas a restar");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dniejec) {
	        				((Ejecutivo)lista[i]).disminuirhoras(disminucionh);
	        				break;
	        			}
	        		}
	        		break;
	        case 9:
	        		System.out.println("caso 9");
	        		int cont2=0;
	        		while(cont2 < 10) {
	        		if(lista[cont2] instanceof Empleado) {
	        			lista[cont2].listarEmpleados(lista[cont2]);	
	        			System.out.println("empleado listado");
	        			cont2++;
	        		}
	        		else if(lista[cont2] instanceof Ejecutivo) {
	        			((Ejecutivo) lista[cont2]).listarEjecutivo((Ejecutivo)lista[cont2]);	
	        			System.out.println("ejecutivo listado");
	        			cont2++;
					}
	        		cont2++;
	        		}
	        		System.out.println("termino");
	        		break;
	        case 10:
	        		int dnivacas = Dentre.entero("ingrese dni del empelado/ejecutivo");
	        		int diast = Dentre.entero("ingrese dias trabajados del empelado/ejecutivo");
	        		for(int i=0;i<10;i++){
	        			if(lista[i].getDni() == dnivacas && lista[i] instanceof Empleado) {
	        				lista[i].vacaciones(diast);
	        				break;
	        			}
	        			else if(lista[i].getDni() == dnivacas && lista[i] instanceof Ejecutivo) {
	        				((Ejecutivo)lista[i]).vacacioneseje(diast);
	        				break;
	        			}
	        		}
	        		break;
	        case 99: sigo=false;
	        		System.out.println("Termino el programa");
	            break;
	        default: System.out.println("opcion invalida");
	            break;
	        }
	    }
	
}
}