package com.ltp.contacts.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.ltp.contacts.exception.EntityNotFoundException;
import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.repository.ContactRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@SuppressWarnings("null")
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    @Override
    public Contact getContactById(Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return unwrapContact(contact, id);
    }

    @Override
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return (List<Contact>)contactRepository.findAll();
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id); 
    }

    static Contact unwrapContact(Optional<Contact> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, Contact.class);
    }

}
