package MusicShop.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MusicShop.entities.ArticleCategory;
import MusicShop.repositories.ArticleCategoryRepository;
import MusicShop.services.ArticleCategoryService;

@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService{

	@Autowired
	private ArticleCategoryRepository articleCategoryRepository;
	
	@Override
	public List<ArticleCategory> findAll() {
		return articleCategoryRepository.findAll();
	}

	@Override
	public ArticleCategory findOne(Long id) {
		return articleCategoryRepository.findOne(id);
	}

	@Override
	public List<ArticleCategory> findByName(String name) {
		return articleCategoryRepository.findByName(name);
	}

}
