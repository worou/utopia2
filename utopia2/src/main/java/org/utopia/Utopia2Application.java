package org.utopia;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.utopia.dao.ArticleRepository;
import org.utopia.dao.AuteurRepository;
import org.utopia.entities.Article;
import org.utopia.entities.Auteur;

@SpringBootApplication
public class Utopia2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Utopia2Application.class, args);
		AuteurRepository auteurRepository = ctx.getBean(AuteurRepository.class);
		ArticleRepository articleRepository = ctx.getBean(ArticleRepository.class);

		Auteur auteur = auteurRepository.save(new Auteur("Simon", "Edouard", "simon@gmail.com"));
		Auteur auteur1 = auteurRepository.save(new Auteur("Dupond", "Romeo", "dupond@gmail.com"));
		Auteur auteur2 = auteurRepository.save(new Auteur("Antoine", "Sarah", "sarah@yahoo.com"));

		Article article = articleRepository.save(new Article("Article1","Texte sur Article1" , "https://fakeimg.pl/300/", new Date(), auteur1));
		Article article1 = articleRepository.save(new Article("Article2","Texte sur Article2" , "https://fakeimg.pl/300/", new Date(), auteur1));
		Article article2 = articleRepository.save(new Article("Article3","Texte sur Article3" , "https://fakeimg.pl/300/", new Date(), auteur2));
		Article article3 = articleRepository.save(new Article("Article4","Texte sur Article4" , "https://fakeimg.pl/300/", new Date(), auteur2));
		Article article4 = articleRepository.save(new Article("Article5","Texte sur Article5" , "https://fakeimg.pl/300/", new Date(), auteur2));
		Article article5 = articleRepository.save(new Article("Article6","Texte sur Article6" , "https://fakeimg.pl/300/", new Date(), auteur));

		
	}

}
