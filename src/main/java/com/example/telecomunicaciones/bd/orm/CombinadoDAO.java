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

public class CombinadoDAO {
	public static Combinado loadCombinadoByORMID(int IDCombinado) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadCombinadoByORMID(session, IDCombinado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado getCombinadoByORMID(int IDCombinado) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getCombinadoByORMID(session, IDCombinado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByORMID(int IDCombinado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadCombinadoByORMID(session, IDCombinado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado getCombinadoByORMID(int IDCombinado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getCombinadoByORMID(session, IDCombinado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByORMID(PersistentSession session, int IDCombinado) throws PersistentException {
		try {
			return (Combinado) session.load(com.example.telecomunicaciones.bd.orm.Combinado.class, new Integer(IDCombinado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado getCombinadoByORMID(PersistentSession session, int IDCombinado) throws PersistentException {
		try {
			return (Combinado) session.get(com.example.telecomunicaciones.bd.orm.Combinado.class, new Integer(IDCombinado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByORMID(PersistentSession session, int IDCombinado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Combinado) session.load(com.example.telecomunicaciones.bd.orm.Combinado.class, new Integer(IDCombinado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado getCombinadoByORMID(PersistentSession session, int IDCombinado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Combinado) session.get(com.example.telecomunicaciones.bd.orm.Combinado.class, new Integer(IDCombinado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCombinado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryCombinado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCombinado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryCombinado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado[] listCombinadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listCombinadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado[] listCombinadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listCombinadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCombinado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Combinado as Combinado");
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
	
	public static List queryCombinado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Combinado as Combinado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Combinado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado[] listCombinadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCombinado(session, condition, orderBy);
			return (Combinado[]) list.toArray(new Combinado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado[] listCombinadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCombinado(session, condition, orderBy, lockMode);
			return (Combinado[]) list.toArray(new Combinado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadCombinadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadCombinadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Combinado[] combinados = listCombinadoByQuery(session, condition, orderBy);
		if (combinados != null && combinados.length > 0)
			return combinados[0];
		else
			return null;
	}
	
	public static Combinado loadCombinadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Combinado[] combinados = listCombinadoByQuery(session, condition, orderBy, lockMode);
		if (combinados != null && combinados.length > 0)
			return combinados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCombinadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateCombinadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCombinadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateCombinadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCombinadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Combinado as Combinado");
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
	
	public static java.util.Iterator iterateCombinadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Combinado as Combinado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Combinado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado createCombinado() {
		return new com.example.telecomunicaciones.bd.orm.Combinado();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Combinado combinado) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(combinado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Combinado combinado) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(combinado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Combinado combinado)throws PersistentException {
		try {
			com.example.telecomunicaciones.bd.orm.Servicio[] lServicios = combinado.servicio.toArray();
			for(int i = 0; i < lServicios.length; i++) {
				lServicios[i].combinado.remove(combinado);
			}
			return delete(combinado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Combinado combinado, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.example.telecomunicaciones.bd.orm.Servicio[] lServicios = combinado.servicio.toArray();
			for(int i = 0; i < lServicios.length; i++) {
				lServicios[i].combinado.remove(combinado);
			}
			try {
				session.delete(combinado);
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
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Combinado combinado) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(combinado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Combinado combinado) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(combinado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Combinado loadCombinadoByCriteria(CombinadoCriteria combinadoCriteria) {
		Combinado[] combinados = listCombinadoByCriteria(combinadoCriteria);
		if(combinados == null || combinados.length == 0) {
			return null;
		}
		return combinados[0];
	}
	
	public static Combinado[] listCombinadoByCriteria(CombinadoCriteria combinadoCriteria) {
		return combinadoCriteria.listCombinado();
	}
}
