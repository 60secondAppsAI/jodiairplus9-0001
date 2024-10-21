package com.jodiairplus9.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus9.domain.Plane;
import com.jodiairplus9.dto.PlaneDTO;
import com.jodiairplus9.dto.PlaneSearchDTO;
import com.jodiairplus9.dto.PlanePageDTO;
import com.jodiairplus9.dto.PlaneConvertCriteriaDTO;
import com.jodiairplus9.service.GenericService;
import com.jodiairplus9.dto.common.RequestDTO;
import com.jodiairplus9.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PlaneService extends GenericService<Plane, Integer> {

	List<Plane> findAll();

	ResultDTO addPlane(PlaneDTO planeDTO, RequestDTO requestDTO);

	ResultDTO updatePlane(PlaneDTO planeDTO, RequestDTO requestDTO);

    Page<Plane> getAllPlanes(Pageable pageable);

    Page<Plane> getAllPlanes(Specification<Plane> spec, Pageable pageable);

	ResponseEntity<PlanePageDTO> getPlanes(PlaneSearchDTO planeSearchDTO);
	
	List<PlaneDTO> convertPlanesToPlaneDTOs(List<Plane> planes, PlaneConvertCriteriaDTO convertCriteria);

	PlaneDTO getPlaneDTOById(Integer planeId);







}





