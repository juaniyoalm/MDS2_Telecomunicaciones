package com.example.telecomunicaciones.bd;

import java.util.ArrayList;
import java.util.Vector;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Factura;

public class BD_Factura {
	public Vector<Factura> _contiene_factura = new Vector<Factura>();

	public ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}
}