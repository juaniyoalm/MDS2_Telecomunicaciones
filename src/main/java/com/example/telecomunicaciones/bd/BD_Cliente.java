package com.example.telecomunicaciones.bd;

import java.util.ArrayList;
import java.util.Vector;
import com.example.telecomunicaciones.bd.orm.Cliente;

public class BD_Cliente {
	public Vector<Cliente> _contiene_cliente = new Vector<Cliente>();

	public boolean verificarSesion(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void accesoCliente(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cliente> cargarClientes() {
		throw new UnsupportedOperationException();
	}

	public void delCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void addCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void updateComercial(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public Cliente IsThereAnEmail(String aEmail) {
		throw new UnsupportedOperationException();
	}
}