package auto;

public class Rueda {
	private Float radio;
	private String color;
	private String material;
	private String aleacion;
	
	public String toString() {
		return "\n \n Rueda" + 
				"\n Aleacion: " + getAleacion() + 
				"\n Color: " + getColor() + 
				"\n Material: " + getMaterial() +
				"\n Radio: " + getRadio();
	}
	//G and S
	public Float getRadio() {
		return radio;
	}
	public void setRadio(Float radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getAleacion() {
		return aleacion;
	}
	public void setAleacion(String aleacion) {
		this.aleacion = aleacion;
	}
}
