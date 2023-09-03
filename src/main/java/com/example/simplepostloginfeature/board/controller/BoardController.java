package com.example.simplepostloginfeature.board.controller;


import com.example.simplepostloginfeature.board.dto.BoardRequestDto;
import com.example.simplepostloginfeature.board.dto.BoardResponseDto;
import com.example.simplepostloginfeature.board.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // Get
    // Get all
    @GetMapping("/board")
    public List<BoardResponseDto> boardList() {
        return null;
    }

    // Get single
    @GetMapping("/board/{id}")
    public BoardResponseDto boardDetail(@PathVariable Long id) {
        return null;
    }

    // Create -> authorization required (Request Header)
    @PostMapping("/board")
    public BoardResponseDto boardCreate(@RequestBody BoardRequestDto boardRequestDto) {
        return null;
    }

    // Update -> authorization required (Request Header)
    @PutMapping("/board/{id}")
    public BoardResponseDto boardUpdate(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto) {
        return null;
    }

    // Delete -> authorization required (Request Header)
    @DeleteMapping("/board/{id}")
    public BoardResponseDto boardDelete(@PathVariable Long id) {
        return null;
    }
}
