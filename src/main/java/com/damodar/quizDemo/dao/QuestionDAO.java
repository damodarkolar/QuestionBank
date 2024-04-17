package com.damodar.quizDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damodar.quizDemo.entity.Question;


@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer>{
	
	
	@Modifying
    @Query("DELETE FROM Question q WHERE q.id = :id")
    void deleteById2(@Param("id") Integer id);
	
	
	

}
