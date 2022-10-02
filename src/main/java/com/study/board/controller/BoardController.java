package com.study.board.controller;

import com.study.board.entity.BoardEntity;
import com.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
//@RequestMapping("board/")
//@RequiredArgsConstructor
public class BoardController {

    @Autowired
    private BoardService boardService;
    @GetMapping("/board/write")
    public String boardWriteFrom() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(BoardEntity boardEntity){

        boardService.write(boardEntity);

        return "";
    }
}
