package com.example.telecomunicaciones.bd;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.orm.Administrador;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.Servicio;

public interface ICibernauta {

	public  int iniciarSesion(String aEmail, String aPassword);
	public  Cliente iniciarCliente(String aEmail, String aPassword);
	public  Comercial iniciarComercial(String aEmail, String aPassword);
	public  Administrador iniciarAdmin(String aEmail, String aPassword);
	public  ArrayList<Servicio> consultarServicioPortada();
	public  void teLlamamos(String aNombre, String aTelefono);
	public  ArrayList<Servicio> cargarOfertasFijo();
	public  ArrayList<Servicio> cargarOfertasFibra();
	public  ArrayList<Servicio> cargarOfertasMovil();
	public  ArrayList<Servicio> cargarOfertasTV();
	public  ArrayList<Servicio> cargarOfertasCombi();
	public  void restorePassword(String aEmail);
}