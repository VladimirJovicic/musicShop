package MusicShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{
	List<Article> findByName(String name);
}
