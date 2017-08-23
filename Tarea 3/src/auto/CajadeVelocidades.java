package auto;

public class CajadeVelocidades {
	private int cantmarchas;
	private String tiporelacion;
	
	public String toString() {
		return "\n \n Caja" +
				"\n Relacion de marchas: " + getTiporelacion() + 
				"\n Cantidad de marchas: " + getCantmarchas();
	}
	// G and S
	public int getCantmarchas() {
		return cantmarchas;
	}
	public void setCantmarchas(int cantmarchas) {
		this.cantmarchas = cantmarchas;
	}
	public String getTiporelacion() {
		return tiporelacion;
	}
	public void setTiporelacion(String tiporelacion) {
		this.tiporelacion = tiporelacion;
	}
}
