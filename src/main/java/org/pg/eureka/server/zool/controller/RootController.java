package org.pg.eureka.server.zool.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RootController {

    @GetMapping
    public ResponseEntity<Map<String, String>> root(){
        return ResponseEntity.ok(new HashMap(){{put("message", "root controller");}});
    }

}
