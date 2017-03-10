package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eric on 3/9/17.
 */
@Controller
public class GifController {
    @RequestMapping("/")
    @ResponseBody
    public String listGifs() {
        return "Don't be a dildo.";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String getGif() {
        return "Why you gotta be a dildo?";
    }
}
