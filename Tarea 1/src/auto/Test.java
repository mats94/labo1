package auto;
import auto.*;
public class Test {

	public static void main(String[] args) {
		// car
		Caja_de_Velocidades caja = new Caja_de_Velocidades();
		Motor motor = new Motor();
		Rueda rueda = new Rueda();
		Auto car = new Auto();
		// seteo los valores
			//Motor
		motor.setMarca("Ford");
		motor.setHp(105);
		motor.setCilindrada(1.6f);
			//Rueda
		rueda.setRadio(1.3F);
		rueda.setColor("plateado");
		rueda.setMaterial("acero");
		rueda.setAleacion("aluminio");
			//Caja
		caja.setCant_marchas(5);
		caja.setTipo_relacion("manual");
			//Auto
		car.setAa("si");
		car.setPuertas(4);
		
		//imprimo los datos
		System.out.println(
				"Auto 1 \n" +
				" Motor \n" +
				" marca del motor: " + motor.getMarca() +
				"\n HP: " + motor.getHp() +
				"\n Cilindrada : " + motor.getCilindrada() + 
				"\n \n Rueda" + 
				"\n Aleacion: " + rueda.getAleacion() + 
				"\n Color: " + rueda.getColor() + 
				"\n Material: " + rueda.getMaterial() +
				"\n Radio: " + rueda.getRadio() +
				"\n \n Caja" +
				"\n Relacion de marchas: " + caja.getTipo_relacion() + 
				"\n Cantidad de marchas: " + caja.getCant_marchas() +
				"\n \n Equipacion del Auto" +
				"\n Aire Acondicionado: " + car.getAa() +
				"\n Cantidad de puertas: " + car.getPuertas()
				);
	/*	// car2
		Caja_de_Velocidades caja2 = new Caja_de_Velocidades();
		Motor motor2 = new Motor();
		Rueda rueda2 = new Rueda();
		Auto car2 = new Auto();
		// seteo los valores
			//Motor
		motor2.setMarca("volkswagen");
		motor2.setHp(127);
		motor2.setCilindrada(1.7f);
			//Rueda
		rueda2.setAleacion("aluminio");
		rueda2.setColor("negro");
		rueda2.setMaterial("acero");
		rueda2.setRadio(1.4F);
		//Caja
		caja2.setCant_marchas(5);
		caja2.setTipo_relacion("automatico");
		//Auto
		car2.setAa("si");
		car2.setPuertas(5);
				
		//imprimo los datos
		System.out.println(
				"\n Auto 2 \n" +
				" Motor \n" +
				" marca del motor: " + motor2.getMarca() +
				"\n HP: " + motor2.getHp() +
				"\n Cilindrada : " + motor2.getCilindrada() + 
				"\n \n Rueda" + 
				"\n Aleacion: " + rueda2.getAleacion() + 
				"\n Color: " + rueda2.getColor() + 
				"\n Material: " + rueda2.getMaterial() +
				"\n Radio: " + rueda2.getRadio() +
				"\n \n Caja" +
				"\n Relacion de marchas: " + caja2.getTipo_relacion() + 
				"\n Cantidad de marchas: " + caja2.getCant_marchas() +
				"\n \n Equipacion del Auto" +
				"\n Aire Acondicionado: " + car2.getAa() +
				"\n Cantidad de puertas: " + car2.getPuertas()
				); */
	} }


