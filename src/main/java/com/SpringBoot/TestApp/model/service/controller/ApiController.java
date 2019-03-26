package com.SpringBoot.TestApp.model.service.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.TestApp.model.JsonResponse;

@RestController
@RequestMapping("api")
public class ApiController {
	private AtomicInteger id;

	public ApiController() {
		id = new AtomicInteger();
	}

	@GetMapping(path = "/ping", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public JsonResponse ping() {
		JsonResponse result = new JsonResponse(id.incrementAndGet(), 0, "pong");
		return result;
	}
}
