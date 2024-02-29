package com.example.children.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.children.model.Children;
import com.example.children.repository.ChildrenRepository;



@Service
public class ChildrenService {
    private ChildrenRepository childrenRepo;
    public ChildrenService(ChildrenRepository childrenRepo){
        this.childrenRepo=childrenRepo;
    }
    public Children postChildren(Children children){
        return childrenRepo.save(children);
    }
    public List<Children> getChildren(String field){
        return childrenRepo.findAll(Sort.by(field));
    }
    public Page<Children> paginationChildren(int offset,int pagesize){
        return childrenRepo.findAll(PageRequest.of(offset,pagesize));
    }
    public Page<Children> pageSortChildren(int offset,int pagesize,String field){
        PageRequest pageRequest=PageRequest.of(offset, pagesize , Sort.by(field));
        return childrenRepo.findAll(pageRequest);
    }
}