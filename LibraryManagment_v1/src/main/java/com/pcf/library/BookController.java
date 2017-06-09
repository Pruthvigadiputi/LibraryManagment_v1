/**
 * 
 */
package com.pcf.library;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pgadiput
 *
 */
public interface BookController {
	public boolean createBook(@RequestBody Books bk) throws IOException;
	public @ResponseBody ArrayList<Books> getBooks() throws IOException;
	public @ResponseBody Books getBook(@RequestParam("id") String id);
	public @ResponseBody Books updateBook(@RequestBody Books bk);
	public boolean deleteBook(@RequestParam("id") String id);
}
