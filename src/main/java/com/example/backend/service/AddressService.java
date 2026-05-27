package com.example.backend.service;
import com.example.backend.entity.Address;
import java.util.List;

public interface AddressService {

    Address addAddress(Address address);

    List<Address> getAllAddresses();

    void deleteAddress(Long id);
}
