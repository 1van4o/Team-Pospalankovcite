package com.example.demo.controller;

import com.example.demo.dto.ReportDto;
import com.example.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/astronaut/message")
public class ReportController {
    @Autowired
    ReportService reportService;

    @GetMapping(value = "/all")
    public List<ReportDto> getAllReports(){
        return reportService.getAll();
    }

    @PostMapping(value = "/save")
    public ReportDto save(@RequestBody ReportDto dto){
        return reportService.save(dto);
    }

    @GetMapping(value = "/allDecrypted")
    public List<ReportDto> getAllDecrypted(){
        return reportService.getAllDecrypted();
    }
}
