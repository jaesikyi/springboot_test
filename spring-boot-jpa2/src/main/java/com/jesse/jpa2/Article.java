package com.jesse.jpa2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ZZTEMP_ARTICLES")
public class Article implements Serializable{

	private static final long serialVersionUID=1L;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ARTICLE_ID")
	private long articleId;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CATEGORY")
	private String category;

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
