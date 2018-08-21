package MusicShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long>{
	List<SubCategory>findByName(String name);
}
