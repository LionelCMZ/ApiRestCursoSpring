package com.infsis.demo.Services;
import com.infsis.demo.DTOs.ArticleDTO;
import com.infsis.demo.DTOs.UserDTO;
import java.util.List;
public interface ArticleService {
    List<ArticleDTO> getArticles();
    ArticleDTO getArticleById(Integer userId);
    ArticleDTO saveArticle(UserDTO userDTO);
    ArticleDTO updateArticle(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
