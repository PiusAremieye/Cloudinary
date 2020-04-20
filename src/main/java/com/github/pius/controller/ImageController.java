package com.github.pius.controller;

import com.github.pius.dto.PathDTO;
import com.github.pius.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/image")
public class ImageController {

  @Autowired
  private ImageService imageService;

  @PostMapping
  public Map uploadFile(@RequestBody PathDTO path) throws Exception {
    return imageService.upload(path);
  }
}
