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

public class Incidencia_administradDAO {
	public static Incidencia_administrad loadIncidencia_administradByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadIncidencia_administradByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad getIncidencia_administradByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getIncidencia_administradByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadIncidencia_administradByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad getIncidencia_administradByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getIncidencia_administradByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia_administrad) session.load(com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad getIncidencia_administradByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Incidencia_administrad) session.get(com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia_administrad) session.load(com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad getIncidencia_administradByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia_administrad) session.get(com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryIncidencia_administrad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryIncidencia_administrad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad[] listIncidencia_administradByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listIncidencia_administradByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad[] listIncidencia_administradByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listIncidencia_administradByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia_administrad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Incidencia_administrad as Incidencia_administrad");
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
	
	public static List queryIncidencia_administrad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Incidencia_administrad as Incidencia_administrad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia_administrad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad[] listIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIncidencia_administrad(session, condition, orderBy);
			return (Incidencia_administrad[]) list.toArray(new Incidencia_administrad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad[] listIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIncidencia_administrad(session, condition, orderBy, lockMode);
			return (Incidencia_administrad[]) list.toArray(new Incidencia_administrad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadIncidencia_administradByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadIncidencia_administradByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Incidencia_administrad[] incidencia_administrads = listIncidencia_administradByQuery(session, condition, orderBy);
		if (incidencia_administrads != null && incidencia_administrads.length > 0)
			return incidencia_administrads[0];
		else
			return null;
	}
	
	public static Incidencia_administrad loadIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Incidencia_administrad[] incidencia_administrads = listIncidencia_administradByQuery(session, condition, orderBy, lockMode);
		if (incidencia_administrads != null && incidencia_administrads.length > 0)
			return incidencia_administrads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIncidencia_administradByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateIncidencia_administradByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidencia_administradByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateIncidencia_administradByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Incidencia_administrad as Incidencia_administrad");
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
	
	public static java.util.Iterator iterateIncidencia_administradByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Incidencia_administrad as Incidencia_administrad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia_administrad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad createIncidencia_administrad() {
		return new com.example.telecomunicaciones.bd.orm.Incidencia_administrad();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(incidencia_administrad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(incidencia_administrad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad)throws PersistentException {
		try {
			if (incidencia_administrad.getAdministrador() != null) {
				incidencia_administrad.getAdministrador().incidencia_administrad.remove(incidencia_administrad);
			}
			
			if (incidencia_administrad.getComercial() != null) {
				incidencia_administrad.getComercial().incidencia.remove(incidencia_administrad);
			}
			
			if (incidencia_administrad.getCliente() != null) {
				incidencia_administrad.getCliente().incidencia.remove(incidencia_administrad);
			}
			
			return delete(incidencia_administrad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (incidencia_administrad.getAdministrador() != null) {
				incidencia_administrad.getAdministrador().incidencia_administrad.remove(incidencia_administrad);
			}
			
			if (incidencia_administrad.getComercial() != null) {
				incidencia_administrad.getComercial().incidencia.remove(incidencia_administrad);
			}
			
			if (incidencia_administrad.getCliente() != null) {
				incidencia_administrad.getCliente().incidencia.remove(incidencia_administrad);
			}
			
			try {
				session.delete(incidencia_administrad);
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
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(incidencia_administrad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Incidencia_administrad incidencia_administrad) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(incidencia_administrad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia_administrad loadIncidencia_administradByCriteria(Incidencia_administradCriteria incidencia_administradCriteria) {
		Incidencia_administrad[] incidencia_administrads = listIncidencia_administradByCriteria(incidencia_administradCriteria);
		if(incidencia_administrads == null || incidencia_administrads.length == 0) {
			return null;
		}
		return incidencia_administrads[0];
	}
	
	public static Incidencia_administrad[] listIncidencia_administradByCriteria(Incidencia_administradCriteria incidencia_administradCriteria) {
		return incidencia_administradCriteria.listIncidencia_administrad();
	}
}
