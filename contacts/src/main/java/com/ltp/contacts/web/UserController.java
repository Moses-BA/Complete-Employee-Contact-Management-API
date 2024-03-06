package com.ltp.contacts.web;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.contacts.pojo.User;
import com.ltp.contacts.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor; 

@AllArgsConstructor
@RestController
@RequestMapping("/user")
@Tag(name = "User Controller", description = "Manages employee registration and login, and encrypts employee password.")
public class UserController {

    UserService userService;

	@GetMapping("/{id}")
	public ResponseEntity<String> findById(@PathVariable Long id) {
		return new ResponseEntity<>(userService.getUser(id).getUsername(), HttpStatus.OK);
	}

    @PostMapping("/registeruser")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

    @PostMapping("/registeradmin")
	public ResponseEntity<Object> createAdmin(@Valid @RequestBody User user) {
        userService.saveUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
