package MusicShop.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MusicShop.entities.Article;
import MusicShop.repositories.ArticleRepository;
import MusicShop.services.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleRepository articleRepository;
	
	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article findOne(Long id) {
		return articleRepository.findOne(id);
	}

	@Override
	public List<Article> findByName(String name) {
		return articleRepository.findByName(name);
	}

}
