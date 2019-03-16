package com.quiz.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author siddharth pandey
 *
 */
@Entity
@Table(name="quiz_question")
public class QuizQuestion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4928299449354276714L;
	
	@Id
	@Column(name = "question_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long questionId;
	
	@Column(name = "question_desc")
	private String questionDesc;
	
	@Column(name = "status_flag")
	private String statusFlag;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "create_by")
	private String createBy;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "question_id")
	private List<QuizOption> quizOption;
	
	@Transient 
	private String selected;
	
	@Transient 
	private String correct;

	/**
	 * @return
	 */
	public List<QuizOption> getQuizOption() {
		return quizOption;
	}

	/**
	 * @param quizOption
	 */
	public void setQuizOption(List<QuizOption> quizOption) {
		this.quizOption = quizOption;
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
	public String getQuestionDesc() {
		return questionDesc;
	}

	/**
	 * @param questionDesc
	 */
	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
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

	/**
	 * @return
	 */
	public String getSelected() {
		return selected;
	}

	/**
	 * @param selected
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}

	/**
	 * @return
	 */
	public String getCorrect() {
		return correct;
	}

	/**
	 * @param correct
	 */
	public void setCorrect(String correct) {
		this.correct = correct;
	}

}
