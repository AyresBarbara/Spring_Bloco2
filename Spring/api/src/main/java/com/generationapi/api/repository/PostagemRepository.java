package com.generationapi.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generationapi.api.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {

	public List <PostagemModel> findAllByTitullloContainingIgnoreCase (@Param ("titulo")String titulo);
	/*SELECT *FROM tb_postagens WHERE titulo = ""*/
	/*SELECT *FROM tb_postagens WHERE titulo LIKE = "%titulo%"*/
	
}
