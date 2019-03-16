package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.QuizUserAnswer;

/**
 * @author siddharth pandey
 *
 */
public interface QuizUserAnswerRepository extends JpaRepository<QuizUserAnswer, Long>{

}
