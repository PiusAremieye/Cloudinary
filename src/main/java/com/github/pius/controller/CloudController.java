package com.github.pius.controller;

import com.github.pius.dto.PathDTO;
import com.github.pius.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/image")
public class CloudController {

  @Autowired
  private CloudService cloudService;

  @PostMapping
  public Map sendImage(@RequestBody PathDTO path) throws Exception {
    return cloudService.sendFile(path);
  }
}
