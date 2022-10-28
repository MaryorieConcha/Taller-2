public class Chasis {
	private int numeroChasis;
	private String tipoMaterial;

	public Automoviles auto;

	public Chasis(int numeroChasis, String tipoMaterial) {
		this.numeroChasis = numeroChasis;
		this.tipoMaterial = tipoMaterial;
	}

	public int getNumeroChasis() {
		return this.numeroChasis;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}
}