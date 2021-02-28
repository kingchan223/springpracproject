package com.example.springpracproject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 엔티티로 인식하게 해준다.
public class Article {

    @Id // 대표값을 지정해준다. 다른 곳에 같은 이름의 title,content등이 있을 수 있으므로 주번처럼 구분하는데 사용.
    @GeneratedValue// ID값을 자동으로 지정해준다.
    private Long id;

    @Column// DB에 요 title컬럼으로 인식하게 해준다.
    private String title;
    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article() {

    }


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
