package com.tribes.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TempController {

  @GetMapping
  public ResponseEntity<?> getModel() {
    return ResponseEntity.status(200).body(new TempModel());
  }

}
