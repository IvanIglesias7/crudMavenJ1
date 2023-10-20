package biblioteca01.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Accesos")
public class acceso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_acceso;
	private String codigo_acceso;
	private String descripcion_acceso;
	
	//Getters and Setters
	public int getId_acceso() {
		return id_acceso;
	}
	public void setId_acceso(int id_acceso) {
		this.id_acceso = id_acceso;
	}
	public String getCodigo_acceso() {
		return codigo_acceso;
	}
	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}
	public String getDescripcion_acceso() {
		return descripcion_acceso;
	}
	public void setDescripcion_acceso(String descripcion_acceso) {
		this.descripcion_acceso = descripcion_acceso;
	}
	
	
	
	
	
}
