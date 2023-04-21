package com.reto.nttData.controller;

import com.reto.nttData.domain.dto.ReportDTO;
import com.reto.nttData.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reportes")
public class ReportController {

    private final ReportService reportService;
    @GetMapping
    public ResponseEntity<List<ReportDTO>> getReportByClient(@RequestParam("initDate") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date initDate,
                                                             @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endDate,
                                                             @RequestParam String clientId){
        return ResponseEntity.ok(reportService.getReportByDateAndClient(initDate, endDate, clientId));
    }
}
