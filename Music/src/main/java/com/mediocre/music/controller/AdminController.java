package com.mediocre.music.controller;

import com.mediocre.music.bean.Admin;
import com.mediocre.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@ResponseBody
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/admin/login/status")
    public List<Admin> selectAll(@RequestBody Admin admin) {
        System.out.println(admin.toString());
        return adminService.selectAll();
    }
}
