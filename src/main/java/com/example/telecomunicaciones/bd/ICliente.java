package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.Servicio;

public interface ICliente {

	public default void bajaCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default void modificarDatosCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default boolean nuevaIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarContratos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public default void teLlamamos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}