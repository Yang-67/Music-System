package com.mediocre.music.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mediocre.music.bean.Admin;
import com.mediocre.music.mapper.AdminMapper;
import com.mediocre.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService{

}
