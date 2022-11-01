package com.example.ex02.controller;

import com.example.ex02.domain.vo.MemberVO;
import com.example.ex02.domain.vo.ProductVO;
import com.example.ex02.domain.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequestMapping("/ex/*")
public class ExampleController {

    @RequestMapping(value = "ex01", method = {RequestMethod.GET, RequestMethod.POST})
    public void ex01(){
        log.info("ex01...........");
    }

    @GetMapping("ex02")
    public void ex02(HttpServletRequest request){
        log.info("name: " + request.getParameter("name"));
    }

    @GetMapping("ex03")
    public void ex03(String name){
        log.info("name: " + name);
    }

    @GetMapping("ex04")
    public void ex04(MemberVO memberVO){
        log.info("member: " + memberVO);
    }

    @GetMapping("ex05")
    public void ex05(@RequestParam("id") String name, int age){
        log.info("name: " + name);
        log.info("age " + age);
    }

    @GetMapping("/ex06")
    public void ex06(MemberVO memberVO){
        log.info("ex06..............");
    }

    @GetMapping("ex07")
    public void ex07(@ModelAttribute("gender") String gender, MemberVO memberVO){
        log.info("ex07..............");
        log.info("memberVO: " + memberVO);
        log.info("gender: " + gender);
    }

    //외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
    //화면에서 4개의 정보 입력 후 form 태그로 전송한다.
    @GetMapping("ex08")
    public void ex08(ProductVO productVO){
        log.info("ex08......");
        log.info("productVO: " + productVO);
    }
    //    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math 선언
//    총점과 평균 점수 화면에 출력
    @GetMapping("/exam")
    public String exam(){
        return "ex/exam";
    }

    @PostMapping("/exam")
    public String exam(TaskVO taskVO, Model model){
        return "ex/result";
    }
//    [실습 3]
//    아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동
//    아이디가 user일 경우 user.html로 이동
//
//    - login.html : 아이디와 비밀번호 입력 페이지 출력
//    - admin.html : 관리자 페이지 출력
//    - user.html : 일반 회원 페이지 출력



    @GetMapping("/login")
    public String login(){
        return "ex/login";
    }

    @PostMapping("/login")
    public String login(String id){
        if(id.equals("admin")){
            return "ex/admin";
        }else{
            return "ex/user";
        }
    }
}










