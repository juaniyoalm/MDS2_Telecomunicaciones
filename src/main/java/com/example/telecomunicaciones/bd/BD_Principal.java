package com.example.telecomunicaciones.bd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.ComercialDAO;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.IncidenciaDAO;
import com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager;
import com.example.telecomunicaciones.bd.orm.Servicio;

public class BD_Principal implements ICibernauta, ICliente, IComercial, IAdministrador, Serializable {
	public BD_Oferta _bd_oferta;
	public BD_Movil _bd_movil;
	public BD_Paquete_TV _bd_paquete;
	public BD_Canal _bd_canal;
	public BD_Factura _bd_factura;
	public BD_Cliente _bd_cliente;
	public BD_Comercial _bd_comercial;
	public BD_Administrador _bd_administrador;
	public BD_Incidencia_administrador _bd_incidencia_admin;

	public void iniciarSesion(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> consultarServicioPortada() {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(String aNombre, String aTelefono) {
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

	public void restorePassword(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void bajaCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatosCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}


	public ArrayList<Servicio> cargarContratos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void resolverIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cliente> cargarClientes() {
		
		Cliente[] c;
		
		try {
			c = ClienteDAO.listClienteByQuery("IDCliente > 0", "IDCliente");
			System.out.println("La consulta se ha realizado");
			
			ArrayList<Cliente> clientes = new ArrayList<>();
			
			for (int i = 0; i < c.length; i++) {
				clientes.add(c[i]);
			}
			
			return clientes;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		
		return null;
	}

	public void delCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void addCliente(Cliente aCliente) {
		PersistentTransaction t;
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			ClienteDAO.save(aCliente);
			t.commit();
			System.out.println("Cliente añadido con el nombre de " + aCliente.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Cliente no añadido");
			e.printStackTrace();
		}
	}

	public void updateCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Comercial> cargarComerciales() {
		Comercial[] c;
		
		try {
			c = ComercialDAO.listComercialByQuery("IDComercial > 0", "IDComercial");
			System.out.println("La consulta se ha realizado");
			
			ArrayList<Comercial> comerciales = new ArrayList<>();
			
			for (int i = 0; i < c.length; i++) {
				comerciales.add(c[i]);
			}
			
			return comerciales;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		
		return null;
	}

	public void delComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void addComercial(Comercial aComercial) {
		PersistentTransaction t;
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			ComercialDAO.save(aComercial);
			t.commit();
			System.out.println("Comercial añadido con el nombre de " + aComercial.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Comercial no añadido");
			e.printStackTrace();
		}
	}

	public void updateComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias() {
		Incidencia[] in;
		
		try {
			in = IncidenciaDAO.listIncidenciaByQuery("ID > 0", "ID");
			System.out.println("La consulta se ha realizado");
			
			ArrayList<Incidencia> incidencias = new ArrayList<>();
			
			for (int i = 0; i < in.length; i++) {
				incidencias.add(in[i]);
			}
			
			return incidencias;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		
		return null;
	}

	public void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarServicios() {
		throw new UnsupportedOperationException();
	}

	public void addServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void modificarServicio(Servicio aServicio) {
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

	public boolean nuevaIncidencia(Incidencia aIncidencia) {
		return ICliente.super.nuevaIncidencia(aIncidencia);
	}
	
	public void NuevaIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}
}