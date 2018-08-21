package MusicShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MusicShop.services.ArticleCategoryService;

@RestController
@RequestMapping(value = "/article_category")
public class ArticleCategoryController {

	@Autowired
	private ArticleCategoryService articleCategoryService;
}
