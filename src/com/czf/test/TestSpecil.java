package com.czf.test;


import com.czf.mapper.SpecilMapper;
import com.czf.po.Specil;
import com.czf.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSpecil {
    public static void main(String[] args){
        SqlSession sqlSeeion = MybatisUtils.getSqlSession(false);
        int pageNum=1;
        int pageSize=5;
        int start=(pageNum-1)*pageSize;
        SpecilMapper specilMapper = sqlSeeion.getMapper(SpecilMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);

        List<Specil> specilList = specilMapper.findSpecilSplit(map);

        for (Specil specil : specilList){
            System.out.println(specil);
        }
        MybatisUtils.closeSqlSession(sqlSeeion);
    }
}
