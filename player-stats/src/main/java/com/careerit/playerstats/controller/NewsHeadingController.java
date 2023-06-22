package com.careerit.playerstats.controller;

import com.careerit.playerstats.dto.NewsHeadingDto;
import com.careerit.playerstats.service.NewsHeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
public class NewsHeadingController {
      @Autowired
      private NewsHeadingService newsHeadingService;
        @GetMapping("/headings")
       public ResponseEntity<List<NewsHeadingDto>> getNewsHeads(@RequestParam(name = "country",required = false,defaultValue = "us") String country){
             return ResponseEntity.ok(newsHeadingService.getNewsHeadings(country));
       }

}
