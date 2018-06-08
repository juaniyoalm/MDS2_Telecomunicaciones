package com.example.telecomunicaciones;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;

public class ComercialNew_ModCliente extends V_ComercialNew_ModCliente{
	IAdministrador ad;
	
	public ComercialNew_ModCliente() {
		ad = new BD_Principal();
		Cliente cliente = ClienteDAO.createCliente();
		cliente.setApellido1("Juan");
		cliente.setApellido2("Clemente");
		cliente.setEmail("Juaniyo@hola.com");
		cliente.setNif("11111111D");
		cliente.setNombre("Juaclienteliente1");
		cliente.setTelefono("999999999");
		cliente.setPassword("1111");
		cliente.setAdministrador(ad.getAdmin());
		
		ad.addCliente(cliente);
	
	}
	
	public ComercialNew_ModCliente(com.example.telecomunicaciones.bd.orm.Cliente cliente) {
		ad = new BD_Principal();
		
		cliente.setApellido1("Perez");
		cliente.setApellido2("Clemente");
		cliente.setEmail("Juaniyo@hola.com");
		cliente.setNif("11111111D");
		cliente.setNombre("Juaclienteliente1");
		cliente.setTelefono("999999999");
		cliente.setPassword("1111");
		cliente.setAdministrador(ad.getAdmin());
		
		ad.updateCliente(cliente);;
	}
	
	private void inicializar() {

	}

}
