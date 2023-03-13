package com.Api_test.API.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;
@Service
public class todoHardcodedService {

	private static List<todo> todos=new ArrayList<todo>();
	static long idcounter=0;
	static{
		todos.add(new todo(++idcounter, "jaswanth","learning Spring", false, new Date()));
		todos.add(new todo(++idcounter, "jaswant3", "Learning angular",false, new Date()));
		todos.add(new todo(++idcounter, "jaswanth","Learning vscode", false, new Date()));
		todos.add(new todo(++idcounter, "jaswanth","learning java", false, new Date()));
		todos.add(new todo(++idcounter, "jaswanth", "learning bootstrap",false, new Date()));
	}
	public List<todo> findall() {
		return todos;
	}
	
	public todo save(todo todo) {
		if(todo.getPrbId()==-1) {
			todo.setPrbId(++idcounter);
			todos.add(todo);
		}else {
			deliteById(todo.getPrbId());
			todos.add(todo);
		}return todo;
		
	}
	public todo deliteById(long id) {
		todo IfGetMatchedReturnedValue= findbyid(id);
		todos.remove( IfGetMatchedReturnedValue);
		return  IfGetMatchedReturnedValue;
	}
	public todo findbyid(long id) {
		for(todo todoClassReffrence:todos) {
			if(todoClassReffrence.getPrbId()==id) {
				return todoClassReffrence;
			}}return null;}
	
	
}
