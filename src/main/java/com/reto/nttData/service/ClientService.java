package com.reto.nttData.service;

import com.reto.nttData.domain.dto.ClientDTO;
import com.reto.nttData.domain.dto.ReportDTO;

import java.util.Date;

public interface ClientService {
    ClientDTO createClient(ClientDTO clientDTO);
    ClientDTO getClient(String id);
    ClientDTO updateClient(ClientDTO clientDTO);
    Boolean deleteClient(String id);

}
