package com.xjtu.xjtuse.assistance.SimilarWeb.dao;

import com.xjtu.xjtuse.assistance.SimilarWeb.SimilarWebInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface SimilarWebDao {
    //    @Select("select * from similarwebinfo where source_url=#{url}")
    List<SimilarWebInfo> getSimilarWebInfo(String url);
}
