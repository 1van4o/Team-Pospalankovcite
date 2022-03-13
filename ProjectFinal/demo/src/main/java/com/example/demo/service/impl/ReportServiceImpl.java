package com.example.demo.service.impl;

import com.example.demo.dto.ReportDto;
import com.example.demo.entity.Report;
import com.example.demo.mapper.ReportMapper;
import com.example.demo.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private EntityManager entityManager;
    @Override
    @Transactional
    public ReportDto save(ReportDto dto) {
        Report report = ReportMapper.toReport(dto);
        entityManager.persist(report);
        entityManager.flush();
        return dto;
    }

    @Override
    public List<ReportDto> getAll() {
        Query query = entityManager.createNamedQuery("Reports.getAll");
        List<Report> reports = query.getResultList();
        return ReportMapper.toDtos(reports);
    }

    @Override
    public List<ReportDto> getAllDecrypted() {
        Query query = entityManager.createNamedQuery("Reports.getAll");
        List<Report> reports = query.getResultList();
        return ReportMapper.toDecryptedDtos(reports);
    }


}
