package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;

public interface IComercial {

	public  ArrayList<Incidencia> cargarIncidencias(Comercial aComercial);

	public void NuevaIncidencia(Incidencia aIncidencia);

	public void resolverIncidencia(Incidencia aIncidencia);

	public ArrayList<Cliente> cargarClientes();

	public void delCliente(Cliente aCliente);

	public void addCliente(Cliente aCliente);

	public void updateCliente(Cliente aCliente);

	public ArrayList<Factura> cargarFacturas(Cliente aCliente);
}