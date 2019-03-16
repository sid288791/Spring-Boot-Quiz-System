package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.QuizQuestion;

/**
 * @author siddharth pandey
 *
 */
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long>{

}
