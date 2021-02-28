package com.example.springpracproject.dto;

import com.example.springpracproject.entity.Article;

// dto가 폼 데이터를 받아올 그릇이된다.
// form에서 action, method를 통해 데이터를 날리면 그 데이터를 여기서 dto객체로 만들어서 그 객체를 컨트롤러에게 넘겨준다.
public class ArticleForm {
    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
