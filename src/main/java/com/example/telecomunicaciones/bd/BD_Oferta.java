package com.example.telecomunicaciones.bd;

import java.util.ArrayList;
import java.util.Vector;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Combinado;
import com.example.telecomunicaciones.bd.orm.Servicio;

public class BD_Oferta {
	public Vector<Combinado> _contiene_combinado = new Vector<Combinado>();

	public ArrayList<Servicio> cargarServicios() {
		throw new UnsupportedOperationException();
	}

	public void addServicioOferta(Combinado aOferta) {
		throw new UnsupportedOperationException();
	}

	public void addServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarServicios(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void updateServicioOferta(Combinado aOferta) {
		throw new UnsupportedOperationException();
	}

	public void updateServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void delServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void updateServiciosPortada(ArrayList<Servicio> aServiciosPortada) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarServiciosPortada() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasFijo() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasFibra() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasMovil() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasTV() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasCombi() {
		throw new UnsupportedOperationException();
	}
}