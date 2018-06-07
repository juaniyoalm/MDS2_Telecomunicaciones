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

public class MovilDAO {
	public static Movil loadMovilByORMID(int IDMovil) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadMovilByORMID(session, IDMovil);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil getMovilByORMID(int IDMovil) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getMovilByORMID(session, IDMovil);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByORMID(int IDMovil, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadMovilByORMID(session, IDMovil, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil getMovilByORMID(int IDMovil, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getMovilByORMID(session, IDMovil, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByORMID(PersistentSession session, int IDMovil) throws PersistentException {
		try {
			return (Movil) session.load(com.example.telecomunicaciones.bd.orm.Movil.class, new Integer(IDMovil));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil getMovilByORMID(PersistentSession session, int IDMovil) throws PersistentException {
		try {
			return (Movil) session.get(com.example.telecomunicaciones.bd.orm.Movil.class, new Integer(IDMovil));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByORMID(PersistentSession session, int IDMovil, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Movil) session.load(com.example.telecomunicaciones.bd.orm.Movil.class, new Integer(IDMovil), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil getMovilByORMID(PersistentSession session, int IDMovil, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Movil) session.get(com.example.telecomunicaciones.bd.orm.Movil.class, new Integer(IDMovil), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMovil(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryMovil(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMovil(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryMovil(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil[] listMovilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listMovilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil[] listMovilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listMovilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMovil(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Movil as Movil");
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
	
	public static List queryMovil(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Movil as Movil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Movil", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil[] listMovilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMovil(session, condition, orderBy);
			return (Movil[]) list.toArray(new Movil[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil[] listMovilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMovil(session, condition, orderBy, lockMode);
			return (Movil[]) list.toArray(new Movil[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadMovilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadMovilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Movil[] movils = listMovilByQuery(session, condition, orderBy);
		if (movils != null && movils.length > 0)
			return movils[0];
		else
			return null;
	}
	
	public static Movil loadMovilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Movil[] movils = listMovilByQuery(session, condition, orderBy, lockMode);
		if (movils != null && movils.length > 0)
			return movils[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMovilByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateMovilByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMovilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateMovilByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMovilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Movil as Movil");
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
	
	public static java.util.Iterator iterateMovilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Movil as Movil");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Movil", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil createMovil() {
		return new com.example.telecomunicaciones.bd.orm.Movil();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Movil movil) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(movil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Movil movil) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(movil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Movil movil)throws PersistentException {
		try {
			if (movil.getServicio() != null) {
				movil.getServicio().setMovil(null);
			}
			
			return delete(movil);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Movil movil, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (movil.getServicio() != null) {
				movil.getServicio().setMovil(null);
			}
			
			try {
				session.delete(movil);
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
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Movil movil) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(movil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Movil movil) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(movil);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Movil loadMovilByCriteria(MovilCriteria movilCriteria) {
		Movil[] movils = listMovilByCriteria(movilCriteria);
		if(movils == null || movils.length == 0) {
			return null;
		}
		return movils[0];
	}
	
	public static Movil[] listMovilByCriteria(MovilCriteria movilCriteria) {
		return movilCriteria.listMovil();
	}
}
