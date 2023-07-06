package com.practice.getinline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
//@RestController 를 사용하면 뷰를 찾는게 아니라 데이터 그대로를 내려보네준다.
@RestController
public class APIEventController {

    @GetMapping("/events")
    public List<String> getEvents(){
        return List.of("event1","event2");
    }

    @PostMapping("/events")
    public Boolean createEvent() {
        return true;
    }

    @GetMapping("/events/{eventsId}")
    public String getEvent(@PathVariable Integer eventsId){
        return "event " + eventsId;
    }

    @PutMapping("/events/{eventsId}")
    public Boolean modifyEvent(@PathVariable Integer eventsId){
        return true;
    }
    @DeleteMapping("/events/{eventsId}")
    public Boolean deleteEvent(@PathVariable Integer eventsId){
        return true;
    }
}
