package com.example.telecomunicaciones.bd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.telecomunicaciones.bd.orm.Administrador;
import com.example.telecomunicaciones.bd.orm.AdministradorDAO;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;
import com.example.telecomunicaciones.bd.orm.Comercial;
import com.example.telecomunicaciones.bd.orm.MDS2diagramasPersistentManager;
import com.example.telecomunicaciones.bd.orm.ServicioDAO;

public class IntroducirDatos implements Serializable {

	public static void main(String[] args) throws PersistentException {
		
		IAdministrador ad = new BD_Principal();
		Administrador admin = AdministradorDAO.getAdministradorByORMID(1);
		
		int dato = 0;
		
		System.out.println("Los Clientes actuales son:");
		
		ArrayList<Cliente> c = ad.cargarClientes();
		
		for (Cliente cliente : c) {
			System.out.println(cliente.getNombre());
			System.out.println();
		}
		
		
		System.out.println("Introduce 1 para crear un Cliente y 2 para un Comercial");
		Scanner sc = new Scanner(System.in);
		dato = sc.nextInt();
		
		
		
		
		switch (dato) {
		case 1:
			// AGREGAR CLIENTE
			Cliente nc = new Cliente();
			nc.setApellido1("Perez");
			nc.setApellido2("Clemente");
			nc.setEmail("Juaniyo@hola.com");
			nc.setNif("11111111D");
			nc.setNombre("JuanCliente3");
			nc.setTelefono("999999999");
			nc.setPassword("1111");
			nc.setAdministrador(admin);
			ad.addCliente(nc);
			break;
			
		case 2:
			// AGREGAR COMERCIAL
			Comercial nco = new Comercial();
			nco.setEmail("Juaniyo@hola.com");
			nco.setNif("11111111D");
			nco.setNombre("JuanComercial");
			nco.setPassword("1111");
			nco.setAdministrador(admin);
			ad.addComercial(nco);
			break;
			

		default:
			break;
		}
			

	}

}
