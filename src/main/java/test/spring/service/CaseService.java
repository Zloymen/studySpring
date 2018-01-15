package test.spring.service;

import test.spring.entity.Case;

import java.util.List;

public interface CaseService extends IForseService{
    List<Case> getAll();

}
