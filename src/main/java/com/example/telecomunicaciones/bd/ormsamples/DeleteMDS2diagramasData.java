/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.ormsamples;

import org.orm.*;
public class DeleteMDS2diagramasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.telecomunicaciones.bd.orm.Incidencia lcomexampletelecomunicacionesbdormIncidencia = com.example.telecomunicaciones.bd.orm.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.IncidenciaDAO.delete(lcomexampletelecomunicacionesbdormIncidencia);
			com.example.telecomunicaciones.bd.orm.Incidencia_administrad lcomexampletelecomunicacionesbdormIncidencia_administrad = com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.loadIncidencia_administradByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.delete(lcomexampletelecomunicacionesbdormIncidencia_administrad);
			com.example.telecomunicaciones.bd.orm.Factura lcomexampletelecomunicacionesbdormFactura = com.example.telecomunicaciones.bd.orm.FacturaDAO.loadFacturaByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.FacturaDAO.delete(lcomexampletelecomunicacionesbdormFactura);
			com.example.telecomunicaciones.bd.orm.Movil lcomexampletelecomunicacionesbdormMovil = com.example.telecomunicaciones.bd.orm.MovilDAO.loadMovilByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.MovilDAO.delete(lcomexampletelecomunicacionesbdormMovil);
			com.example.telecomunicaciones.bd.orm.Contrato lcomexampletelecomunicacionesbdormContrato = com.example.telecomunicaciones.bd.orm.ContratoDAO.loadContratoByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.ContratoDAO.delete(lcomexampletelecomunicacionesbdormContrato);
			com.example.telecomunicaciones.bd.orm.Servicio lcomexampletelecomunicacionesbdormServicio = com.example.telecomunicaciones.bd.orm.ServicioDAO.loadServicioByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.ServicioDAO.delete(lcomexampletelecomunicacionesbdormServicio);
			com.example.telecomunicaciones.bd.orm.Combinado lcomexampletelecomunicacionesbdormCombinado = com.example.telecomunicaciones.bd.orm.CombinadoDAO.loadCombinadoByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.CombinadoDAO.delete(lcomexampletelecomunicacionesbdormCombinado);
			com.example.telecomunicaciones.bd.orm.Comercial lcomexampletelecomunicacionesbdormComercial = com.example.telecomunicaciones.bd.orm.ComercialDAO.loadComercialByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.ComercialDAO.delete(lcomexampletelecomunicacionesbdormComercial);
			com.example.telecomunicaciones.bd.orm.Administrador lcomexampletelecomunicacionesbdormAdministrador = com.example.telecomunicaciones.bd.orm.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.AdministradorDAO.delete(lcomexampletelecomunicacionesbdormAdministrador);
			com.example.telecomunicaciones.bd.orm.Cliente lcomexampletelecomunicacionesbdormCliente = com.example.telecomunicaciones.bd.orm.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.ClienteDAO.delete(lcomexampletelecomunicacionesbdormCliente);
			com.example.telecomunicaciones.bd.orm.Paquete_TV lcomexampletelecomunicacionesbdormPaquete_TV = com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.loadPaquete_TVByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.delete(lcomexampletelecomunicacionesbdormPaquete_TV);
			com.example.telecomunicaciones.bd.orm.Canal lcomexampletelecomunicacionesbdormCanal = com.example.telecomunicaciones.bd.orm.CanalDAO.loadCanalByQuery(null, null);
			// Delete the persistent object
			com.example.telecomunicaciones.bd.orm.CanalDAO.delete(lcomexampletelecomunicacionesbdormCanal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS2diagramasData deleteMDS2diagramasData = new DeleteMDS2diagramasData();
			try {
				deleteMDS2diagramasData.deleteTestData();
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
