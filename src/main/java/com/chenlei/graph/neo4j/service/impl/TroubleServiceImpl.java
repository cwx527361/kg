package com.chenlei.graph.neo4j.service.impl;

import com.chenlei.graph.neo4j.dao.TroubleDao;
import com.chenlei.graph.neo4j.model.Question;
import com.chenlei.graph.neo4j.service.TroubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ray
 * @date 2021/3/27 8:22 下午
 */
@Service
public class TroubleServiceImpl implements TroubleService {
    @Autowired
    TroubleDao troubleDao;

    @Override
    public List<Question> getAllQuestions() {
        return troubleDao.getAllQuestions();
    }
}
