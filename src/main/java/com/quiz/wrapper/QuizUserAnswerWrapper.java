package com.quiz.wrapper;

import java.util.List;

import com.quiz.model.QuizUserAnswer;

/**
 * @author siddharth pandey
 *
 */
public class QuizUserAnswerWrapper {
	
	List<QuizUserAnswer> quizUserAnswer;

	/**
	 * @return
	 */
	public List<QuizUserAnswer> getQuizUserAnswer() {
		return quizUserAnswer;
	}

	/**
	 * @param quizUserAnswer
	 */
	public void setQuizUserAnswer(List<QuizUserAnswer> quizUserAnswer) {
		this.quizUserAnswer = quizUserAnswer;
	}

}
