package com.example.telecomunicaciones.bd;

import java.io.Serializable;
import java.security.acl.Acl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ComercialDAO.save(aComercial);
			t.commit();
			System.out.println("Comercial actualizado con el nombre de " + aComercial.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Comercial no actualizado");
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<Incidencia> cargarIncidencias() {
		Incidencia[] c;
		
		try {
			c = IncidenciaDAO.listIncidenciaByQuery("ID > 0", "ID");
			System.out.println("La consulta se ha realizado");
			
			ArrayList<Incidencia> inicidencias = new ArrayList<>();
			
			for (int i = 0; i < c.length; i++) {
				inicidencias.add(c[i]);
			}
			
			return inicidencias;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		aComercial.incidencia.add(aIncidencia);
		updateComercial(aComercial);
	}
	
	@Override
	public ArrayList<Servicio> cargarServicios() {
		Servicio[] c;
		
		try {
			c = ServicioDAO.listServicioByQuery("ID > 0", "ID");
			System.out.println("La consulta se ha realizado");
			
			ArrayList<Servicio> servicios = new ArrayList<>();
			
			for (int i = 0; i < c.length; i++) {
				servicios.add(c[i]);
			}
			
			return servicios;
			
		} catch (PersistentException e) {
			System.out.println("La consulta ha fallado");
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public void addServicio(Servicio aServicio) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ServicioDAO.save(aServicio);
			t.commit();
			System.out.println("Servicio añadido");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Servicio no añadido");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void modificarServicio(Servicio aServicio) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ServicioDAO.save(aServicio);
			t.commit();
			System.out.println("Servicio modificado");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Servicio no modificado");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delServicio(Servicio aServicio) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ServicioDAO.delete(aServicio);
			t.commit();
			System.out.println("Servicio eliminado");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Servicio no eliminado");
			e.printStackTrace();
		}
		
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
		Incidencia[] aux = aComercial.incidencia.toArray();
		ArrayList<Incidencia> inc = null;
		
		for (int i = 0; i < aux.length; i++) {
			inc.add(aux[i]);
		}
		return inc;
	}
	
	@Override
	public void NuevaIncidencia(Incidencia aIncidencia) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.save(aIncidencia);
			t.commit();
			System.out.println("Incidencia añadida");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Incidencia no añadida");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void resolverIncidencia(Incidencia aIncidencia) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.delete(aIncidencia);
			t.commit();
			System.out.println("Incidencia resuelta");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Incidencia no resuelta");
			e.printStackTrace();
		}
		
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
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = ClienteDAO.save(aCliente);
			t.commit();
			System.out.println("Cliente modificado con el nombre de " + aCliente.getNombre());
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Cliente no modificado");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void bajaCliente(Cliente aCliente) {
		Date fecha = new Date();
		
		Incidencia incidencia = IncidenciaDAO.createIncidencia();
		incidencia.setCliente(aCliente);
		incidencia.setCorreoCliente(aCliente.getEmail());
		incidencia.setAsunto("Baja");
		incidencia.setTipoIncidencia("Baja");
		incidencia.setEstado("Sin Asignar");
		incidencia.setFecha(fecha);
		incidencia.setDescripcion("El cliente" + aCliente.getNombre()+ " con DNI " + aCliente.getNif() + " solicita la baja del servicio.");
		
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.save(incidencia);
			t.commit();
			System.out.println("Incidencia de baja creada");
		} catch (PersistentException e) {
			System.out.println("Incidencia de baja no creada");
			e.printStackTrace();
		}
	}
	
	@Override
	public void modificarDatosCliente(Cliente aCliente) {
		Date fecha = new Date();
		
		Incidencia incidencia = IncidenciaDAO.createIncidencia();
		incidencia.setCliente(aCliente);
		incidencia.setCorreoCliente(aCliente.getEmail());
		incidencia.setAsunto("Modificar Datos");
		incidencia.setTipoIncidencia("Modificar");
		incidencia.setEstado("Sin Asignar");
		incidencia.setFecha(fecha);
		incidencia.setDescripcion("El cliente" + aCliente.getNombre()+ " con DNI " + aCliente.getNif() + " solicita la modificación de los siguientes datos:\n"
				+ "Apellido 1: " + aCliente.getApellido1()
				+ "\nApellido 2: " + aCliente.getApellido2()
				+ "\nNombre: " + aCliente.getNombre()
				+ "\nDNI: " + aCliente.getNif()
				+ "\nEmail: " + aCliente.getEmail());
		
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.save(incidencia);
			t.commit();
			System.out.println("Incidencia de baja creada");
		} catch (PersistentException e) {
			System.out.println("Incidencia de baja no creada");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
		Incidencia[] in;
			
		in = aCliente.incidencia.toArray();
		System.out.println("La consulta se ha realizado");
		ArrayList<Incidencia> incidencias = new ArrayList<>();
		
		for (int i = 0; i < in.length; i++) {
			incidencias.add(in[i]);
		}
		
		return incidencias;

	}
	
	@Override
	public ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		Factura[] in;
		
		in = aCliente.factura.toArray();
		System.out.println("La consulta se ha realizado");
		ArrayList<Factura> facturas = new ArrayList<>();
			
		for (int i = 0; i < in.length; i++) {
			facturas.add(in[i]);
		}
			
		return facturas;
	}
	
	@Override
	public boolean nuevaIncidencia(Incidencia aIncidencia) {
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.save(aIncidencia);
			t.commit();
			System.out.println("Incidencia añadida");
			MDS2diagramasPersistentManager.instance().disposePersistentManager();
		} catch (PersistentException e) {
			System.out.println("Incidencia no añadida");
			e.printStackTrace();
		}
		
		return res;
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
		Date fecha = new Date();
		
		Incidencia incidencia = IncidenciaDAO.createIncidencia();
		incidencia.setCliente(aCliente);
		incidencia.setCorreoCliente(aCliente.getEmail());
		incidencia.setAsunto("Llamada");
		incidencia.setTipoIncidencia("Llamada");
		incidencia.setEstado("Sin Asignar");
		incidencia.setFecha(fecha);
		incidencia.setDescripcion("El cliente" + aCliente.getNombre()+ " con DNI " + aCliente.getNif() + " solicita que le llamemos al telefono " + aCliente.getTelefono());
		
		PersistentTransaction t;
		boolean res = false;
		
		try {
			t = MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
			res = IncidenciaDAO.save(incidencia);
			t.commit();
			System.out.println("Incidencia de llamada creada");
		} catch (PersistentException e) {
			System.out.println("Incidencia de llamada no creada");
			e.printStackTrace();
		}
		
	}
}