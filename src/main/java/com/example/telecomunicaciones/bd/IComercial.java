package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;

public interface IComercial {

	public default ArrayList<Incidencia> cargarIncidencias(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public default void NuevaIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public default void resolverIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Cliente> cargarClientes() {
		throw new UnsupportedOperationException();
	}

	public default void delCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default void addCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default void updateCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}