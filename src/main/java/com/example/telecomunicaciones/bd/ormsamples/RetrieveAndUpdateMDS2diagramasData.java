/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS2diagramasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.telecomunicaciones.bd.orm.Incidencia lcomexampletelecomunicacionesbdormIncidencia = com.example.telecomunicaciones.bd.orm.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.IncidenciaDAO.save(lcomexampletelecomunicacionesbdormIncidencia);
			com.example.telecomunicaciones.bd.orm.Incidencia_administrad lcomexampletelecomunicacionesbdormIncidencia_administrad = com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.loadIncidencia_administradByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.save(lcomexampletelecomunicacionesbdormIncidencia_administrad);
			com.example.telecomunicaciones.bd.orm.Factura lcomexampletelecomunicacionesbdormFactura = com.example.telecomunicaciones.bd.orm.FacturaDAO.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.FacturaDAO.save(lcomexampletelecomunicacionesbdormFactura);
			com.example.telecomunicaciones.bd.orm.Movil lcomexampletelecomunicacionesbdormMovil = com.example.telecomunicaciones.bd.orm.MovilDAO.loadMovilByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.MovilDAO.save(lcomexampletelecomunicacionesbdormMovil);
			com.example.telecomunicaciones.bd.orm.Contrato lcomexampletelecomunicacionesbdormContrato = com.example.telecomunicaciones.bd.orm.ContratoDAO.loadContratoByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.ContratoDAO.save(lcomexampletelecomunicacionesbdormContrato);
			com.example.telecomunicaciones.bd.orm.Servicio lcomexampletelecomunicacionesbdormServicio = com.example.telecomunicaciones.bd.orm.ServicioDAO.loadServicioByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.ServicioDAO.save(lcomexampletelecomunicacionesbdormServicio);
			com.example.telecomunicaciones.bd.orm.Combinado lcomexampletelecomunicacionesbdormCombinado = com.example.telecomunicaciones.bd.orm.CombinadoDAO.loadCombinadoByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.CombinadoDAO.save(lcomexampletelecomunicacionesbdormCombinado);
			com.example.telecomunicaciones.bd.orm.Comercial lcomexampletelecomunicacionesbdormComercial = com.example.telecomunicaciones.bd.orm.ComercialDAO.loadComercialByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.ComercialDAO.save(lcomexampletelecomunicacionesbdormComercial);
			com.example.telecomunicaciones.bd.orm.Administrador lcomexampletelecomunicacionesbdormAdministrador = com.example.telecomunicaciones.bd.orm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.AdministradorDAO.save(lcomexampletelecomunicacionesbdormAdministrador);
			com.example.telecomunicaciones.bd.orm.Cliente lcomexampletelecomunicacionesbdormCliente = com.example.telecomunicaciones.bd.orm.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.ClienteDAO.save(lcomexampletelecomunicacionesbdormCliente);
			com.example.telecomunicaciones.bd.orm.Paquete_TV lcomexampletelecomunicacionesbdormPaquete_TV = com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.loadPaquete_TVByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.save(lcomexampletelecomunicacionesbdormPaquete_TV);
			com.example.telecomunicaciones.bd.orm.Canal lcomexampletelecomunicacionesbdormCanal = com.example.telecomunicaciones.bd.orm.CanalDAO.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			com.example.telecomunicaciones.bd.orm.CanalDAO.save(lcomexampletelecomunicacionesbdormCanal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Incidencia by IncidenciaCriteria");
		com.example.telecomunicaciones.bd.orm.IncidenciaCriteria lcomexampletelecomunicacionesbdormIncidenciaCriteria = new com.example.telecomunicaciones.bd.orm.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormIncidenciaCriteria.ID.eq();
		System.out.println(lcomexampletelecomunicacionesbdormIncidenciaCriteria.uniqueIncidencia());
		
		System.out.println("Retrieving Incidencia_administrad by Incidencia_administradCriteria");
		com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria lcomexampletelecomunicacionesbdormIncidencia_administradCriteria = new com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormIncidencia_administradCriteria.ID.eq();
		System.out.println(lcomexampletelecomunicacionesbdormIncidencia_administradCriteria.uniqueIncidencia_administrad());
		
		System.out.println("Retrieving Factura by FacturaCriteria");
		com.example.telecomunicaciones.bd.orm.FacturaCriteria lcomexampletelecomunicacionesbdormFacturaCriteria = new com.example.telecomunicaciones.bd.orm.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormFacturaCriteria.ID.eq();
		System.out.println(lcomexampletelecomunicacionesbdormFacturaCriteria.uniqueFactura());
		
		System.out.println("Retrieving Movil by MovilCriteria");
		com.example.telecomunicaciones.bd.orm.MovilCriteria lcomexampletelecomunicacionesbdormMovilCriteria = new com.example.telecomunicaciones.bd.orm.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormMovilCriteria.IDMovil.eq();
		System.out.println(lcomexampletelecomunicacionesbdormMovilCriteria.uniqueMovil());
		
		System.out.println("Retrieving Contrato by ContratoCriteria");
		com.example.telecomunicaciones.bd.orm.ContratoCriteria lcomexampletelecomunicacionesbdormContratoCriteria = new com.example.telecomunicaciones.bd.orm.ContratoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormContratoCriteria.ID.eq();
		System.out.println(lcomexampletelecomunicacionesbdormContratoCriteria.uniqueContrato());
		
		System.out.println("Retrieving Servicio by ServicioCriteria");
		com.example.telecomunicaciones.bd.orm.ServicioCriteria lcomexampletelecomunicacionesbdormServicioCriteria = new com.example.telecomunicaciones.bd.orm.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormServicioCriteria.ID.eq();
		System.out.println(lcomexampletelecomunicacionesbdormServicioCriteria.uniqueServicio());
		
		System.out.println("Retrieving Combinado by CombinadoCriteria");
		com.example.telecomunicaciones.bd.orm.CombinadoCriteria lcomexampletelecomunicacionesbdormCombinadoCriteria = new com.example.telecomunicaciones.bd.orm.CombinadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormCombinadoCriteria.IDCombinado.eq();
		System.out.println(lcomexampletelecomunicacionesbdormCombinadoCriteria.uniqueCombinado());
		
		System.out.println("Retrieving Comercial by ComercialCriteria");
		com.example.telecomunicaciones.bd.orm.ComercialCriteria lcomexampletelecomunicacionesbdormComercialCriteria = new com.example.telecomunicaciones.bd.orm.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormComercialCriteria.IDComercial.eq();
		System.out.println(lcomexampletelecomunicacionesbdormComercialCriteria.uniqueComercial());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		com.example.telecomunicaciones.bd.orm.AdministradorCriteria lcomexampletelecomunicacionesbdormAdministradorCriteria = new com.example.telecomunicaciones.bd.orm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormAdministradorCriteria.IDAdmin.eq();
		System.out.println(lcomexampletelecomunicacionesbdormAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		com.example.telecomunicaciones.bd.orm.ClienteCriteria lcomexampletelecomunicacionesbdormClienteCriteria = new com.example.telecomunicaciones.bd.orm.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormClienteCriteria.IDCliente.eq();
		System.out.println(lcomexampletelecomunicacionesbdormClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Paquete_TV by Paquete_TVCriteria");
		com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria lcomexampletelecomunicacionesbdormPaquete_TVCriteria = new com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormPaquete_TVCriteria.IDPaquete.eq();
		System.out.println(lcomexampletelecomunicacionesbdormPaquete_TVCriteria.uniquePaquete_TV());
		
		System.out.println("Retrieving Canal by CanalCriteria");
		com.example.telecomunicaciones.bd.orm.CanalCriteria lcomexampletelecomunicacionesbdormCanalCriteria = new com.example.telecomunicaciones.bd.orm.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcomexampletelecomunicacionesbdormCanalCriteria.IDCanal.eq();
		System.out.println(lcomexampletelecomunicacionesbdormCanalCriteria.uniqueCanal());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS2diagramasData retrieveAndUpdateMDS2diagramasData = new RetrieveAndUpdateMDS2diagramasData();
			try {
				retrieveAndUpdateMDS2diagramasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS2diagramasData.retrieveByCriteria();
			}
			finally {
				com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
