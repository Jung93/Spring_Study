package com.example.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class BoardControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

//    브라우저에서 URL을 요청한 것과 같은 환경을 구성해준다
    private MockMvc mockMvc;

    MultiValueMap<String, String> params;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        //이 방식도 괜찮지만 여기다가 할꺼면 전역으로 선언하는 게 낫다
        params = new LinkedMultiValueMap<>();
        params.add("boardTitle", "히히히히");
        params.add("boardContent", "하하하하하");
        params.add("boardNumber", "35");
    }

    @Test
    public void showList() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list")).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void writeTest() throws Exception{
      log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/write")).andReturn().getModelAndView().getViewName());
    }

    @Test
    public void readTest() throws Exception{
       log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/read").param("boardNumber","29")).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void updateTest() throws Exception{

//       log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/update").param("boardNumber","29").param("boardTitle","정재훈 테스트").param("boardContent","정재훈 테스트 내용")).andReturn().getModelAndView().getModelMap().toString());
       log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/update").params(params)).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void deleteTest() throws Exception{
       log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/delete").param("boardNumber","29")).andReturn().getModelAndView().getViewName());
    }

}
