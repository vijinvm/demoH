package com.example.demoH;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;


import org.springframework.stereotype.*;
@Service
public class ActorService {

	@Autowired
	private ActorRepository u;
	
	 public Page<Actor> g2(Pageable pageable) {
	        return u.findAll(pageable);
	    }

	    public List<Actor> g1() {
	        return u.findAll();
	    }


	    public Actor g3(Actor actor) {
	        return u.save(actor);
	    }

	    public Actor g4(int id, Actor actor) {
	        Optional<Actor> a1 = u.findById(id);
	        if (a1.isPresent()) {
	        	Actor a2 = a1.get();
	            a2.setName(actor.getName());
	            return u.save(a2);
	        } else {
	            return null;
	        }
	    }
	public void g5(int id) {
		 u.deleteById(id);
	}
}
