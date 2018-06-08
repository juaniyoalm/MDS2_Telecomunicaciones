package com.example.telecomunicaciones;

import java.util.ArrayList;

import com.example.telecomunicaciones.bd.BD_Principal;
import com.example.telecomunicaciones.bd.IAdministrador;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.renderers.ButtonRenderer;

public class AdministradorServicios extends V_AdministradorServicios {
	
	IAdministrador administrdorBD;
	
	public AdministradorServicios() {
		Inicializar();
	}
		private void Inicializar() {
			
			administrdorBD = new BD_Principal();
		
			AdministradorNuevaOferta no = new AdministradorNuevaOferta();
			PopupView pv = new PopupView(null, no);
			pv.setStyleName("pNuevoCliente");
			verticalPanel.addComponent(pv);
			
			ArrayList<com.example.telecomunicaciones.bd.orm.Servicio> servicios = administrdorBD.cargarServicios();
			Grid<com.example.telecomunicaciones.bd.orm.Servicio> grid = new Grid<>();
			grid.setItems(servicios);
			grid.addColumn(com.example.telecomunicaciones.bd.orm.Servicio::getID).setCaption("ID");
			grid.addColumn(com.example.telecomunicaciones.bd.orm.Servicio::getNombre).setCaption("Nombre");
			grid.addColumn(com.example.telecomunicaciones.bd.orm.Servicio::getCaracteristicas).setCaption("Caracteristicas");

			/*
			 * no se si faltan posibles columnas ver detalle de servicio o alguna cosa así
			 */
			
			addOfertaBtn.addClickListener(event -> {
				pv.setPopupVisible(true);
			});
			
			verticalPanel.addComponent(grid);
	}
}
