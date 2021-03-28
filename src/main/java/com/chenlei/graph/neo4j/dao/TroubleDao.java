package com.chenlei.graph.neo4j.dao;


import com.chenlei.graph.neo4j.model.Question;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ray
 * @date 2021/3/27 8:22 下午
 */
@Repository
public interface TroubleDao {

    List<Question> getAllQuestions();


}
