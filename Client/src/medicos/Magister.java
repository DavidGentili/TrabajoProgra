package medicos;

public class Magister extends DecoratorMedico {

	public Magister(IMedico encapsulado) {
		super(encapsulado);
	}


	public double getHonorario() {
		return this.encapsulado.getHonorario() * 1.05;
	}

}
