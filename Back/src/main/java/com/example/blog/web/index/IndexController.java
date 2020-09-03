package com.example.blog.web.index;

import com.example.blog.NotException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller

public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id,@PathVariable String name){
       // int i=9/0;
//        String blog=null;
//        if(blog==null) throw new NotException("异常");
        System.out.println("------index-----");
        return  "index";
    }
}
