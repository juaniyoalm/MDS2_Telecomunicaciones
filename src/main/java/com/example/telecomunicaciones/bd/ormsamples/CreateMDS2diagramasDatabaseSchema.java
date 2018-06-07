/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.ormsamples;

import org.orm.*;
public class CreateMDS2diagramasDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance());
			com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
