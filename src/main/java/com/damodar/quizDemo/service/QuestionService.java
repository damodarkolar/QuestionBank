package com.damodar.quizDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.damodar.quizDemo.dao.QuestionDAO;
import com.damodar.quizDemo.entity.Question;

@Service
public class QuestionService {
	
	
	@Autowired
	QuestionDAO questionDao;

	public ResponseEntity<List<Question>> getAllQuestions() {
		
		try {
			return new ResponseEntity(questionDao.findAll(),HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity(questionDao.findAll(),HttpStatus.OK);
		
		
	}

	public ResponseEntity<Question> getQuestionById(Integer id) {
		
		try {
			return new ResponseEntity<>(questionDao.findById(id).get(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return new ResponseEntity<>(questionDao.findById(id).get(), HttpStatus.OK);
	}

	public ResponseEntity<String> saveQuestion(Question question){
		// TODO Auto-generated method stub
		
		
		try {
			questionDao.save(question);
		
		} catch (Exception e) {
			return new ResponseEntity<String>("Field missed", HttpStatus.BAD_REQUEST);
		}
		
		return new  ResponseEntity<String>("Success", HttpStatus.OK);
		
	}


	public ResponseEntity<String> deleteQuestion(Integer id) {
		// TODO Auto-generated method stub

		try {
			questionDao.deleteById(id);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK );
	}

	public ResponseEntity<Question> updateQuestion(Integer id, Question question) {
		// TODO Auto-generated method stub
		
		
		try {
			question.setId(id);
			questionDao.save(question);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Question>(new Question(), HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Question>(questionDao.findById(id).get(), HttpStatus.OK);
	}



}
