package com.example.simplepostloginfeature.board.service;

import com.example.simplepostloginfeature.board.dto.BoardResponseDto;
import com.example.simplepostloginfeature.board.entity.Board;
import com.example.simplepostloginfeature.board.repository.BoardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // Find all
    public List<BoardResponseDto> boardList() {
        return null;
    }

    // Find one
    public BoardResponseDto boardDetail(Long id) {
        return null;
    }

    // Create -> authorization required (Request Header)
    public BoardResponseDto boardCreate(Long id) {
        return null;
    }

    // Update -> authorization required (Request Header)
    @Transactional
    public BoardResponseDto boardUpdate(Long id) {
        return null;
    }

    // Delete -> authorization required (Request Header)
    public BoardResponseDto boardDelete(Long id) {
        return null;
    }

    // Find board by id
    private Board findBoard(Long id) {
        return null;
    }
}
