package com.boardproject.myrest.repository;

import com.boardproject.myrest.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository  extends JpaRepository<Board, Long> {
}
