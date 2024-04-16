package com.example.demoH;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.*;
@Service
public class FilmService {

	@Autowired
	private FilmRepository v;
	
	 public Page<Film> a2(Pageable pageable) {
	        return v.findAll(pageable);
	    }

	    public List<Film> a1() {
	        return v.findAll();
	    }


	    public Film a3(Film film) {
	        return v.save(film);
	    }

	    public Film a4(int id, Film film) {
	        Optional<Film> e1 = v.findById(id);
	        if (e1.isPresent()) {
	        	Film e2 = e1.get();
	            e2.setTitle(film.getTitle());
	            return v.save(e2);
	        } else {
	            return null;
	        }
	    }
	    public void a5(int id) {
			 v.deleteById(id);
		}
}
