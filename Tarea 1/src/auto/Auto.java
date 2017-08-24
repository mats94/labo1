package auto;
import auto.*;
public class Auto {
	private Motor motor;
	private Rueda rueda;
	private CajadeVelocidades caja;
	private String aa;
	private int puertas;
	
	public String toString() {
		return motor.toString() + rueda.toString() + caja.toString() + "\n \n Equipacion del Auto" +
				"\n Aire Acondicionado: " + getAa() +
				"\n Cantidad de puertas: " + getPuertas();
	}
	// G and S
	public Motor getMotor() {
		return motor;
	}
	public Rueda getRueda() {
		return rueda;
	}
	public void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}
	public CajadeVelocidades getCaja() {
		return caja;
	}
	public void setCaja(CajadeVelocidades caja) {
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
	/*public void setMotor(String marca, int hp, float cilindrada) {
		motor.setMarca(marca);
		motor.setHp(hp);
		motor.setCilindrada(cilindrada);
		
	} */
	public void setCaja(int cant_marchas, String tipo_relacion) {
		caja.setCantmarchas(cant_marchas);
		caja.setTiporelacion(tipo_relacion);
		
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
