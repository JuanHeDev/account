package com.eazybytes.accounts.service;

import org.springframework.data.repository.query.Param;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {
    /**
     * 
     * @param customerDto -- CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
