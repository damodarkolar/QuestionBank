package com.damodar.quizDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damodar.quizDemo.entity.Question;
import com.damodar.quizDemo.service.QuestionService;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("question")
public class QuestionController {
	
	
	@Autowired
	QuestionService questionService;

	@GetMapping("getAllQuestions")
	public ResponseEntity<List<Question>> getAllQuestions(){
		
		return questionService.getAllQuestions();
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Question> getQuestionById (@PathVariable Integer id) {
		
		
		return questionService.getQuestionById(id);
		
	}
	
	@PostMapping("/addQuestion")
	public ResponseEntity<String> saveQuestion(@RequestBody Question question) {
//		System.out.println(question);
		
		
		return questionService.saveQuestion(question);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable Integer id) {
		
		
		return questionService.deleteQuestion(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Question> updateQuestion(@PathVariable Integer id, @RequestBody Question question){
		return questionService.updateQuestion(id, question);
	}
	
//	
//	public ResponseEntity<Question> updateQuestionFields(){
//		
//		return 
//	}
	
	
	
}
