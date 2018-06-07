package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.Servicio;

public interface ICliente {

	public  void bajaCliente(Cliente aCliente);

	public  void modificarDatosCliente(Cliente aCliente);

	public  ArrayList<Incidencia> cargarIncidencias(Cliente aCliente);

	public  ArrayList<Factura> cargarFacturas(Cliente aCliente);

	public  boolean nuevaIncidencia(Incidencia aIncidencia);

	public  ArrayList<Servicio> cargarContratos(Cliente aCliente);

	public  void teLlamamos(Cliente aCliente);
}