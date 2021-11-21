/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author michael
 */
@RestController
@RequestMapping("/api/v1")
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
