package com.quiz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quiz.model.QuizCorrectOption;
import com.quiz.model.QuizQuestion;
import com.quiz.model.QuizUserAnswer;
import com.quiz.repository.QuizCorrectOptionRepository;
import com.quiz.repository.QuizQuestionRepository;
import com.quiz.repository.QuizUserAnswerRepository;

/**
 * @author siddharth pandey
 *
 */
@Repository
public class QuizSystemDaoImpl implements QuizSystemDao{
	
	@Autowired
	QuizQuestionRepository quizQuestionRepository;
	
	@Autowired
	QuizCorrectOptionRepository quizCorrectOptionRepository;
	
	@Autowired
	QuizUserAnswerRepository quizUserAnswerRepository;

	
	/* (non-Javadoc)
	 * @see com.quiz.dao.QuizSystemDao#getQuestionsOption()
	 */
	@Override
	public List<QuizQuestion> getQuestionsOption() {
		System.out.println("In Dao layer of getQuestionsOption");
		List<QuizQuestion> li = quizQuestionRepository.findAll();
		return li;
	}


	/* (non-Javadoc)
	 * @see com.quiz.dao.QuizSystemDao#getQuizCorrectOption(java.lang.Long)
	 */
	@Override
	public QuizCorrectOption getQuizCorrectOption(Long questionId) {
		
		return quizCorrectOptionRepository.findByQuestionId(questionId);
	}



	/* (non-Javadoc)
	 * @see com.quiz.dao.QuizSystemDao#submitQuiz(java.util.List)
	 */
	@Override
	public List<QuizUserAnswer> submitQuiz(List<QuizUserAnswer> li) {
		return quizUserAnswerRepository.save(li);
	}


	/* (non-Javadoc)
	 * @see com.quiz.dao.QuizSystemDao#getCorrectOptions(java.lang.Long)
	 */
	@Override
	public QuizCorrectOption getCorrectOptions(Long correctOptionId) {
		
		return quizCorrectOptionRepository.findOne(correctOptionId);
	}

}
