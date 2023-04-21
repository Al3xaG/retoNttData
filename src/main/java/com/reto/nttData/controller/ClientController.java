package com.reto.nttData.controller;


import com.reto.nttData.domain.dto.ClientDTO;
import com.reto.nttData.domain.dto.ReportDTO;
import com.reto.nttData.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO){
        return ResponseEntity.ok(clientService.createClient(clientDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getClient(@PathVariable String id){
        return ResponseEntity.ok(clientService.getClient(id));
    }

    @PutMapping
    public ResponseEntity<ClientDTO> updateClient(@RequestBody ClientDTO clientDTO){
        return ResponseEntity.ok(clientService.updateClient(clientDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteClient(@PathVariable String id){
        return ResponseEntity.ok(clientService.deleteClient(id));
    }

}
