package controladores;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.HuespedesDAO;
import factory.conexionBase;
import modelo.Huespedes;

public class huespedesControlador {
	private HuespedesDAO huespedesDAO;
	
	
	
	public huespedesControlador() {
		Connection connection = new conexionBase().recuperarConexion();
		this.huespedesDAO = new HuespedesDAO(connection);
	}
	
	public void guardar(Huespedes huespedes) {
		this.huespedesDAO.guardar(huespedes);
	}
	
	public  List<Huespedes> buscarHuespedes(){
		return this.huespedesDAO.buscar();
	}
	
	public  List<Huespedes> buscarHuespedesId(String id){
		return this.huespedesDAO.buscarId(id);
	}
	
	public void actualizar(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono,Integer id_reserva) {
		this.huespedesDAO.Actualizar(nombre, apellido, fechaNacimiento, nacionalidad, telefono, id_reserva, id_reserva);
	}
	 
	public void Eliminar(Integer idReserva) {
		this.huespedesDAO.Eliminar(idReserva);
	}
	
	
}
