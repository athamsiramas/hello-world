package com.amnart;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
class HelloRestController {

    @Value("${service.version}")
    String version;

    @RequestMapping("/hello/{name}")
    public String helloDocker(@PathVariable(value = "name") String name) {
        JSONObject response = new JSONObject();
        response.put("message", "Hello " + name + " Response received on : " + new Date());
        response.put("version", version);
        return response.toString();
    }
}
