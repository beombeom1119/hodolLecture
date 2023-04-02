package com.study.hodolLecture.controller;

import com.study.hodolLecture.dto.request.PostCreateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
public class PostController {


    @PostMapping("/posts")
    public String post(@RequestBody @Valid PostCreateDto postCreateDto)
    {
        log.info("params ={}", postCreateDto.toString());
        String title = postCreateDto.getTitle();
        String content = postCreateDto.getContent();
        return "Hello World";
    }



}
