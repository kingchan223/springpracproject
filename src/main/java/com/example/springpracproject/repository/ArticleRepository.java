package com.example.springpracproject.repository;

import com.example.springpracproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// Jpa에서 제공하는 repository를 사용하기 위해 인터페이스로 만든다.
public interface ArticleRepository extends CrudRepository<Article,Long>{// <대상관리하에 놓일 엔티티, 그 엔티티의 대표값 타입>

}
