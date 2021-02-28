package com.example.springpracproject.controller;

import com.example.springpracproject.dto.ArticleForm;
import com.example.springpracproject.entity.Article;
import com.example.springpracproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 얘는 컨트롤러입니다~ 하고 선언.
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(Model model){
        model.addAttribute("nickname", "ChanLee");//view에 전달할 데이터를 key:valuer쌍으 전달가능
        return "articles/new"; // templates 파일을 기준으로 경로를 적어준다.
    }

    @PostMapping("/articles/create")// new머스테치에서 method=post로 설정했으므로 @PostMapping으로 매핑한다.
    // 작성자가 브라우저에서 데이터를 적고 post로 전송하면, dto/ArticleForm에서  dto객체로 변환시켜주고,
    // (이때 layouts/new머스테치에 name속성이 있고 그 key네임을 설정해야 dto에서 제대로 받을 수 있다.)
    // 여기 Controller에서 /articles/create로 매핑을 하고 메소드에서 dto객체(여기서는 ArticleForm form)을 받고, 처리한다.
    public String createArticles(ArticleForm form){//form에 title 데이터와 content데이터를 가지고 있다.
        System.out.println(form.toString());

        //컨트롤러에 받아온 dto객체를 db로 보내기.
        //-1.Dto를 Entity로 변환한다.
        Article article = form.toEntity(); // 엔티티로 변환. ArticleForm파일에 toEntity메서드를 정의해줘야한다.
        System.out.println(article.toString());
        //-2.Repository에게 Entity를 DB안에 저장하게 한다.
        Article saved = articleRepository.save(article); // articleRepository이 객체를 사용하기위해 필드에 선언해준다.(13라인)
        System.out.println(saved.toString());
        return "";
    }

}
