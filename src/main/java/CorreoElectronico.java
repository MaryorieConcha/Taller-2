public class CorreoElectronico {
	private String direccionCorreo;
	private String proveedor;
	public CorreoElectronico(String direccionCorreo, String proveedor) {
		this.direccionCorreo = direccionCorreo;
		this.proveedor = proveedor;
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public String getProveedor() {
		return this.proveedor;
	}

	@Override
	public String toString() {
		return "direccionCorreo='" + direccionCorreo + '\'' + ", proveedor='" + proveedor + '\'' + '}';
	}
}