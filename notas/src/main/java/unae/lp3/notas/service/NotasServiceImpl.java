package unae.lp3.notas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unae.lp3.notas.model.Nota;
import unae.lp3.notas.repository.NotasRepository;
@Service
public class NotasServiceImpl implements INotasService {
	@Autowired
	public NotasRepository  notarepo;
	
	@Override
	public List<Nota> getNotas() {
		// TODO Auto-generated method stub
		List<Nota> lista= (List<Nota>) notarepo.findAll();
		return lista;
	}

	@Override
	public Nota getNota(int notaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertNota(Nota nota) {
		// TODO Auto-generated method stub
		notarepo.save(nota);

	}

	@Override
	public Nota saveNota(Nota nota) {
		// TODO Auto-generated method stub
		return null;
	}

}
