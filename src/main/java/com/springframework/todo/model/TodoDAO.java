package com.springframework.todo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoDAO {
	public static List<Todo> getTodos() {
		
		List<Todo> todos = new ArrayList<Todo>();
		Date date = new Date();
		todos.add(new Todo(1, "admin", "Learn Spring MVC", date,
				false));
		todos.add(new Todo(2, "admin", "Learn Struts", date, false));
		todos.add(new Todo(3, "admin", "Learn Hibernate", date,
				false));
		return todos;

}
}
