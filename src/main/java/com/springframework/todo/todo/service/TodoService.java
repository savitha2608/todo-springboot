package com.springframework.todo.todo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springframework.todo.model.*;

@Service
public class TodoService {
	private static List<Todo> todos = TodoDAO.getTodos();
	private static int todoCount = 3;

	public List<Todo> retrieveTodos(String user) {
		/*List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}*/
		
		List<Todo> filteredTodos = todos
										.stream()
										.filter(item -> item.getUser().equals(user))
										//.peek(s -> System.out.println("User is checked"))
										.collect(Collectors.toList());    
		
		return filteredTodos;
	}

	public Todo retrieveTodo(int id) {
		/*for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}*/
		
		Optional<Todo> todo = todos
									.stream()
									.filter(item -> item.getId()==id)
									.peek(s -> System.out.println(s))
									.findFirst();
		
		
		return todo.orElse(null);
	}

	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

	public void addTodo(String name, String desc, Date targetDate,
			boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		/*Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}*/
		
		List<Todo> operatedList = todos
										.stream()
										.filter(item -> item.getId()==id)
										//.peek(s -> System.out.println(s))
										.collect(Collectors.toList());    
			
		
		todos.removeAll(operatedList);
	}
	
	

}