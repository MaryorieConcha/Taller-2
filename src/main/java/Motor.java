public class Motor {
	private int numeroMotor;
	private int centimetrosCubicos;

	public Automoviles auto;

	public Motor(int numeroMotor, int centimetrosCubicos) {
		this.numeroMotor = numeroMotor;
		this.centimetrosCubicos = centimetrosCubicos;
	}

	public int getNumeroMotor() {
		return this.numeroMotor;
	}

	public int getCentimetrosCubicos() {
		return this.centimetrosCubicos;
	}

	@Override
	public String toString() {
		return "Motor{" + "numeroMotor=" + numeroMotor + ", centimetrosCubicos=" + centimetrosCubicos + '}';
	}
}