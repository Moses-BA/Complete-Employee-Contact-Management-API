package com.ltp.contacts;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ltp.contacts.pojo.Contact;
import com.ltp.contacts.repository.ContactRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class ContactsApplication implements CommandLineRunner { 
// public class ContactsApplication{

	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	} 

	@SuppressWarnings("null")
    @Override
	public void run(String... args) throws Exception {
        Contact[] contacts = new Contact[] {
            new Contact("Jon Snow", "6123456432", "agsnejdj7@gmail.com", "4th Lake street, Kubwa", LocalDate.parse(("1980-01-31")), "Manager"),
            new Contact("Tyrion Lannister", "69876543", "ahshdhe57@gmail.com", "4th Lake street, Gwarinpa", LocalDate.parse(("1985-03-31")), "HR"),
            new Contact("Carl Johnson", "645673212", "INSIGNE7@gmail.com", "4th Lake street, Wuse", LocalDate.parse(("1987-05-31")), "HOD"),
            new Contact("Steve Curry", "123456789", "bruhssa7@gmail.com", "4th Lake street, Lugbe", LocalDate.parse(("1989-07-31")), "Janitor")
        };

		for (Contact contact : contacts) {
            contactRepository.save(contact);
        }	
	}

}
