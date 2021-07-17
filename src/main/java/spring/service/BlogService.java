package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.BlogDAO;
import spring.model.Blog;

@Service
public class BlogService implements ICRUDService<Blog> {
	
	@Autowired
	private BlogDAO blogService;

	@Override
	public List<Blog> getAll() {
		return blogService.getAll();
	}

	@Override
	public int save(Blog blog) {
		return blogService.save(blog);
	}

	@Override
	public int update(Blog blog) {
		return blogService.update(blog);
	}
	
	public int updateView(int id) {
		return blogService.updateView(id);
	}

	@Override
	public int del(int id) {
		return blogService.del(id);
	}

	@Override
	public Blog findById(int id) {
		return null;
	}

	@Override
	public List<Blog> getList(int offset, int rowCount) {
		return blogService.getList(offset, rowCount);
	}

	@Override
	public int totalRow() {
		return blogService.totalRow();
	}
    
}
