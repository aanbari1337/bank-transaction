package com.aanbari.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){

        return builder.routes()
                .route(predicateSpec ->
                        predicateSpec
                                .path("/get")
                                .uri("http://httpbin.org:80"))
                .route(predicateSpec ->
                        predicateSpec
                                .path("/transaction-service")
                                .uri("lb://transaction-service"))
                .route(predicateSpec ->
                        predicateSpec
                                .path("/user-service")
                                .uri("lb://user-service"))
                .build();
    }
}
