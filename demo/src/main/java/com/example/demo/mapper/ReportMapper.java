package com.example.demo.mapper;

import com.example.demo.dto.ReportDto;
import com.example.demo.entity.Report;
import com.example.demo.service.MessageService;
import com.example.demo.service.impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ReportMapper {
    static MessageService messageService = new MessageServiceImpl();
    public static ReportDto toDto(Report report){
        return new ReportDto(report.getObject(), report.getDescription());
    }

    public static List<ReportDto> toDtos(List<Report> reports){
        List<ReportDto> list = new ArrayList<>();
        for (Report report: reports){
            list.add(toDto(report));
        }
        return list;
    }

    public static Report toReport(ReportDto dto){
        return new Report(null, messageService.encrypt(dto.getObject()), messageService.encrypt(dto.getDescription()));
    }

    public static ReportDto toDecryptedDto(Report entity){
        return new ReportDto(messageService.decrypt(entity.getObject()), messageService.decrypt(entity.getDescription()));
    }

    public static List<ReportDto> toDecryptedDtos(List<Report> reports){
        List<ReportDto> list = new ArrayList<>();
        for (Report report: reports){
            list.add(toDecryptedDto(report));
        }
        return list;
    }
}
