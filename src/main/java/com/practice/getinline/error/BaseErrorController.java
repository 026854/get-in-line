package com.practice.getinline.error;

import com.practice.getinline.constant.ErrorCode;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class BaseErrorController implements ErrorController {

    @RequestMapping("/error")
    public ModelAndView error(HttpServletResponse response){

        HttpStatus httpStatus = HttpStatus.valueOf(response.getStatus());
        ErrorCode errorCode = httpStatus.is4xxClientError() ? ErrorCode.BAD_REQUEST : ErrorCode.INTERNAL_ERROR;


        return new ModelAndView(
                "error",
                Map.of(
                        "statusCode",httpStatus.value(),
                        "errorCode",errorCode,
                        "message",errorCode.getMessage(httpStatus.getReasonPhrase())
                ),
                httpStatus);
    }
}
