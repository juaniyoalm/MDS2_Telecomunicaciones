package com.example.telecomunicaciones;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.example.telecomunicaciones.bd.orm.Cliente;
import com.example.telecomunicaciones.bd.orm.ClienteDAO;
import com.example.telecomunicaciones.bd.orm.Servicio;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class ComercialNew_ModCliente extends V_ComercialNew_ModCliente{
	IAdministrador ad;
	
	public ComercialNew_ModCliente() {
		
		menuTabCliente.setWidth("100%");
		menuTabCliente.setHeight("100%");
		
		Label lNombre = new Label();
		TextField nombre = new TextField();
		HorizontalLayout h1 = new HorizontalLayout();
		h1.addComponent(lNombre);
		h1.addComponent(nombre);
		
		Label lDNI = new Label();
		TextField dni = new TextField();
		HorizontalLayout h2 = new HorizontalLayout();
		h2.addComponent(lDNI);
		h2.addComponent(dni);
		
		
		Label lAp1 = new Label();
		TextField ap1 = new TextField();
		HorizontalLayout h3 = new HorizontalLayout();
		h3.addComponent(lAp1);
		h3.addComponent(ap1);
		
		Label lAp2 = new Label();
		TextField ap2 = new TextField();
		HorizontalLayout h4 = new HorizontalLayout();
		h4.addComponent(lAp2);
		h4.addComponent(ap2);
		
		Label lUsuario = new Label();
		TextField usuario = new TextField();
		HorizontalLayout h5 = new HorizontalLayout();
		h5.addComponent(lUsuario);
		h5.addComponent(usuario);
		
		Label lPass = new Label();
		TextField pass = new TextField();
		HorizontalLayout h6 = new HorizontalLayout();
		h6.addComponent(lPass);
		h6.addComponent(pass);
		
		Label lTel = new Label();
		TextField tel = new TextField();
		HorizontalLayout h7 = new HorizontalLayout();
		h7.addComponent(lTel);
		h7.addComponent(tel);
		
		Label lServ = new Label();
		ComboBox<Servicio> serv = new ComboBox<>();
		HorizontalLayout h8 = new HorizontalLayout();
		h8.addComponent(lServ);
		h8.addComponent(serv);
		
		Button btnCancelar= new Button();
		Button btnAceptar= new Button();
		HorizontalLayout h9 = new HorizontalLayout();
		h9.addComponent(btnCancelar);
		h9.addComponent(btnAceptar);
		
		this.verticalPanel.addComponent(h1);
		this.verticalPanel.addComponent(h2);
		this.verticalPanel.addComponent(h3);
		this.verticalPanel.addComponent(h4);
		this.verticalPanel.addComponent(h5);
		this.verticalPanel.addComponent(h6);
		this.verticalPanel.addComponent(h7);
		this.verticalPanel.addComponent(h8);
		this.verticalPanel.addComponent(h9);
		
		
		ad = new BD_Principal();
		Cliente cliente = ClienteDAO.createCliente();
		cliente.setApellido1(ap1.getValue());
		cliente.setApellido2(ap2.getValue());
		cliente.setEmail(usuario.getValue());
		cliente.setNif(dni.getValue());
		cliente.setNombre(nombre.getValue());
		cliente.setTelefono(tel.getValue());
		cliente.setPassword(pass.getValue());
		cliente.setAdministrador(ad.getAdmin());
		
		btnAceptar.addClickListener( event -> {
			ad.addCliente(cliente);
		});
	}
	
	public ComercialNew_ModCliente(com.example.telecomunicaciones.bd.orm.Cliente cliente) {
		
		Label lNombre = new Label();
		TextField nombre = new TextField();
		HorizontalLayout h1 = new HorizontalLayout();
		h1.addComponent(lNombre);
		h1.addComponent(nombre);
		
		Label lDNI = new Label();
		TextField dni = new TextField();
		HorizontalLayout h2 = new HorizontalLayout();
		h2.addComponent(lDNI);
		h2.addComponent(dni);
		
		
		Label lAp1 = new Label();
		TextField ap1 = new TextField();
		HorizontalLayout h3 = new HorizontalLayout();
		h3.addComponent(lAp1);
		h3.addComponent(ap1);
		
		Label lAp2 = new Label();
		TextField ap2 = new TextField();
		HorizontalLayout h4 = new HorizontalLayout();
		h4.addComponent(lAp2);
		h4.addComponent(ap2);
		
		Label lUsuario = new Label();
		TextField usuario = new TextField();
		HorizontalLayout h5 = new HorizontalLayout();
		h5.addComponent(lUsuario);
		h5.addComponent(usuario);
		
		Label lPass = new Label();
		TextField pass = new TextField();
		HorizontalLayout h6 = new HorizontalLayout();
		h6.addComponent(lPass);
		h6.addComponent(pass);
		
		Label lTel = new Label();
		TextField tel = new TextField();
		HorizontalLayout h7 = new HorizontalLayout();
		h7.addComponent(lTel);
		h7.addComponent(tel);
		
		Label lServ = new Label();
		ComboBox<Servicio> serv = new ComboBox<>();
		HorizontalLayout h8 = new HorizontalLayout();
		h8.addComponent(lServ);
		h8.addComponent(serv);
		
		Button btnCancelar= new Button();
		Button btnAceptar= new Button();
		HorizontalLayout h9 = new HorizontalLayout();
		h9.addComponent(btnCancelar);
		h9.addComponent(btnAceptar);
		
		this.verticalPanel.addComponent(h1);
		this.verticalPanel.addComponent(h2);
		this.verticalPanel.addComponent(h3);
		this.verticalPanel.addComponent(h4);
		this.verticalPanel.addComponent(h5);
		this.verticalPanel.addComponent(h6);
		this.verticalPanel.addComponent(h7);
		this.verticalPanel.addComponent(h8);
		this.verticalPanel.addComponent(h9);

		ad = new BD_Principal();
		cliente.setApellido1(ap1.getValue());
		cliente.setApellido2(ap2.getValue());
		cliente.setEmail(usuario.getValue());
		cliente.setNif(dni.getValue());
		cliente.setNombre(nombre.getValue());
		cliente.setTelefono(tel.getValue());
		cliente.setPassword(pass.getValue());
		cliente.setAdministrador(ad.getAdmin());
		ad.updateCliente(cliente);
		btnAceptar.addClickListener( event -> {
			ad.addCliente(cliente);
		});
	}
	
}
