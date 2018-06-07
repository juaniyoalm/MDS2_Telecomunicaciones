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

public class ContratoDAO {
	public static Contrato loadContratoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadContratoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato getContratoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getContratoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadContratoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato getContratoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getContratoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Contrato) session.load(com.example.telecomunicaciones.bd.orm.Contrato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato getContratoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Contrato) session.get(com.example.telecomunicaciones.bd.orm.Contrato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contrato) session.load(com.example.telecomunicaciones.bd.orm.Contrato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato getContratoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contrato) session.get(com.example.telecomunicaciones.bd.orm.Contrato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContrato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryContrato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContrato(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryContrato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato[] listContratoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listContratoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato[] listContratoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listContratoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContrato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Contrato as Contrato");
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
	
	public static List queryContrato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Contrato as Contrato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contrato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato[] listContratoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContrato(session, condition, orderBy);
			return (Contrato[]) list.toArray(new Contrato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato[] listContratoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContrato(session, condition, orderBy, lockMode);
			return (Contrato[]) list.toArray(new Contrato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadContratoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadContratoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contrato[] contratos = listContratoByQuery(session, condition, orderBy);
		if (contratos != null && contratos.length > 0)
			return contratos[0];
		else
			return null;
	}
	
	public static Contrato loadContratoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contrato[] contratos = listContratoByQuery(session, condition, orderBy, lockMode);
		if (contratos != null && contratos.length > 0)
			return contratos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContratoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateContratoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContratoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateContratoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContratoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Contrato as Contrato");
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
	
	public static java.util.Iterator iterateContratoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Contrato as Contrato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contrato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato createContrato() {
		return new com.example.telecomunicaciones.bd.orm.Contrato();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Contrato contrato) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(contrato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Contrato contrato) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(contrato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Contrato contrato)throws PersistentException {
		try {
			if (contrato.getCliente() != null) {
				contrato.getCliente().contratos.remove(contrato);
			}
			
			if (contrato.getServicio() != null) {
				contrato.getServicio().contratos.remove(contrato);
			}
			
			return delete(contrato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Contrato contrato, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (contrato.getCliente() != null) {
				contrato.getCliente().contratos.remove(contrato);
			}
			
			if (contrato.getServicio() != null) {
				contrato.getServicio().contratos.remove(contrato);
			}
			
			try {
				session.delete(contrato);
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
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Contrato contrato) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(contrato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Contrato contrato) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(contrato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contrato loadContratoByCriteria(ContratoCriteria contratoCriteria) {
		Contrato[] contratos = listContratoByCriteria(contratoCriteria);
		if(contratos == null || contratos.length == 0) {
			return null;
		}
		return contratos[0];
	}
	
	public static Contrato[] listContratoByCriteria(ContratoCriteria contratoCriteria) {
		return contratoCriteria.listContrato();
	}
}
