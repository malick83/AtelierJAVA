package sn.simplon.dao;

import java.util.List;

import sn.simplon.entities.Category;


public interface ICategory {
	public int add(Category category);
	public int delete(int id);
	public int update(Category category);
	public List<Category> getAll();
	public Category getId(int id);

}
