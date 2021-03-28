package com.chenlei.graph.neo4j.service;

import com.chenlei.graph.neo4j.model.Question;

import java.util.List;

/**
 * @author ray
 * @date 2021/3/27 8:21 下午
 */
public interface TroubleService {
    List<Question> getAllQuestions();
}
