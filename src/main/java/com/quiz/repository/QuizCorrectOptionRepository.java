package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.QuizCorrectOption;

/**
 * @author siddharth pandey
 *
 */
public interface QuizCorrectOptionRepository extends JpaRepository<QuizCorrectOption, Long>{

	/**
	 * @param questionId
	 * @return
	 */
	QuizCorrectOption findByQuestionId(Long questionId);

}
