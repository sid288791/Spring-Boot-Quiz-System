package com.quiz.service;

import java.util.List;

import com.quiz.model.QuizQuestion;
import com.quiz.model.QuizUserAnswer;
import com.quiz.wrapper.QuizUserAnswerWrapper;

/**
 * @author siddharth pandey
 *
 */
public interface QuizSystemService {
	

	/**
	 * @return
	 */
	public List<QuizQuestion> getQuestionsOption();


	/**
	 * @param quizUserAnswerWrapper
	 * @return
	 */
	List<QuizUserAnswer> submitQuiz(QuizUserAnswerWrapper quizUserAnswerWrapper);

}
