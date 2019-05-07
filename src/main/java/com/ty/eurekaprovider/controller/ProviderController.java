package com.ty.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/firstCall")
    public String firstCall(@RequestParam("name") String name) {
        String services = "Services: " + discoveryClient.getServices();
        String result = "帅气的" + name + "正在调用" + services;
        System.out.println(result);
        return result;
    }

}
