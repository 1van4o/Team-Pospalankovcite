package com.example.demo.service;

import com.example.demo.dto.ReportDto;

import java.util.List;

public interface ReportService {
    ReportDto save(ReportDto dto);

    List<ReportDto> getAll();
    List<ReportDto> getAllDecrypted();
}
