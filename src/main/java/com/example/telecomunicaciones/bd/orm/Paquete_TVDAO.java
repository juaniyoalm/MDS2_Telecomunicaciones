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

public class Paquete_TVDAO {
	public static Paquete_TV loadPaquete_TVByORMID(int IDPaquete) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadPaquete_TVByORMID(session, IDPaquete);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV getPaquete_TVByORMID(int IDPaquete) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getPaquete_TVByORMID(session, IDPaquete);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByORMID(int IDPaquete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadPaquete_TVByORMID(session, IDPaquete, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV getPaquete_TVByORMID(int IDPaquete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getPaquete_TVByORMID(session, IDPaquete, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByORMID(PersistentSession session, int IDPaquete) throws PersistentException {
		try {
			return (Paquete_TV) session.load(com.example.telecomunicaciones.bd.orm.Paquete_TV.class, new Integer(IDPaquete));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV getPaquete_TVByORMID(PersistentSession session, int IDPaquete) throws PersistentException {
		try {
			return (Paquete_TV) session.get(com.example.telecomunicaciones.bd.orm.Paquete_TV.class, new Integer(IDPaquete));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByORMID(PersistentSession session, int IDPaquete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paquete_TV) session.load(com.example.telecomunicaciones.bd.orm.Paquete_TV.class, new Integer(IDPaquete), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV getPaquete_TVByORMID(PersistentSession session, int IDPaquete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paquete_TV) session.get(com.example.telecomunicaciones.bd.orm.Paquete_TV.class, new Integer(IDPaquete), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete_TV(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryPaquete_TV(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete_TV(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryPaquete_TV(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV[] listPaquete_TVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listPaquete_TVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV[] listPaquete_TVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listPaquete_TVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaquete_TV(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Paquete_TV as Paquete_TV");
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
	
	public static List queryPaquete_TV(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Paquete_TV as Paquete_TV");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paquete_TV", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV[] listPaquete_TVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaquete_TV(session, condition, orderBy);
			return (Paquete_TV[]) list.toArray(new Paquete_TV[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV[] listPaquete_TVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaquete_TV(session, condition, orderBy, lockMode);
			return (Paquete_TV[]) list.toArray(new Paquete_TV[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadPaquete_TVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadPaquete_TVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paquete_TV[] paquete_TVs = listPaquete_TVByQuery(session, condition, orderBy);
		if (paquete_TVs != null && paquete_TVs.length > 0)
			return paquete_TVs[0];
		else
			return null;
	}
	
	public static Paquete_TV loadPaquete_TVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paquete_TV[] paquete_TVs = listPaquete_TVByQuery(session, condition, orderBy, lockMode);
		if (paquete_TVs != null && paquete_TVs.length > 0)
			return paquete_TVs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaquete_TVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iteratePaquete_TVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaquete_TVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iteratePaquete_TVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaquete_TVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Paquete_TV as Paquete_TV");
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
	
	public static java.util.Iterator iteratePaquete_TVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Paquete_TV as Paquete_TV");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paquete_TV", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV createPaquete_TV() {
		return new com.example.telecomunicaciones.bd.orm.Paquete_TV();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(paquete_TV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(paquete_TV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV)throws PersistentException {
		try {
			com.example.telecomunicaciones.bd.orm.Canal[] lCanals = paquete_TV.canal.toArray();
			for(int i = 0; i < lCanals.length; i++) {
				lCanals[i].paquete_TV.remove(paquete_TV);
			}
			if (paquete_TV.getServicio() != null) {
				paquete_TV.getServicio().setPaquete_TV(null);
			}
			
			return delete(paquete_TV);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.example.telecomunicaciones.bd.orm.Canal[] lCanals = paquete_TV.canal.toArray();
			for(int i = 0; i < lCanals.length; i++) {
				lCanals[i].paquete_TV.remove(paquete_TV);
			}
			if (paquete_TV.getServicio() != null) {
				paquete_TV.getServicio().setPaquete_TV(null);
			}
			
			try {
				session.delete(paquete_TV);
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
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(paquete_TV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(paquete_TV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paquete_TV loadPaquete_TVByCriteria(Paquete_TVCriteria paquete_TVCriteria) {
		Paquete_TV[] paquete_TVs = listPaquete_TVByCriteria(paquete_TVCriteria);
		if(paquete_TVs == null || paquete_TVs.length == 0) {
			return null;
		}
		return paquete_TVs[0];
	}
	
	public static Paquete_TV[] listPaquete_TVByCriteria(Paquete_TVCriteria paquete_TVCriteria) {
		return paquete_TVCriteria.listPaquete_TV();
	}
}
