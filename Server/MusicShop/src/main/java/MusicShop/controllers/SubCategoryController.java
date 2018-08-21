package MusicShop.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MusicShop.entities.SubCategory;
import MusicShop.services.SubCategoryService;

@RestController
@RequestMapping(value = "/sub_category")
public class SubCategoryController {

	@Autowired
	private SubCategoryService subCategoryService;

}
