package negocio;

import java.util.List;

import Dao.MotocicletaDao;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import modelo.Motocicleta;


@Stateless
public class GestionMotocicletas {
	@Inject
	private MotocicletaDao daomoto;
	
	 public void guardarMotocicleta(Motocicleta motocicleta) throws Exception {
	        Motocicleta motocicletaExistente = daomoto.read(motocicleta.getMotocicleta_id());

	        if (motocicletaExistente == null) {
	            try {
	                daomoto.insert(motocicleta);
	            } catch (Exception e) {
	                throw new Exception("Error al insertar: " + e.getMessage());
	            }
	        } else {
	            try {
	                motocicleta.setPlaca(motocicletaExistente.getPlaca());  // Asegura que el ID de la motocicleta existente se mantenga
	                daomoto.update(motocicleta);
	            } catch (Exception e) {
	                throw new Exception("Error al actualizar: " + e.getMessage());
	            }
	            
	        }
	    }
	



	    
	    public List<Motocicleta> listarMotos() {
	        return daomoto.getAll();
	    }
	

}
