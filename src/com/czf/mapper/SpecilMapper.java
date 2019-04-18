package com.czf.mapper;

import com.czf.po.Specil;

import java.util.List;
import java.util.Map;

public interface SpecilMapper {
    List<Specil> findSpecilSplit(Map<String,Object> map);
}
