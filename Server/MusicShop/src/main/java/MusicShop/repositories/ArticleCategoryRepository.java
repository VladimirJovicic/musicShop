package MusicShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.ArticleCategory;

public interface ArticleCategoryRepository extends JpaRepository<ArticleCategory, Long>{
	List<ArticleCategory> findByName(String name);
}
