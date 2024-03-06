package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.pojo.Contact;

public interface ContactService {
    Contact getContactById(Long id);
    void saveContact(Contact contact);
    List<Contact> getContacts();
    void deleteContact(Long id);

}
