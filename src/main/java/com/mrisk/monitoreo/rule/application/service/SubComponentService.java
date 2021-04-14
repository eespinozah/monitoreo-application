package com.mrisk.monitoreo.rule.application.service;

import java.util.List;
import java.util.Objects;

import com.mrisk.monitoreo.rule.application.exception.DataNotFoundException;
import com.mrisk.monitoreo.rule.application.repository.SubComponentRepository;
import com.mrisk.monitoreo.rule.domain.SubComponent;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SubComponentService {

    private static final String DATA_NOT_FOUND = "Data Not Found";
    private final SubComponentRepository repository;

    public List<SubComponent> findAllSubComponentByComponentId(Integer componentId) {
        List<SubComponent> subComponentList = repository.findAllSubComponentByComponentId(componentId);
        if (subComponentList.isEmpty()) {
            throw new DataNotFoundException(DATA_NOT_FOUND);
        }
        return subComponentList;
    }

    public SubComponent findSubCompByCompIdAndSubId(Integer id, Integer csubid) {
        SubComponent subComponent =  repository.findSubCompByCompIdAndSubId(id,csubid);
        if(Objects.nonNull(subComponent)) {
           return subComponent; 
        }
        throw new DataNotFoundException(DATA_NOT_FOUND);
    }

}
