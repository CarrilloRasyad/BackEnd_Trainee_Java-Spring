package com.example.async.spring_boot_async.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUser {
    private String login;
    private String url;
    private String name;
}
