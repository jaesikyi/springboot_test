package com.jesse.jpa2;

import java.util.List;

public interface IArticleService {
	List<Article> getAllArticles();
	void addArticle(Article article);
}
