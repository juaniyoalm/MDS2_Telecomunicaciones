/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.ormsamples;

import org.orm.*;
public class ListMDS2diagramasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Incidencia...");
		com.example.telecomunicaciones.bd.orm.Incidencia[] comexampletelecomunicacionesbdormIncidencias = com.example.telecomunicaciones.bd.orm.IncidenciaDAO.listIncidenciaByQuery(null, null);
		int length = Math.min(comexampletelecomunicacionesbdormIncidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormIncidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia_administrad...");
		com.example.telecomunicaciones.bd.orm.Incidencia_administrad[] comexampletelecomunicacionesbdormIncidencia_administrads = com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.listIncidencia_administradByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormIncidencia_administrads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormIncidencia_administrads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Factura...");
		com.example.telecomunicaciones.bd.orm.Factura[] comexampletelecomunicacionesbdormFacturas = com.example.telecomunicaciones.bd.orm.FacturaDAO.listFacturaByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormFacturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormFacturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Movil...");
		com.example.telecomunicaciones.bd.orm.Movil[] comexampletelecomunicacionesbdormMovils = com.example.telecomunicaciones.bd.orm.MovilDAO.listMovilByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormMovils.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormMovils[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contrato...");
		com.example.telecomunicaciones.bd.orm.Contrato[] comexampletelecomunicacionesbdormContratos = com.example.telecomunicaciones.bd.orm.ContratoDAO.listContratoByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormContratos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormContratos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Servicio...");
		com.example.telecomunicaciones.bd.orm.Servicio[] comexampletelecomunicacionesbdormServicios = com.example.telecomunicaciones.bd.orm.ServicioDAO.listServicioByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormServicios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormServicios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Combinado...");
		com.example.telecomunicaciones.bd.orm.Combinado[] comexampletelecomunicacionesbdormCombinados = com.example.telecomunicaciones.bd.orm.CombinadoDAO.listCombinadoByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormCombinados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormCombinados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comercial...");
		com.example.telecomunicaciones.bd.orm.Comercial[] comexampletelecomunicacionesbdormComercials = com.example.telecomunicaciones.bd.orm.ComercialDAO.listComercialByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormComercials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormComercials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		com.example.telecomunicaciones.bd.orm.Administrador[] comexampletelecomunicacionesbdormAdministradors = com.example.telecomunicaciones.bd.orm.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		com.example.telecomunicaciones.bd.orm.Cliente[] comexampletelecomunicacionesbdormClientes = com.example.telecomunicaciones.bd.orm.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paquete_TV...");
		com.example.telecomunicaciones.bd.orm.Paquete_TV[] comexampletelecomunicacionesbdormPaquete_TVs = com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.listPaquete_TVByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormPaquete_TVs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormPaquete_TVs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canal...");
		com.example.telecomunicaciones.bd.orm.Canal[] comexampletelecomunicacionesbdormCanals = com.example.telecomunicaciones.bd.orm.CanalDAO.listCanalByQuery(null, null);
		length = Math.min(comexampletelecomunicacionesbdormCanals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(comexampletelecomunicacionesbdormCanals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Incidencia by Criteria...");
		com.example.telecomunicaciones.bd.orm.IncidenciaCriteria lcomexampletelecomunicacionesbdormIncidenciaCriteria = new com.example.telecomunicaciones.bd.orm.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormIncidenciaCriteria.ID.eq();
		lcomexampletelecomunicacionesbdormIncidenciaCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Incidencia[] comexampletelecomunicacionesbdormIncidencias = lcomexampletelecomunicacionesbdormIncidenciaCriteria.listIncidencia();
		int length =comexampletelecomunicacionesbdormIncidencias== null ? 0 : Math.min(comexampletelecomunicacionesbdormIncidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormIncidencias[i]);
		}
		System.out.println(length + " Incidencia record(s) retrieved."); 
		
		System.out.println("Listing Incidencia_administrad by Criteria...");
		com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria lcomexampletelecomunicacionesbdormIncidencia_administradCriteria = new com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormIncidencia_administradCriteria.ID.eq();
		lcomexampletelecomunicacionesbdormIncidencia_administradCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Incidencia_administrad[] comexampletelecomunicacionesbdormIncidencia_administrads = lcomexampletelecomunicacionesbdormIncidencia_administradCriteria.listIncidencia_administrad();
		length =comexampletelecomunicacionesbdormIncidencia_administrads== null ? 0 : Math.min(comexampletelecomunicacionesbdormIncidencia_administrads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormIncidencia_administrads[i]);
		}
		System.out.println(length + " Incidencia_administrad record(s) retrieved."); 
		
		System.out.println("Listing Factura by Criteria...");
		com.example.telecomunicaciones.bd.orm.FacturaCriteria lcomexampletelecomunicacionesbdormFacturaCriteria = new com.example.telecomunicaciones.bd.orm.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormFacturaCriteria.ID.eq();
		lcomexampletelecomunicacionesbdormFacturaCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Factura[] comexampletelecomunicacionesbdormFacturas = lcomexampletelecomunicacionesbdormFacturaCriteria.listFactura();
		length =comexampletelecomunicacionesbdormFacturas== null ? 0 : Math.min(comexampletelecomunicacionesbdormFacturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormFacturas[i]);
		}
		System.out.println(length + " Factura record(s) retrieved."); 
		
		System.out.println("Listing Movil by Criteria...");
		com.example.telecomunicaciones.bd.orm.MovilCriteria lcomexampletelecomunicacionesbdormMovilCriteria = new com.example.telecomunicaciones.bd.orm.MovilCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormMovilCriteria.IDMovil.eq();
		lcomexampletelecomunicacionesbdormMovilCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Movil[] comexampletelecomunicacionesbdormMovils = lcomexampletelecomunicacionesbdormMovilCriteria.listMovil();
		length =comexampletelecomunicacionesbdormMovils== null ? 0 : Math.min(comexampletelecomunicacionesbdormMovils.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormMovils[i]);
		}
		System.out.println(length + " Movil record(s) retrieved."); 
		
		System.out.println("Listing Contrato by Criteria...");
		com.example.telecomunicaciones.bd.orm.ContratoCriteria lcomexampletelecomunicacionesbdormContratoCriteria = new com.example.telecomunicaciones.bd.orm.ContratoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormContratoCriteria.ID.eq();
		lcomexampletelecomunicacionesbdormContratoCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Contrato[] comexampletelecomunicacionesbdormContratos = lcomexampletelecomunicacionesbdormContratoCriteria.listContrato();
		length =comexampletelecomunicacionesbdormContratos== null ? 0 : Math.min(comexampletelecomunicacionesbdormContratos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormContratos[i]);
		}
		System.out.println(length + " Contrato record(s) retrieved."); 
		
		System.out.println("Listing Servicio by Criteria...");
		com.example.telecomunicaciones.bd.orm.ServicioCriteria lcomexampletelecomunicacionesbdormServicioCriteria = new com.example.telecomunicaciones.bd.orm.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormServicioCriteria.ID.eq();
		lcomexampletelecomunicacionesbdormServicioCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Servicio[] comexampletelecomunicacionesbdormServicios = lcomexampletelecomunicacionesbdormServicioCriteria.listServicio();
		length =comexampletelecomunicacionesbdormServicios== null ? 0 : Math.min(comexampletelecomunicacionesbdormServicios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormServicios[i]);
		}
		System.out.println(length + " Servicio record(s) retrieved."); 
		
		System.out.println("Listing Combinado by Criteria...");
		com.example.telecomunicaciones.bd.orm.CombinadoCriteria lcomexampletelecomunicacionesbdormCombinadoCriteria = new com.example.telecomunicaciones.bd.orm.CombinadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormCombinadoCriteria.IDCombinado.eq();
		lcomexampletelecomunicacionesbdormCombinadoCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Combinado[] comexampletelecomunicacionesbdormCombinados = lcomexampletelecomunicacionesbdormCombinadoCriteria.listCombinado();
		length =comexampletelecomunicacionesbdormCombinados== null ? 0 : Math.min(comexampletelecomunicacionesbdormCombinados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormCombinados[i]);
		}
		System.out.println(length + " Combinado record(s) retrieved."); 
		
		System.out.println("Listing Comercial by Criteria...");
		com.example.telecomunicaciones.bd.orm.ComercialCriteria lcomexampletelecomunicacionesbdormComercialCriteria = new com.example.telecomunicaciones.bd.orm.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormComercialCriteria.IDComercial.eq();
		lcomexampletelecomunicacionesbdormComercialCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Comercial[] comexampletelecomunicacionesbdormComercials = lcomexampletelecomunicacionesbdormComercialCriteria.listComercial();
		length =comexampletelecomunicacionesbdormComercials== null ? 0 : Math.min(comexampletelecomunicacionesbdormComercials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormComercials[i]);
		}
		System.out.println(length + " Comercial record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		com.example.telecomunicaciones.bd.orm.AdministradorCriteria lcomexampletelecomunicacionesbdormAdministradorCriteria = new com.example.telecomunicaciones.bd.orm.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormAdministradorCriteria.IDAdmin.eq();
		lcomexampletelecomunicacionesbdormAdministradorCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Administrador[] comexampletelecomunicacionesbdormAdministradors = lcomexampletelecomunicacionesbdormAdministradorCriteria.listAdministrador();
		length =comexampletelecomunicacionesbdormAdministradors== null ? 0 : Math.min(comexampletelecomunicacionesbdormAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		com.example.telecomunicaciones.bd.orm.ClienteCriteria lcomexampletelecomunicacionesbdormClienteCriteria = new com.example.telecomunicaciones.bd.orm.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormClienteCriteria.IDCliente.eq();
		lcomexampletelecomunicacionesbdormClienteCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Cliente[] comexampletelecomunicacionesbdormClientes = lcomexampletelecomunicacionesbdormClienteCriteria.listCliente();
		length =comexampletelecomunicacionesbdormClientes== null ? 0 : Math.min(comexampletelecomunicacionesbdormClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Paquete_TV by Criteria...");
		com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria lcomexampletelecomunicacionesbdormPaquete_TVCriteria = new com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormPaquete_TVCriteria.IDPaquete.eq();
		lcomexampletelecomunicacionesbdormPaquete_TVCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Paquete_TV[] comexampletelecomunicacionesbdormPaquete_TVs = lcomexampletelecomunicacionesbdormPaquete_TVCriteria.listPaquete_TV();
		length =comexampletelecomunicacionesbdormPaquete_TVs== null ? 0 : Math.min(comexampletelecomunicacionesbdormPaquete_TVs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormPaquete_TVs[i]);
		}
		System.out.println(length + " Paquete_TV record(s) retrieved."); 
		
		System.out.println("Listing Canal by Criteria...");
		com.example.telecomunicaciones.bd.orm.CanalCriteria lcomexampletelecomunicacionesbdormCanalCriteria = new com.example.telecomunicaciones.bd.orm.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcomexampletelecomunicacionesbdormCanalCriteria.IDCanal.eq();
		lcomexampletelecomunicacionesbdormCanalCriteria.setMaxResults(ROW_COUNT);
		com.example.telecomunicaciones.bd.orm.Canal[] comexampletelecomunicacionesbdormCanals = lcomexampletelecomunicacionesbdormCanalCriteria.listCanal();
		length =comexampletelecomunicacionesbdormCanals== null ? 0 : Math.min(comexampletelecomunicacionesbdormCanals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(comexampletelecomunicacionesbdormCanals[i]);
		}
		System.out.println(length + " Canal record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS2diagramasData listMDS2diagramasData = new ListMDS2diagramasData();
			try {
				listMDS2diagramasData.listTestData();
				//listMDS2diagramasData.listByCriteria();
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
