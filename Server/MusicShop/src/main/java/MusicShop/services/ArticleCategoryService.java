package MusicShop.services;

import java.util.List;

import MusicShop.entities.ArticleCategory;

public interface ArticleCategoryService {
	List<ArticleCategory> findAll();
	ArticleCategory findOne(Long id);
	List<ArticleCategory> findByName(String name);
}
