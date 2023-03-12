package com.xjtu.xjtuse.assistance.SimilarWeb.impl;

import com.xjtu.xjtuse.assistance.SimilarWeb.SearchResult;
import com.xjtu.xjtuse.assistance.SimilarWeb.SimilarWebService;
import com.xjtu.xjtuse.assistance.SimilarWeb.dao.SimilarWebDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SimilarWebServiceImpl implements SimilarWebService {
    @Resource
    private SimilarWebDao similarWebDao;

    @Override
    public SearchResult getSimilarWebInfo(String url) {
        SearchResult searchResult = new SearchResult();
        searchResult.setInputUrl(url);
        searchResult.setSimilarWebInfoList(similarWebDao.getSimilarWebInfo(url));

        return searchResult;
    }
}
