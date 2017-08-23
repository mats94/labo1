package auto;
import auto.*;
public class Auto {
	Motor motor;
	Rueda rueda;
	Caja_de_Velocidades caja;
	private String aa;
	private int puertas;
	
	// G and S
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Rueda getRueda() {
		return rueda;
	}
	public void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}
	public Caja_de_Velocidades getCaja() {
		return caja;
	}
	public void setCaja(Caja_de_Velocidades caja) {
		this.caja = caja;
	}
	public String getAa() {
		return aa;
	}
	public void setAa(String aa) {
		this.aa = aa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setRueda(float radio, String color, String material, String aleacion) {
		rueda.setRadio(radio);
		rueda.setColor(color);
		rueda.setMaterial(material);
		rueda.setAleacion(aleacion);
		
	}
	public void setMotor(String marca, int hp, float cilindrada) {
		motor.setMarca(marca);
		motor.setHp(hp);
		motor.setCilindrada(cilindrada);
		
	}
	public void setCaja(int cant_marchas, String tipo_relacion) {
		caja.setCant_marchas(cant_marchas);
		caja.setTipo_relacion(tipo_relacion);
		
	}
}
