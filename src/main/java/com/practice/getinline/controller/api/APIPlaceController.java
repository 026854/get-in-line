package com.practice.getinline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
//@RestController 를 사용하면 뷰를 찾는게 아니라 데이터 그대로를 내려보네준다.
@RestController
public class APIPlaceController {

    @GetMapping("/place")
    public List<String> getPlaces(){
        return List.of("place1","place2");
    }

    @PostMapping("/place")
    public Boolean createPlace() {
        return true;
    }

    @GetMapping("/place/{placeId}")
    public String getPlace(@PathVariable Integer placeId){
        return "place " + placeId;
    }

    @PutMapping("/place/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId){
        return true;
    }
    @DeleteMapping("/place/{placeId}")
    public Boolean deletePlace(@PathVariable Integer placeId){
        return true;
    }
}
