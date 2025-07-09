package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.GuestInfo;
import com.example.demo.repository.GuestInfoRepository;

@RestController
@RequestMapping("/api/weddingInvite")
public class WeddingInviteController {
	
	@Autowired
	private GuestInfoRepository repository;

	@GetMapping
	public String onGet() {
		System.out.println("onGet");
		return "";
	}
	
	@PostMapping
	public ResponseEntity<String> receiveInvite(@RequestBody GuestInfo guestInfoDTO) {
		GuestInfo guestInfo = new GuestInfo(guestInfoDTO);
		repository.save(guestInfo);
		return ResponseEntity.ok("登録完了");
	}
}
