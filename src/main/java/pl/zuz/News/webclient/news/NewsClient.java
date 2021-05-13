package pl.zuz.News.webclient.news;

import lombok.SneakyThrows;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.zuz.News.webclient.news.dto.Articles;
import pl.zuz.News.webclient.news.dto.OpenNewsNewsDto;

import java.io.*;


@Component
public class NewsClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private  static  final String URL = "https://newsapi.org/v2/top-headlines?country=pl&apiKey=f26860a62e914c708ed01c0988f79e2f&category=business";


    public OpenNewsNewsDto getNewsForCategories() {

        ResponseEntity<OpenNewsNewsDto> result = restTemplate.exchange(URL, HttpMethod.GET, null,
                    OpenNewsNewsDto.class);

        OpenNewsNewsDto openNewsNewsDto = result.getBody();
        Articles[] articles = openNewsNewsDto.getArticles();

        NewsClient newsClient = new NewsClient();
        newsClient.WriteObjectToFile(articles);

        return openNewsNewsDto;

    }


    @SneakyThrows
    public void WriteObjectToFile(Object[] obj) {

            FileWriter writer = new FileWriter("news.txt");

            int len = obj.length;
            for (int i = 0; i < len; i++) {
                writer.write(obj[i] + " "+ "\n");
            }
            writer.close();
    }
}
