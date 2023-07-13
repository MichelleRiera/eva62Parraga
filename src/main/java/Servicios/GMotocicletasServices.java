package Servicios;

import java.util.ArrayList;
import java.util.List;

import Dao.MotocicletaDao;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import modelo.Motocicleta;
import negocio.GestionMotocicletas;


@Path("Motos")
public class GMotocicletasServices {
	@Inject 
	private MotocicletaDao motocicletaDao;
	
	@Inject
	private GestionMotocicletas motos;
	
	private List<Motocicleta> motocicletas = new ArrayList<>();
	
 
	
	    @GET
	    @Path("listar")
	    @Produces("application/json")
	    public List<Motocicleta> listarMotos() {
	        return motos.listarMotos();
	    }

	    @POST
	    @Path("registrar")
	    @Produces("application/json")
	    public Response guardarMoto(Motocicleta motocicleta) {
	        try {
	            motos.guardarMotocicleta(motocicleta);
	            return Response.status(Response.Status.OK).entity(motocicleta).build();
	        } catch (Exception e) {
	            e.printStackTrace();
	            Error error = new Error();
	            error.setCodigo(99);
	            error.setMensaje("Error al guardar: " + e.getMessage());
	            return Response.status(Response.Status.OK).entity(error).build();
	        }
	    }
	    
	    
	   
	}
	