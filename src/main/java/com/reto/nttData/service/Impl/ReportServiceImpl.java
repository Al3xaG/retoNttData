package com.reto.nttData.service.Impl;

import com.reto.nttData.domain.dto.ReportDTO;
import com.reto.nttData.repository.ClientRepository;
import com.reto.nttData.repository.TransactionRepository;
import com.reto.nttData.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final TransactionRepository transactionRepository;
    @Override
    public List<ReportDTO> getReportByDateAndClient(Date initDate, Date endDate, String clientId) {
        List<Object[]> objects = transactionRepository.findAllTransactionByDate(initDate, endDate, Long.valueOf(clientId));
        List<ReportDTO> reportDTOS = new ArrayList<>();
        objects.forEach(object -> {
            reportDTOS.add(ReportDTO.builder()
                            .date((Date)object[0])
                            .client((String) object[1])
                            .numberAccount((String) object[2])
                            .typeAccount((String) object[3])
                            .initialBalance((Double) object[5] - (Double) object[6])
                            .status((Boolean) object[4])
                            .amount((Double) object[6])
                            .availableBalance((Double) object[5])
                    .build());
        });

        return reportDTOS;
    }
}
