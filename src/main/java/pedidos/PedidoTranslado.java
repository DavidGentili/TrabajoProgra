package pedidos;

import clinica.Ambulancia;
import personas.Domicilio;

public class PedidoTranslado extends Pedido {

	public PedidoTranslado(String nombre, String apellido, int dni, Domicilio domicilio) {
		super(nombre, apellido,dni,domicilio);
	}

	@Override
	public void efectuaPedido() {
		this.a.solicitaTranslado();
	}
	
	

}
