package MusicShop.services;

import java.util.List;

import MusicShop.entities.Article;

public interface ArticleService {
	List<Article> findAll();
	Article findOne(Long id);
	List<Article> findByName(String name);
}
