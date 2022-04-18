package com.springstudy.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstudy.book.vo.BookVo;

@RestController
public class BookControllerApi {
	
	public BookControllerApi() {
		System.out.println("BookControllerApi()");
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello Test";
	}
	
	@GetMapping("/listvotest")
	public List<BookVo> listvotest() {
		List<BookVo> list = new ArrayList<BookVo>();
		BookVo vo = new BookVo();
		vo.setBook_id(1);
		vo.setTitle("Java");
		vo.setCategory("Programming");
		vo.setPrice(20000);
		list.add(vo);
		return list;
	}
}
