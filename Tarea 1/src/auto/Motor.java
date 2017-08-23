package auto;

public class Motor {
	private String marca;
	private int hp;
	private Float cilindrada;
	
	public String toString() {
		return " Motor \n" +
				" marca del motor: " + getMarca() +
				"\n HP: " + getHp() +
				"\n Cilindrada : " + getCilindrada();
	}
	// G and S
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}
}
