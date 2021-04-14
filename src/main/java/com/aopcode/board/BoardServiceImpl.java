package com.aopcode.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository repository;

    @Override
    public List<Board> getBoards() {
        return repository.findAll();
    }
}
