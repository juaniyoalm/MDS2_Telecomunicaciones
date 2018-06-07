package com.example.telecomunicaciones.bd;

import java.io.Serializable;
import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.ComercialDAO;
import com.example.telecomunicaciones.bd.orm.Factura;
import com.example.telecomunicaciones.bd.orm.FacturaDAO;
import com.example.telecomunicaciones.bd.orm.Incidencia;
import com.example.telecomunicaciones.bd.orm.IncidenciaDAO;
import com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager;
import com.example.telecomunicaciones.bd.orm.Servicio;
import com.example.telecomunicaciones.bd.orm.ServicioDAO;

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
	
	@Override
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
	
	@Override
	public void delComercial(Comercial aComercial) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ComercialDAO.delete(aComercial);
			t.commit();
			System.out.println("Comercial eliminado con el nombre de " + aComercial.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Comercial no eliminado");
			e.printStackTrace();
		}
	}
	
	@Override
	public void addComercial(Comercial aComercial) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ComercialDAO.save(aComercial);
			t.commit();
			System.out.println("Comercial añadido con el nombre de " + aComercial.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Comercial no añadido");
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateComercial(Comercial aComercial) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Incidencia> cargarIncidencias() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Servicio> cargarServicios() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addServicio(Servicio aServicio) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modificarServicio(Servicio aServicio) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delServicio(Servicio aServicio) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateServiciosPortada(ArrayList<Servicio> aServiciosPortada) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Servicio> cargarServiciosPortada() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Incidencia> cargarIncidencias(Comercial aComercial) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void NuevaIncidencia(Incidencia aIncidencia) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resolverIncidencia(Incidencia aIncidencia) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
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
	
	@Override
	public void delCliente(Cliente aCliente) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ClienteDAO.delete(aCliente);
			t.commit();
			System.out.println("Comercial eliminado con el nombre de " + aCliente.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Comercial no eliminado");
			e.printStackTrace();
		}
	}
	
	@Override
	public void addCliente(Cliente aCliente) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ClienteDAO.save(aCliente);
			t.commit();
			System.out.println("Cliente añadido con el nombre de " + aCliente.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Cliente no añadido");
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateCliente(Cliente aCliente) {
		// Incidencia que crea el cliente para modificar datos
		
	}
	
	@Override
	public void bajaCliente(Cliente aCliente) {
		// Solicita una incidencia de baja
		
	}
	@Override
	public void modificarDatosCliente(Cliente aCliente) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
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
	
	@Override
	public ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		Factura[] in;
		
		try {
			in = FacturaDAO.listFacturaByQuery("ClienteIDCliente = " + aCliente.getIDCliente(), "ID");
			System.out.println("La consulta se ha realizado");
			ArrayList<Factura> facturas = new ArrayList<>();
			
			for (int i = 0; i < in.length; i++) {
				facturas.add(in[i]);
			}
			
			return facturas;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean nuevaIncidencia(Incidencia aIncidencia) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ArrayList<Servicio> cargarContratos(Cliente aCliente) {
		Servicio[] in;

		in = aCliente.getServicios();
		System.out.println("La consulta se ha realizado");
		ArrayList<Servicio> servicios = new ArrayList<>();
		
		for (int i = 0; i < in.length; i++) {
			servicios.add(in[i]);
		}
		
		return servicios;
	}
	
	@Override
	public void teLlamamos(Cliente aCliente) {
		// TODO Auto-generated method stub
		
	}
}