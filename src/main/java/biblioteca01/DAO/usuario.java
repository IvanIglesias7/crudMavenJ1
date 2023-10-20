package biblioteca01.DAO;

import java.util.Calendar;

import org.springframework.lang.NonNull;

import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_usuario;
	
	@Column(name = "dni_usuario", nullable = false)
	private String dni_usuario;
	
	@Column(name = "nombre_usuario")
	private String nombre_usuario;
	
	@Column(name = "apellido_usuario")
	private String apellido_usuario;
	
	@Column(name = "tlf_usuario")
	private String tlf_usuario;
	
	@Column(name = "email_usuario")
	private String email_usuario;
	
	@Column(name = "clave_usuario")
	private String clave_usuario;
	
	@Column(name = "estaBloqueado_usuario")
	private boolean estaBloqueado_usuario;
	
	@Column(name = "fch_fin_bloqueo")
	@Temporal(TemporalType.DATE)
	private Calendar fch_fin_bloqueo;
	
}
