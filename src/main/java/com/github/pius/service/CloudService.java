package com.github.pius.service;

import com.cloudinary.utils.ObjectUtils;
import com.github.pius.configuration.CloudConfig;
import com.github.pius.dto.PathDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.File;
import java.io.IOException;

@Service
public class CloudService {

  @Autowired
  private CloudConfig cloudConfig;

  public String sendFile(PathDTO path) throws Exception {
    try{
      File toUpload = new File(path.getPath());
      cloudConfig.configCloud().uploader().upload(toUpload, ObjectUtils.emptyMap());
      return "File uploaded successfully";
    } catch (IOException ex){
      throw new Exception(ex.getMessage());
    }
  }
}
