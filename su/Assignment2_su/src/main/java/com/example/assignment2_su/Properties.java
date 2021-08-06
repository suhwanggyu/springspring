package com.example.assignment2_su;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.datasource")
public class Properties {
    public Properties() {
    }

    private String driverClassName;

    private String url;

    private String name;

    private String username;

    private String password;

    public Properties(String driverClassName, String url, String name, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "data='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



}
