package MusicShop.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MusicShop.entities.SubCategory;
import MusicShop.repositories.SubCategoryRepository;
import MusicShop.services.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	@Override
	public List<SubCategory> findAll() {
		return subCategoryRepository.findAll();
	}

	@Override
	public SubCategory findOne(Long id) {
		return subCategoryRepository.findOne(id);
	}

	@Override
	public List<SubCategory> findByName(String name) {
		return subCategoryRepository.findByName(name);
	}

}
