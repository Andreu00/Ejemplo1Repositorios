package modelo;

public class clientes {
	int idCliente;
	String nombreCliente;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	@Override
	public String toString() {
		return "clientes [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + "]";
	}
	
	
}
