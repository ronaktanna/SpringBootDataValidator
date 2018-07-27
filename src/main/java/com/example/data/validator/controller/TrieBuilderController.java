package com.example.data.validator.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.data.validator.model.ResponseObject;

@Controller
@RequestMapping("/builder")
public class TrieBuilderController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TrieBuilderController.class);
	
	@RequestMapping(value = "/buildthetrie", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<ResponseObject> buildTheTrie(@RequestBody Map<String, String> requestPayload) {
		return null;
	}
}
