package com.mediocre.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mediocre.music.bean.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
}
