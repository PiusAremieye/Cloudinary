package com.github.pius.dto;

import javax.validation.constraints.NotBlank;

public class PathDTO {

  @NotBlank(message = "Please provide a valid path")
  private String path;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }
}
