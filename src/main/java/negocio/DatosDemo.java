package negocio;

import java.util.List;

import Dao.MotocicletaDao;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;
import modelo.Motocicleta;




@Singleton
@Startup
public class DatosDemo {
	@Inject 
	private MotocicletaDao dao;
	
	@PostConstruct
	public void init() {
		Motocicleta m= new Motocicleta();
		m.setPlaca("11-mmm");
		m.setAnio(2022);
		m.setColor("rojo");
		m.setMarca("Honda");
		m.setTipo("deportiva");
		
		dao.insert(m);
		
		/*Motocicleta m1= new Motocicleta();
		m1.setMotocicleta_id(1);
		m1.setPlaca("11-mmm");
		m1.setAnio(2022);
		m1.setColor("rojo");
		m1.setMarca("Honda");
		m1.setTipo("deportiva");
		
		dao.insert(m1);*/
		
		
		
		List<Motocicleta> moto = dao.getAll();
		for(Motocicleta per: moto) {
			System.out.println(per);
		}
	}
	

}
