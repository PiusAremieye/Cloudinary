package com.github.pius.service;

import com.cloudinary.utils.ObjectUtils;
import com.github.pius.configuration.CloudConfig;
import com.github.pius.dto.PathDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class CloudService {
  private int uniqueKey;

  @Autowired
  private CloudConfig cloudConfig;

  public Map sendFile(PathDTO path) throws Exception {
    try{
      uniqueKey++;
      File toUpload = new File(path.getPath());
      Map params = ObjectUtils.asMap("public_id", "cloud_tutorial/demo"+uniqueKey);
      return cloudConfig.configCloud().uploader().upload(toUpload, params);
    } catch (IOException ex){
      throw new Exception(ex.getMessage());
    }
  }
}
