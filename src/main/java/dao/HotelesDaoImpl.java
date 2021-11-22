package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Hotel;

@Repository
public class HotelesDaoImpl implements HotelesDao {
	@Autowired
	HotelesJpaSpring hoteles;
	@Override
	public List<Hotel> devolverHoteles() {		
		return hoteles.findAll();
	} //Devuelve todos los hoteles tanto disponibles como no disponibles. Ese filtro para diferenciar lo haremos en la capa de servicio. Si fuesen más datos/registros quizás deberíamos hacerlo aquí

}
