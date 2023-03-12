package com.Api_test.API.todo;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.servlet.Servlet;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ToDoResource {
	@Autowired
	private todoHardcodedService todoserve;
	
	@PutMapping(path="user/update/{id}")
	public ResponseEntity<todo> update(@PathVariable long id,@RequestBody todo todo){
		todo todo1 =todoserve.save(todo);
		return new ResponseEntity<todo>(todo1,HttpStatus.OK);
	}
	@DeleteMapping(path="user/{id}")
	public ResponseEntity<Void> deleteTodoById(@PathVariable long id){
		todo responceFromDeliteByIdMethod= todoserve.deliteById(id);
		if(responceFromDeliteByIdMethod !=null)
		{
			return ResponseEntity.noContent().build();
		}else return ResponseEntity.notFound().build();
	}
	@GetMapping(path="user/todo/{id}")
	   public todo getFindbyid(@PathVariable long id){
		   return todoserve.findbyid(id);
	   }
	@PostMapping(path="user/post/newTodo")
	public ResponseEntity<Void> post(@RequestBody todo Todo) {
		todo TodoResponce=todoserve.save(Todo);
		 URI Uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(TodoResponce.getPrbId()).toUri();
	return ResponseEntity.created(Uri).build();
	}
	@GetMapping(path="user/{username}/todos")
   public List<todo> gatAllToDo(@PathVariable String username){
	   return todoserve.findall();}
   }


