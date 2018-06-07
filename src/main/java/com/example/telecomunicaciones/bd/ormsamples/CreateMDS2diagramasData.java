/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.ormsamples;

import org.orm.*;
public class CreateMDS2diagramasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance().getSession().beginTransaction();
		try {
			com.example.telecomunicaciones.bd.orm.Incidencia lcomexampletelecomunicacionesbdormIncidencia = com.example.telecomunicaciones.bd.orm.IncidenciaDAO.createIncidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : attribute
			com.example.telecomunicaciones.bd.orm.IncidenciaDAO.save(lcomexampletelecomunicacionesbdormIncidencia);
			com.example.telecomunicaciones.bd.orm.Incidencia_administrad lcomexampletelecomunicacionesbdormIncidencia_administrad = com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.createIncidencia_administrad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administrador
			com.example.telecomunicaciones.bd.orm.Incidencia_administradDAO.save(lcomexampletelecomunicacionesbdormIncidencia_administrad);
			com.example.telecomunicaciones.bd.orm.Factura lcomexampletelecomunicacionesbdormFactura = com.example.telecomunicaciones.bd.orm.FacturaDAO.createFactura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : servicio, precioTotal, attribute, cliente
			com.example.telecomunicaciones.bd.orm.FacturaDAO.save(lcomexampletelecomunicacionesbdormFactura);
			com.example.telecomunicaciones.bd.orm.Movil lcomexampletelecomunicacionesbdormMovil = com.example.telecomunicaciones.bd.orm.MovilDAO.createMovil();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : servicio, visibilidad, precio, consumoMaximo, consumoActual
			com.example.telecomunicaciones.bd.orm.MovilDAO.save(lcomexampletelecomunicacionesbdormMovil);
			com.example.telecomunicaciones.bd.orm.Contrato lcomexampletelecomunicacionesbdormContrato = com.example.telecomunicaciones.bd.orm.ContratoDAO.createContrato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : servicio, cliente, attribute
			com.example.telecomunicaciones.bd.orm.ContratoDAO.save(lcomexampletelecomunicacionesbdormContrato);
			com.example.telecomunicaciones.bd.orm.Servicio lcomexampletelecomunicacionesbdormServicio = com.example.telecomunicaciones.bd.orm.ServicioDAO.createServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contratos, factura, combinado, visivilidad, precio, movil, paquete_TV
			com.example.telecomunicaciones.bd.orm.ServicioDAO.save(lcomexampletelecomunicacionesbdormServicio);
			com.example.telecomunicaciones.bd.orm.Combinado lcomexampletelecomunicacionesbdormCombinado = com.example.telecomunicaciones.bd.orm.CombinadoDAO.createCombinado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : servicio, precio
			com.example.telecomunicaciones.bd.orm.CombinadoDAO.save(lcomexampletelecomunicacionesbdormCombinado);
			com.example.telecomunicaciones.bd.orm.Comercial lcomexampletelecomunicacionesbdormComercial = com.example.telecomunicaciones.bd.orm.ComercialDAO.createComercial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, administrador
			com.example.telecomunicaciones.bd.orm.ComercialDAO.save(lcomexampletelecomunicacionesbdormComercial);
			com.example.telecomunicaciones.bd.orm.Administrador lcomexampletelecomunicacionesbdormAdministrador = com.example.telecomunicaciones.bd.orm.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : incidencia_administrad, comercial, cliente
			com.example.telecomunicaciones.bd.orm.AdministradorDAO.save(lcomexampletelecomunicacionesbdormAdministrador);
			com.example.telecomunicaciones.bd.orm.Cliente lcomexampletelecomunicacionesbdormCliente = com.example.telecomunicaciones.bd.orm.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comercial, factura, contratos, administrador
			com.example.telecomunicaciones.bd.orm.ClienteDAO.save(lcomexampletelecomunicacionesbdormCliente);
			com.example.telecomunicaciones.bd.orm.Paquete_TV lcomexampletelecomunicacionesbdormPaquete_TV = com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.createPaquete_TV();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : servicio, canal, visibilidad, precio
			com.example.telecomunicaciones.bd.orm.Paquete_TVDAO.save(lcomexampletelecomunicacionesbdormPaquete_TV);
			com.example.telecomunicaciones.bd.orm.Canal lcomexampletelecomunicacionesbdormCanal = com.example.telecomunicaciones.bd.orm.CanalDAO.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paquete_TV, visibilidad, precio
			com.example.telecomunicaciones.bd.orm.CanalDAO.save(lcomexampletelecomunicacionesbdormCanal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS2diagramasData createMDS2diagramasData = new CreateMDS2diagramasData();
			try {
				createMDS2diagramasData.createTestData();
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
