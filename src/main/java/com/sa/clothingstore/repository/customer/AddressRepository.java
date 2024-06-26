package com.sa.clothingstore.repository.customer;

import com.sa.clothingstore.model.user.customer.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface AddressRepository extends JpaRepository<Address, UUID> {
    @Query("SELECT COUNT(a) > 0 FROM Address a WHERE a.customer.id = :customerId AND a.id = :addressId")
    boolean existsAddressForCustomer(@Param("customerId") UUID customerId, @Param("addressId") UUID addressId);
    @Query("SELECT ad FROM Address ad WHERE ad.customer.id = :customerId")
    List<Address> getAllCustomerAddress(@Param("customerId") UUID customerId);
}
