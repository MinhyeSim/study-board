package com.study.board.service;

import com.study.board.entity.BoardEntity;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(BoardEntity boardEntity){
        boardRepository.save(boardEntity);

    }
}
