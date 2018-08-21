package MusicShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MusicShop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	List<Category> findByName(String name);
}
