package com.example.app.mapper;

import com.example.app.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void getListTest(){
     boardMapper.getList().stream().map(BoardVO::toString).forEach(log::info);
    }



    //추가, 수정, 삭제
    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("정재훈이 씀");
        boardVO.setBoardWriter("정재훈");
        boardVO.setBoardContent("정재훈이 썼습니다");
        boardMapper.insert(boardVO);
    }


    //수정
    @Test
    public void updateTest(){
        BoardVO boardVO = boardMapper.selectNumber(15L);
        boardVO.setBoardTitle("수현이 시험 대박");
        boardVO.setBoardContent("대박나세요");
        boardVO.setBoardNumber(15L);
        boardMapper.update(boardVO);
    }
    //삭제
    @Test
    public void deleteTest(){
        BoardVO boardVO = boardMapper.selectNumber(15L);

        boardMapper.delete(15L);
    }

}
