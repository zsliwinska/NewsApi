package pl.zuz.News.webclient.news.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Stream;

@Getter
public class OpenNewsNewsDto {
    @JsonProperty
    private Articles[] articles;
    /*@JsonProperty
    private String status;
    @JsonProperty
    private int totalResults; */

    public Stream<Articles> saveArticles(){
        return Arrays.stream(articles);
    }
}
