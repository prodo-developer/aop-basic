package com.aopcode.board;

import com.aopcode.aspect.SuperPerformance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService extends SuperPerformance<Board> {

    @Autowired
    private BoardRepository repository;

    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }
}
