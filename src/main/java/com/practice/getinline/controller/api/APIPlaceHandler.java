package com.practice.getinline.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.created;
import static org.springframework.web.servlet.function.ServerResponse.ok;

//함수형 기반 설계시 맵핑 이외에 해야하는 func를 여기에서 정의
@Component
public class APIPlaceHandler {

    public ServerResponse getPlaces(ServerRequest request) throws Exception {
        return ok().body(List.of("place1","place2"));
    }
    public ServerResponse createPlaces(ServerRequest request) throws Exception {
        //request.pathVariable("placeId")
        //TODO:: 1은 구현할때 제대로
        return created(URI.create("/api/places/1")).body(true);
    }
}
