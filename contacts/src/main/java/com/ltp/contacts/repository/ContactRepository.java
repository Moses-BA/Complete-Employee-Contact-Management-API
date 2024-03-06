package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;
import com.ltp.contacts.pojo.Contact;


public interface ContactRepository extends CrudRepository<Contact, Long> {

} 
