public class BD_Principal implements ICibernauta, ICliente, IComercial, IAdministrador {
	public BD_Oferta _bd_oferta;
	public BD_Movil _bd_movil;
	public BD_Paquete_TV _bd_paquete;
	public BD_Canal _bd_canal;
	public BD_Factura _bd_factura;
	public BD_Cliente _bd_cliente;
	public BD_Comercial _bd_comercial;
	public BD_Administrador _bd_administrador;
	public BD_Incidencia_administrador _bd_incidencia_admin;

	public void iniciarSesion(String aEmail, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> consultarServicioPortada() {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(String aNombre, String aTelefono) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasFijo() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasFibra() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasMovil() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasTV() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarOfertasCombi() {
		throw new UnsupportedOperationException();
	}

	public void restorePassword(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void bajaCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatosCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Factura> cargarFacturas(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean nuevaIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarContratos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void teLlamamos(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void resolverIncidencia(Incidencia aIncidencia) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cliente> cargarClientes() {
		throw new UnsupportedOperationException();
	}

	public void delCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void addCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public void updateCliente(Cliente aCliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Comercial> cargarComerciales() {
		throw new UnsupportedOperationException();
	}

	public void delComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void addComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public void updateComercial(Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Incidencia> cargarIncidencias() {
		throw new UnsupportedOperationException();
	}

	public void asignarIncidencia(Incidencia aIncidencia, Comercial aComercial) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarServicios() {
		throw new UnsupportedOperationException();
	}

	public void addServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void modificarServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void delServicio(Servicio aServicio) {
		throw new UnsupportedOperationException();
	}

	public void updateServiciosPortada(ArrayList<Servicio> aServiciosPortada) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Servicio> cargarServiciosPortada() {
		throw new UnsupportedOperationException();
	}
}