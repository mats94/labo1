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
	        		int dni = Dentre.entero("ingrese dni del empelado a modificar");
	        		for(int i = 0;i<10;i++){
	        			if(lista[i].getDni() == dni) {
	        				lista[i].modificarEmpleado();
	        			}
	        		}
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
	        case 99: sigo=false;
	        		System.out.println("Termino el programa");
	            break;
	        default: System.out.println("opcion invalida");
	            break;
	        }
	    }
	
}
}