package com.quiz.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author siddharth pandey
 *
 */
@Entity
@Table(name="quiz_correct_option")
public class QuizCorrectOption implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6099444033930891262L;
	
	@Id
	@Column(name = "correct_option_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long correctOptionId;
	
	@Column(name = "option_id")
	private Long optionId;
	
	@Column(name = "question_id")
	private Long questionId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "create_by")
	private String createBy;
	
	/**
	 * @return
	 */
	public Long getCorrectOptionId() {
		return correctOptionId;
	}

	/**
	 * @param correctOptionId
	 */
	public void setCorrectOptionId(Long correctOptionId) {
		this.correctOptionId = correctOptionId;
	}

	/**
	 * @return
	 */
	public Long getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId
	 */
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return
	 */
	public Long getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 */
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

}
