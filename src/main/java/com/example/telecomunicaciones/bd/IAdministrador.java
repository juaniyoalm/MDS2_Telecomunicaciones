package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.Servicio;

public interface IAdministrador {

	public default ArrayList<Comercial> cargarComerciales() {
		throw new UnsupportedOperationException();
	}

	public default void delComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public default void addComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public default void updateComercial(Comercial aComercial) {
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

	public default ArrayList<Incidencia> cargarIncidencias() {
		throw new UnsupportedOperationException();
	}

	public default void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarServicios() {
		throw new UnsupportedOperationException();
	}

	public default void addServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public default void modificarServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public default void delServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public default void updateServiciosPortada(ArrayList<Servicio> aServiciosPortada) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarServiciosPortada() {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}