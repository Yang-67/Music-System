package com.mediocre.music.serviceImpl;

import com.mediocre.music.bean.Admin;
import com.mediocre.music.mapper.AdminMapper;
import com.mediocre.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectList(null);
    }
}
