package com.careerit.playerstats.service;

import com.careerit.playerstats.dto.NewsHeadingDto;
import com.fasterxml.jackson.core.type.TypeReference;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsHeadingService {

      @Value("${news.api.key}")
      private String apiKey;
      public List<NewsHeadingDto> getNewsHeadings(String country){
          String url = String.format("https://newsapi.org/v2/top-headlines?country=%s&apiKey=%s",country,apiKey);
          RestTemplate restTemplate = new RestTemplate();
          ResponseEntity<Map> res = restTemplate.getForEntity(url, Map.class);
          Map<String,Object> map = res.getBody();
          System.out.println(map);
          List<?> list = (List<?>) map.get("articles");
          List<NewsHeadingDto> newHadingList = new ArrayList<>();
          for(Object obj:list){
              LinkedHashMap<String,Object> linkedHashMap = (LinkedHashMap<String, Object>) obj;
              String title = (String)linkedHashMap.get("title");
              String description = (String)linkedHashMap.get("description");
              String urlToImage = (String)linkedHashMap.get("urlToImage");
              NewsHeadingDto newsHeadingDto = new NewsHeadingDto();
              newsHeadingDto.setTitle(title);
              newsHeadingDto.setDescription(description);
              newsHeadingDto.setUrlToImage(urlToImage);
              newHadingList.add(newsHeadingDto);
          }

          return newHadingList;
      }
}
