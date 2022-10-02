package com.study.board.controller;

import lombok.RequiredArgsConstructor;
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

    @GetMapping("/board/write")
    public String boardWriteFrom() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(String title, String content){
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + content);

        return "";
    }
}
