package auto;
import auto.*;
public class Test {

	public static void main(String[] args) {
		// car
		CajadeVelocidades caja = new CajadeVelocidades();
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
		caja.setCantmarchas(5);
		caja.setTiporelacion("manual");
			//Auto
		car.setAa("si");
		car.setPuertas(4);
		
		//imprimo los datos
		System.out.println(
				"Auto 1 \n" +
				motor.toString() + 
				rueda.toString() +
				caja.toString() +
				car.toString()
				);
		// car2
		CajadeVelocidades caja2 = new CajadeVelocidades();
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
		caja2.setCantmarchas(5);
		caja2.setTiporelacion("automatico");
		//Auto
		car2.setAa("si");
		car2.setPuertas(5);
				
		//imprimo los datos
		System.out.println(
				"\n Auto 2 \n" +
				motor2.toString() +
				rueda2.toString() +
				caja2.toString() +
				car2.toString()
				); 
	} 
}


