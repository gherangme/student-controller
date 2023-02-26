package com.cybersoft.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @Controller: cho phép định nghĩa đường dẫn và thường là trả ra file giao diện
    @ResponseBody: chỉ trả ra String
    @RestController: @Controller + @ResponseBody cho phép định nghĩa đường dẫn luôn luôn trả ra String

    Hoạt động: quét hết toàn bộ project lấy từ demo spring boot làm cha
    và quét theo thứ tự lùi lại 1 cấp quét hết các file nếu có cấu hình sẽ
    chạy cấu hình, rồi quét bean, cuối cùng quét các package cùng cấp

    Abstract, implement: tại sao sài abstract mà k sài implement
    - abstract: xử lý logic code được implement thì không
    - abstract: chỉ kế thừa 1 object, implement kế thừa được nhiều object

    /demo
    /demo/hello
    /demo/detail

    /user
    /user/signin
    /user/signup
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("")
    public String demo() {
        return "Hello demo";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello hello";
    }

    @GetMapping("/detail")
    public String detail() {
        return "Hello detail";
    }

}
