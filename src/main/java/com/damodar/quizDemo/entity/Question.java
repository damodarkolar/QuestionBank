package com.damodar.quizDemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String questionTitle;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String correctAnswer;
	private String correctOption;
	private String category;
	private String level;
	
	public Question() {
		
	}
	
	public Question(Integer id, String questionTitle, String optionA, String optionB, String optionC, String optionD,
			String correctAnswer, String correctOption, String category) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAnswer = correctAnswer;
		this.correctOption = correctOption;
		this.category = category;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getQuestionTitle() {
		return questionTitle;
	}



	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}



	public String getOptionA() {
		return optionA;
	}



	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}



	public String getOptionB() {
		return optionB;
	}



	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}



	public String getOptionC() {
		return optionC;
	}



	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}



	public String getOptionD() {
		return optionD;
	}



	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}



	public String getCorrectAnswer() {
		return correctAnswer;
	}



	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}



	public String getCorrectOption() {
		return correctOption;
	}



	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", questionTitle=" + questionTitle + ", optionA=" + optionA + ", optionB="
				+ optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctAnswer=" + correctAnswer
				+ ", correctOption=" + correctOption + ", category=" + category + "]";
	}

}
