/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ClienteDAO {
	public static Cliente loadClienteByORMID(int IDCliente) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadClienteByORMID(session, IDCliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(int IDCliente) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getClienteByORMID(session, IDCliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(int IDCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadClienteByORMID(session, IDCliente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(int IDCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getClienteByORMID(session, IDCliente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, int IDCliente) throws PersistentException {
		try {
			return (Cliente) session.load(com.example.telecomunicaciones.bd.orm.Cliente.class, new Integer(IDCliente));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, int IDCliente) throws PersistentException {
		try {
			return (Cliente) session.get(com.example.telecomunicaciones.bd.orm.Cliente.class, new Integer(IDCliente));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByORMID(PersistentSession session, int IDCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cliente) session.load(com.example.telecomunicaciones.bd.orm.Cliente.class, new Integer(IDCliente), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente getClienteByORMID(PersistentSession session, int IDCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cliente) session.get(com.example.telecomunicaciones.bd.orm.Cliente.class, new Integer(IDCliente), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCliente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy, lockMode);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy, lockMode);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Cliente as Cliente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cliente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente createCliente() {
		return new com.example.telecomunicaciones.bd.orm.Cliente();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Cliente cliente) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Cliente cliente) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Cliente cliente)throws PersistentException {
		try {
			if (cliente.getAdministrador() != null) {
				cliente.getAdministrador().cliente.remove(cliente);
			}
			
			com.example.telecomunicaciones.bd.orm.Contrato[] lContratoss = cliente.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Factura[] lFacturas = cliente.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Incidencia[] lIncidencias = cliente.incidencia.toArray();
			for(int i = 0; i < lIncidencias.length; i++) {
				lIncidencias[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Comercial[] lComercials = cliente.comercial.toArray();
			for(int i = 0; i < lComercials.length; i++) {
				lComercials[i].cliente.remove(cliente);
			}
			return delete(cliente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Cliente cliente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cliente.getAdministrador() != null) {
				cliente.getAdministrador().cliente.remove(cliente);
			}
			
			com.example.telecomunicaciones.bd.orm.Contrato[] lContratoss = cliente.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Factura[] lFacturas = cliente.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Incidencia[] lIncidencias = cliente.incidencia.toArray();
			for(int i = 0; i < lIncidencias.length; i++) {
				lIncidencias[i].setCliente(null);
			}
			com.example.telecomunicaciones.bd.orm.Comercial[] lComercials = cliente.comercial.toArray();
			for(int i = 0; i < lComercials.length; i++) {
				lComercials[i].cliente.remove(cliente);
			}
			try {
				session.delete(cliente);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Cliente cliente) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Cliente cliente) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(cliente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cliente loadClienteByCriteria(ClienteCriteria clienteCriteria) {
		Cliente[] clientes = listClienteByCriteria(clienteCriteria);
		if(clientes == null || clientes.length == 0) {
			return null;
		}
		return clientes[0];
	}
	
	public static Cliente[] listClienteByCriteria(ClienteCriteria clienteCriteria) {
		return clienteCriteria.listCliente();
	}
}
