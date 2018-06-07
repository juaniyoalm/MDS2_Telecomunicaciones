package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Servicio;

public interface ICibernauta {

	public default void iniciarSesion(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> consultarServicioPortada() {
		throw new UnsupportedOperationException();
	}

	public default void teLlamamos(String aNombre, String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarOfertasFijo() {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarOfertasFibra() {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarOfertasMovil() {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarOfertasTV() {
		throw new UnsupportedOperationException();
	}

	public default ArrayList<Servicio> cargarOfertasCombi() {
		throw new UnsupportedOperationException();
	}

	public default void restorePassword(String aEmail) {
		throw new UnsupportedOperationException();
	}
}