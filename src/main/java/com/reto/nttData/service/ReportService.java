package com.reto.nttData.service;

import com.reto.nttData.domain.dto.ReportDTO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface ReportService {
    List<ReportDTO> getReportByDateAndClient(Date initDate, Date endDate, String clientId);
}
