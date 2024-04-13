package com.ricky.rickyapi.client.sdk;

import com.ricky.rickyapi.client.sdk.client.RickyApiClient;
import com.ricky.rickyapi.client.sdk.model.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("rickyapi.client")
@Data
@ComponentScan
public class RickyApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public RickyApiClient rickyApiClient(){
        return new RickyApiClient(accessKey,secretKey);
    }
}
