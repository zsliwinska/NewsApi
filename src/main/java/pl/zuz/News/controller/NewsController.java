package pl.zuz.News.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zuz.News.service.NewsService;
import pl.zuz.News.webclient.news.dto.OpenNewsNewsDto;

@RestController
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/news")
    public OpenNewsNewsDto getNews(){
        return newsService.getNews();
    }

}
