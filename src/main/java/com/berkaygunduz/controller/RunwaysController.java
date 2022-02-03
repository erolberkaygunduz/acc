package com.berkaygunduz.controller;

import com.berkaygunduz.dto.RunwaysDTO;
import com.berkaygunduz.service.RunwaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/runways")
public class RunwaysController {

    @Autowired
    RunwaysService runwaysService;

    @GetMapping
    public ResponseEntity<List<RunwaysDTO>> getAllRunwaysList(){
        return ResponseEntity.ok(runwaysService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RunwaysDTO> getRunwaysById(@PathVariable("id") int id){
        return ResponseEntity.ok(runwaysService.getRunwaysById(id));
    }
}
