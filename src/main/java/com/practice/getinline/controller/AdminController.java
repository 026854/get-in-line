package com.practice.getinline.controller;

import com.practice.getinline.constant.PlaceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public ModelAndView adminPlaces (
            PlaceType placeType,
            String placeName,
            String address
    ){//requestParam 이없어도 동작 but, requestParam은 required=true 가 기본값임

        Map<String , Object> map = new HashMap<>();
        map.put("placeType", placeType);
        map.put("placeName", placeName);
        map.put("adress", address);
        return new ModelAndView("admin/places", map);
    }

    @GetMapping("/places/{placeId}")
    public String adminPlacesDetail (@PathVariable Integer placeId){
        return "admin/place-detail";
    }

    @GetMapping("/events")
    public String adminEvents (){
        return "admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail (@PathVariable Integer eventId){
        return "admin/event-detail";
    }

}
