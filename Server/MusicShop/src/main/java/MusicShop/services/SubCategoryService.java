package MusicShop.services;

import java.util.List;

import MusicShop.entities.SubCategory;

public interface SubCategoryService {
	List<SubCategory> findAll();
	SubCategory findOne(Long id);
	List<SubCategory> findByName(String name);
}
