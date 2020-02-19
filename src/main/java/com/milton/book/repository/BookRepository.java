package com.milton.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milton.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findByTitleLike(String title);
	Book findBytitle(String name);
}
