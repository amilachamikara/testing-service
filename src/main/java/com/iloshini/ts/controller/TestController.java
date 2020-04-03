package com.iloshini.ts.controller;

import com.iloshini.ts.MyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By
 *
 * @author Amila
 * @date 4/3/20
 * @project testing-service
 */
@RestController
@RequestMapping("test")
public class TestController
{
	@GetMapping("mock-status")
	public ResponseEntity<?> test()
	{
		return ResponseEntity.status( 4001 ).build();
	}

	@GetMapping("mock-content")
	public ResponseEntity<MyResponse> test2()
	{
		return ResponseEntity.ok( new MyResponse( "testing", 4001 ) );
	}
}
