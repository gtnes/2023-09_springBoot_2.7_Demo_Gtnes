package com.gtnes;

import com.gtnes.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void bookGetById() {
//		System.out.println(bookDao.getById(2));
		System.out.println(bookDao.selectById(1));
	}

	@Test
	void bookGetAll() {
		System.out.println(bookDao.selectList(null));
	}

}
