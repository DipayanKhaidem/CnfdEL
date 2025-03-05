package rvce.lab.prg3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	List<Book> bookL = new ArrayList<Book>();
	@GetMapping
	public List<Book> getBook() {
		return bookL;
	}
	
	@PostMapping("/add")
	public List<Book> postBook(
			@RequestParam int id,
			@RequestParam String title,
			@RequestParam String author,
			@RequestParam String year
			){
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		book.setYear(year);
		bookL.add(book);
		return bookL;
	}

}
