package com.example.telecomunicaciones.bd;

import java.util.ArrayList;
import java.util.Vector;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.Incidencia_administrad;

public class BD_Incidencia_administrador {
	public Vector<Incidencia_administrad> _contiene_incidencia_administrador = new Vector<Incidencia_administrad>();

	public void bajaCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatosCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean nuevaIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias() {
		throw new UnsupportedOperationException();
	}

	public void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void resolverIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(String aNombre, String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void restorePassword(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}