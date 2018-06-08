package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.example.telecomunicaciones.bd.orm.Administrador;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.Servicio;

public interface IAdministrador{

	public  ArrayList<Comercial> cargarComerciales();
	
	public  void delComercial(Comercial aComercial);

	public  void addComercial(Comercial aComercial);
	
	public  void updateComercial(Comercial aComercial);

	public  ArrayList<Cliente> cargarClientes();

	public  void delCliente(Cliente aCliente);

	public  void addCliente(Cliente aCliente);

	public  void updateCliente(Cliente aCliente);

	public  ArrayList<Incidencia> cargarIncidencias();

	public  void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial);

	public  ArrayList<Servicio> cargarServicios();

	public  void addServicio(Servicio aServicio);

	public  void modificarServicio(Servicio aServicio);
	
	public  void delServicio(Servicio aServicio);
	
	public  void updateServiciosPortada(ArrayList<Servicio> aServiciosPortada);
	
	public  ArrayList<Servicio> cargarServiciosPortada();
	
	public  ArrayList<Factura> cargarFacturas(Cliente aCliente);
	
	public Administrador getAdmin();
}