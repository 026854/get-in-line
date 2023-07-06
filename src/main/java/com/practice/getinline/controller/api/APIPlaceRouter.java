package com.practice.getinline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RequestPredicates.path;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class APIPlaceRouter {
    @Bean
    public RouterFunction<ServerResponse> placeRouter(APIPlaceHandler apiPlaceHandler){
        /*return route()
                .GET("/api/place",req-> ServerResponse.ok().body(List.of("place1","place2")))
                .GET("/api/place/{placeId}",req-> ServerResponse.ok().body("place " + req.pathVariable("placeId")))
                .build();*/

     /*   return route().nest(path("/api/place") , builder -> builder
                .GET("",req-> ServerResponse.ok().body(List.of("place1","place2")))
                .GET("/{placeId}",req-> ServerResponse.ok().body("place " + req.pathVariable("placeId")))
                ).build();*/

        return route().nest(path("/api/place") , builder -> builder
                .GET("",apiPlaceHandler::getPlaces)
                .GET("/{placeId}",apiPlaceHandler::createPlaces)
        ).build();

    }
}
