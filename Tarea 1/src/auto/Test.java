package auto;
import auto.*;
public class Test {

	public static void main(String[] args) {
		// car
		Auto car = new Auto();
		// seteo los valores
			//Motor
		car.setMotor("Ford",105,1.6f);
			//Rueda
		car.setRueda(1.3F,"plateado","acero","aluminio");
			//Caja
		car.setCaja(5,"manual");
			//Auto
		car.setAa("si");
		car.setPuertas(4);
		
		//imprimo los datos
		System.out.println(
				"Auto 1 \n" +
				" Motor \n" +
				" marca del motor: " + car.motor.getMarca() +
				"\n HP: " + car.motor.getHp() +
				"\n Cilindrada : " + car.motor.getCilindrada() + 
				"\n \n Rueda" + 
				"\n Aleacion: " + car.rueda.getAleacion() + 
				"\n Color: " + car.rueda.getColor() + 
				"\n Material: " + car.rueda.getMaterial() +
				"\n Radio: " + car.rueda.getRadio() +
				"\n \n Caja" +
				"\n Relacion de marchas: " + car.caja.getTipo_relacion() + 
				"\n Cantidad de marchas: " + car.caja.getCant_marchas() +
				"\n \n Equipacion del Auto" +
				"\n Aire Acondicionado: " + car.getAa() +
				"\n Cantidad de puertas: " + car.getPuertas()
				);
	/*	// car2
		Auto car2 = new Auto();
		// seteo los valores
			//Motor
		car2.motor.setMarca("volkswagen");
		car2.motor.setHp(127);
		car2.motor.setCilindrada(1.7f);
			//Rueda
		car2.rueda.setAleacion("aluminio");
		car2.rueda.setColor("negro");
		car2.rueda.setMaterial("acero");
		car2.rueda.setRadio(1.4F);
		//Caja
		car2.caja.setCant_marchas(5);
		car2.caja.setTipo_relacion("automatico");
		//Auto
		car2.setAa("si");
		car2.setPuertas(5);
				
		//imprimo los datos
		System.out.println(
				"\n Auto 2 \n" +
				" Motor \n" +
				" marca del motor: " + car2.motor.getMarca() +
				"\n HP: " + car2.motor.getHp() +
				"\n Cilindrada : " + car2.motor.getCilindrada() + 
				"\n \n Rueda" + 
				"\n Aleacion: " + car2.rueda.getAleacion() + 
				"\n Color: " + car2.rueda.getColor() + 
				"\n Material: " + car2.rueda.getMaterial() +
				"\n Radio: " + car2.rueda.getRadio() +
				"\n \n Caja" +
				"\n Relacion de marchas: " + car2.caja.getTipo_relacion() + 
				"\n Cantidad de marchas: " + car2.caja.getCant_marchas() +
				"\n \n Equipacion del Auto" +
				"\n Aire Acondicionado: " + car2.getAa() +
				"\n Cantidad de puertas: " + car2.getPuertas()
				); */
	}

}
