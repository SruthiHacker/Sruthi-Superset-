package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // 🌱 Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 📥 Get BookService bean from IoC container
        BookService bookService = context.getBean("bookService", BookService.class);

        // 🎯 Use the service
        bookService.addBook("Spring in Action");
    }
}
