package br.ifsp.contacts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.ifsp.contacts.repository.AddressRepository;


@RestController
@RequestMapping("/api/Address")
public class AddressController {
    private final AddressRepository adddressRepository;

    public AddressController(AddressRepository adddressRepository) {
        this.adddressRepository = adddressRepository;
    }
    
    
    
}
