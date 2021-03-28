package com.chenlei.graph.neo4j.controller;

import com.chenlei.graph.neo4j.model.Question;
import com.chenlei.graph.neo4j.service.TroubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ray
 * @date 2021/3/27 7:58 下午
 */
@RestController
@RequestMapping("/trouble")
public class TroubleController {
    @Resource
    TroubleService troubleService;

    @PostMapping("/1")
    @ResponseBody
    public String trouble(){
        return "trouble";
    }

    @PostMapping("/question")
    @ResponseBody
    public List<Question> getAllQuestions(){
       return troubleService.getAllQuestions();
    }

}
