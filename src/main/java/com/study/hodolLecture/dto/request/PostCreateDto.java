package com.study.hodolLecture.dto.request;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PostCreateDto {

    private String title;
    private String content;

    public PostCreateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
