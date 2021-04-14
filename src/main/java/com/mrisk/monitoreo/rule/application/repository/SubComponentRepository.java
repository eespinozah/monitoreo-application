package com.mrisk.monitoreo.rule.application.repository;

import java.util.List;

import com.mrisk.monitoreo.rule.domain.SubComponent;

public interface SubComponentRepository {

    SubComponent findById(Integer id);

    List<SubComponent> findAllSubComponentByComponentId(Integer compId);

    SubComponent findSubCompByCompIdAndSubId(Integer id, Integer csubid);

}
