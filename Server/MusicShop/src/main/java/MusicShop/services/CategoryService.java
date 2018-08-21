package MusicShop.services;

import java.util.List;

import MusicShop.entities.Category;

public interface CategoryService {
	List<Category> findAll();
	Category findOne(Long id);
	List<Category> findByName(String name);
}
