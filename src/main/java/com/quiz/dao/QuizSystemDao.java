package com.quiz.dao;

import java.util.List;

import com.quiz.model.QuizCorrectOption;
import com.quiz.model.QuizQuestion;
import com.quiz.model.QuizUserAnswer;

/**
 * @author siddharth pandey
 *
 */
public interface QuizSystemDao {
	
	
	public List<QuizQuestion> getQuestionsOption();

	public QuizCorrectOption getQuizCorrectOption(Long questionId);

	public List<QuizUserAnswer> submitQuiz(List<QuizUserAnswer> li);

	public QuizCorrectOption getCorrectOptions(Long correctOptionId);

}
