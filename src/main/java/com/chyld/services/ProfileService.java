package com.chyld.services;

import com.chyld.repositories.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private IProfileRepository repository;

    @Autowired
    public void setRepository(IProfileRepository repository) {
        this.repository = repository;
    }



}
