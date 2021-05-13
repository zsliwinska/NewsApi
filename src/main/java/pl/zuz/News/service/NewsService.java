package pl.zuz.News.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.zuz.News.webclient.news.NewsClient;
import pl.zuz.News.webclient.news.dto.OpenNewsNewsDto;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsClient newsClient;

    public OpenNewsNewsDto getNews(){
       return newsClient.getNewsForCategories();

    }


}
