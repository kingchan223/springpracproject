package com.example.springpracproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 얘는 컨트롤러입니다~ 하고 선언.
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "ChanLee");//view에 전달할 데이터를 key:valuer쌍으 전달가능
        return "greeting";// 머스테치 파일이름만 적어준다. => 스프링이 templates/greeting.mustache로 알아서 찾아준다.
    }
}
