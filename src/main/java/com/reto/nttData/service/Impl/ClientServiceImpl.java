package com.reto.nttData.service.Impl;

import com.reto.nttData.domain.dto.AccountDTO;
import com.reto.nttData.domain.dto.ClientDTO;
import com.reto.nttData.domain.entities.Account;
import com.reto.nttData.domain.entities.Client;
import com.reto.nttData.exceptions.NotFoundException;
import com.reto.nttData.repository.ClientRepository;
import com.reto.nttData.service.ClientService;
import com.reto.nttData.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = clientRepository.save(convertDTOtoEntity(clientDTO));
        return convertEntityToDTO(client);
    }

    @Override
    public ClientDTO getClient(String id) {
        return convertEntityToDTO(clientRepository.findByClientId(Long.valueOf(id)));
    }

    @Override
    public ClientDTO updateClient(ClientDTO clientDTO) {
        Optional<Client> optional = clientRepository.findById(Long.valueOf(clientDTO.getClientId()));
        if (!optional.isPresent()){
            throw  new NotFoundException("Cliente no existe");
        }
        Client client = clientRepository.save(convertDTOtoEntity(clientDTO));
        return convertEntityToDTO(client);
    }

    @Override
    public Boolean deleteClient(String id) {
        Optional<Client> optional = clientRepository.findById(Long.valueOf(id));
        if (!optional.isPresent()){
            throw  new NotFoundException("Cliente no existe");
        }
        clientRepository.deleteById(Long.valueOf(id));
        return true;
    }
    private Client convertDTOtoEntity(ClientDTO clientDTO){
        return Mapper.modelMapper().map(clientDTO, Client.class);
    }

    private ClientDTO convertEntityToDTO(Client client){
        return Mapper.modelMapper().map(client, ClientDTO.class);
    }

}
