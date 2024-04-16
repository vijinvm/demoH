package com.example.demoH;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.*;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping
public class Controller1 {

	@Autowired
	private ActorService a;
	
	@Autowired
	private FilmService f;
	
	
	@GetMapping("/actor")
	public List<Actor>g1(){
		return a.g1();
		
		
	}
	@GetMapping("/actors/paged")
	public Page<Actor>g2(@RequestParam(defaultValue="0")int page,
			@RequestParam(defaultValue="10")int size,
			@RequestParam(defaultValue="id")String sortBy){
		Pageable pageable=PageRequest.of(page, size,Sort.by(sortBy));
		return a.g2(pageable);
	}
	@PostMapping("/actors")
	public Actor g3(@RequestBody Actor actor) {
		return a.g3(actor);
	}
	@PutMapping("/actors")
	public Actor g4(@PathVariable int id,@RequestBody Actor actor) {
		return a.g4(id,actor);
	}
	@DeleteMapping("/actors")
	public void g5(@PathVariable int id) {
		a.g5(id);
	}

	@GetMapping("/Film")
	public List<Film> a1(){
		return f.a1();
		
		
	}
	@GetMapping("/film/paged")
	public Page<Film>a2(@RequestParam(defaultValue="0")int page,
			@RequestParam(defaultValue="10")int size,
			@RequestParam(defaultValue="id")String sortBy){
		Pageable pageable=PageRequest.of(page, size,Sort.by(sortBy));
		return f.a2(pageable);
	}
	@PostMapping("/Film/post")

	public Film a3(@RequestBody Film film) {
		return f.a3(film);
	}
	@PutMapping("/Film")
	public Film a4(@PathVariable int id,@RequestBody Film film) {
		return f.a4(id,film);
	}
	@DeleteMapping("/Film")
	public void a5(@PathVariable int id) {
		f.a5(id);
	}
}
