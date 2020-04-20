package com.github.pius.controller;

import com.github.pius.dto.PathDTO;
import com.github.pius.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/video")
public class VideoController {
  @Autowired
  private VideoService videoService;

  @PostMapping
  public Map uploadFile(@RequestBody PathDTO path) throws Exception {
    return videoService.upload(path);
  }
}
