package com.xjtu.xjtuse.assistance.SimilarWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/similarWeb")
public class SimilarWebAPI {
    @Resource
    SimilarWebService similarWebService;

    /**
     * 检索给定url的相似网页
     *
     * @param url 待查找的URL
     * @return 查找结果
     */
    @GetMapping("getSimilarWebInfo")
    public SearchResult getSimilarWebInfo(@RequestParam String url, @RequestParam String color, @RequestParam String category) {
        System.out.println(url);
        System.out.println(color);
        System.out.println(category);
        return similarWebService.getSimilarWebInfo(url);
    }
}
