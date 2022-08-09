package com.boardproject.myrest.repository;

import com.boardproject.myrest.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface BoardRepository  extends JpaRepository<Board, Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content );

    Page<Board> findByTitleContainingOrContentContaining(String title, String Content, Pageable pageable);

}
