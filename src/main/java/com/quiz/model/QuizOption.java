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
@Table(name="quiz_option")
public class QuizOption implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7910769797326321412L;
	
	@Id
	@Column(name = "option_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long optionId;
	
	@Column(name = "option_desc")
	private String optionDesc;
	
	@Column(name = "question_id")
	private Long questionId;
	
	@Column(name = "status_flag")
	private String statusFlag;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "create_by")
	private String createBy;

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
	public String getOptionDesc() {
		return optionDesc;
	}

	/**
	 * @param optionDesc
	 */
	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
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
	public String getStatusFlag() {
		return statusFlag;
	}

	/**
	 * @param statusFlag
	 */
	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
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
