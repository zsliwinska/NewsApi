package pl.zuz.News.webclient.news.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Articles {

    @JsonProperty
    private String title;
    @JsonProperty
    private String author;
    @JsonProperty
    private String description;

   /* @JsonProperty
    private Source source;
    @JsonProperty
    private String url;
    @JsonProperty
    private String urlToImage;
    @JsonProperty
    private String publishedAt;
    @JsonProperty
    private String content; */

    public String toString(){
        return title +" : "+ author +" : "+ description+"\n";
    }

}
