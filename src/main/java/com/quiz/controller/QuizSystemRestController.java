package com.quiz.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.quiz.model.QuizQuestion;
import com.quiz.model.QuizUserAnswer;
import com.quiz.service.QuizSystemService;
import com.quiz.wrapper.QuizUserAnswerWrapper;

/**
 * @author siddharth pandey
 *
 */
@RestController
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.quiz.repository")
@ComponentScan(basePackages="com.quiz")
@EntityScan("com.quiz.*")
@CrossOrigin(allowedHeaders="*",origins="*")
public class QuizSystemRestController {
	
	@Autowired
	QuizSystemService quizSystemService;
	
	
	/**
	 * @return 
	 */
	@GetMapping("questions")
	public ResponseEntity<List<QuizQuestion>> getQuestionsOption() {
		System.out.println("Inside quiz controller");
		List<QuizQuestion> list = quizSystemService.getQuestionsOption();
		list.stream().map(obj -> {
			obj.setCorrect(null);
			obj.setSelected(null);
			return obj;
		}).collect(Collectors.toList());
		return new ResponseEntity<List<QuizQuestion>>(list, HttpStatus.OK);
	}
	
	/**
	 * @param quizUserAnswerWrapper
	 * @param ucBuilder
	 * @return
	 */
	@PostMapping("submitQuiz")
    public ResponseEntity<List<QuizUserAnswer>> submitQuiz(@RequestBody QuizUserAnswerWrapper quizUserAnswerWrapper, UriComponentsBuilder ucBuilder){
		List<QuizUserAnswer> quizUserAnswerDB = quizSystemService.submitQuiz(quizUserAnswerWrapper);
    	HttpHeaders headers = new HttpHeaders();
        if(quizUserAnswerDB != null) {
        return new ResponseEntity<List<QuizUserAnswer>>(quizUserAnswerDB,headers, HttpStatus.CREATED);
        }else {
        	return new ResponseEntity<List<QuizUserAnswer>>(HttpStatus.CONFLICT);
        }
    	
    }

}
