package com.quintrix.jfs.quintrixspring;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CastController {
	private static final String template = "Actor Name: , %s!";
	private final AtomicInteger counter = new AtomicInteger();

	@GetMapping("/cast")
	public Cast cast(@RequestParam(value = "name", defaultValue = "Actor") String name) {
		return new Cast(counter.incrementAndGet(), String.format(template, name));

}
}