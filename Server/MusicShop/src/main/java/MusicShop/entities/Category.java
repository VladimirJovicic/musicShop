package MusicShop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * 
 * @author Vladimir
 *
 */


@Entity
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "category")
    private Set<SubCategory> subCategories = new HashSet<SubCategory>(0); 
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "category")
    private Set<ArticleCategory> articleCategories = new HashSet<ArticleCategory>(0);
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "category")
    private Set<Article> articles = new HashSet<Article>(0);
}
