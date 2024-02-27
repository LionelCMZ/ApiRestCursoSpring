package com.infsis.demo.Services;
import com.infsis.demo.DTOs.BlogDTO;

import java.util.List;
public interface BlogService {
    List<BlogDTO> getBlogs();
    BlogDTO getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
