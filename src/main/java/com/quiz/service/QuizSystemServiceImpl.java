package com.quiz.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuizSystemDao;
import com.quiz.model.QuizCorrectOption;
import com.quiz.model.QuizQuestion;
import com.quiz.model.QuizUserAnswer;
import com.quiz.wrapper.QuizUserAnswerWrapper;

/**
 * @author siddharth pandey
 *
 */
@Service
public class QuizSystemServiceImpl implements QuizSystemService {

	@Autowired
	QuizSystemDao quizSystemDao;

	

	/* (non-Javadoc)
	 * @see com.quiz.service.QuizSystemService#getQuestionsOption()
	 */
	@Override
	public List<QuizQuestion> getQuestionsOption() {
		
		return quizSystemDao.getQuestionsOption();
	}



	/* (non-Javadoc)
	 * @see com.quiz.service.QuizSystemService#submitQuiz(com.quiz.service.QuizUserAnswerWrapper)
	 */
	@Override
	public List<QuizUserAnswer> submitQuiz(QuizUserAnswerWrapper quizUserAnswerWrapper) {
		List<QuizUserAnswer> quizUserAnswer = quizUserAnswerWrapper.getQuizUserAnswer();
		quizUserAnswer.stream().map(obj ->{
			QuizCorrectOption quizCorrectOption = quizSystemDao.getQuizCorrectOption(obj.getQuestionId());
			obj.setCorrectOptionId(quizCorrectOption.getCorrectOptionId());
			obj.setCreateDate(new Date());
			obj.setCreateBy("Test");
			return obj;
		}).collect(Collectors.toList());
		
		
		return getCorrectOptions(quizSystemDao.submitQuiz(quizUserAnswer));
	}
	
	/**
	 * @param quizUserAnswer
	 * @return
	 */
	private List<QuizUserAnswer> getCorrectOptions(List<QuizUserAnswer> quizUserAnswer ){
		quizUserAnswer.stream().map(object -> {
			QuizCorrectOption quizCorrectOption = quizSystemDao.getCorrectOptions(object.getCorrectOptionId());
			object.setCorrectVal(quizCorrectOption.getOptionId());
			return object;
		}).collect(Collectors.toList());
		return quizUserAnswer;
		
	}

}
