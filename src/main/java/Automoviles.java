public class Automoviles {
	private String marca;
	private String modelo;
	private String fecha;
	private int precio;
	public Motor motor;
	public Chasis chasis;

	public Automoviles(String marca, String modelo, String fecha, int precio, Motor motor, Chasis chasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.fecha = fecha;
		this.precio = precio;
		this.motor = motor;
		this.chasis = chasis;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getFecha() {
		return this.fecha;
	}

	public int getPrecio() {
		return this.precio;
	}

	@Override
	public String toString() {
		return "Automoviles{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' +
				", fecha=" + fecha + ", precio=" + precio +
				", motor=" + motor + ", chasis=" + chasis + '}';
	}
}