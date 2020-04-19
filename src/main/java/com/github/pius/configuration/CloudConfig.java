package com.github.pius.configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("com.cloudinary")
public class CloudConfig {

  private String cloudName;
  private String apiKey;
  private String apiSecret;

  public CloudConfig(){}

  public Cloudinary configCloud(){
    return new Cloudinary(ObjectUtils.asMap(
      "cloud_name", cloudName,
      "api_key", apiKey,
      "api_secret", apiSecret));
  }

  public String getCloudName() {
    return cloudName;
  }

  public void setCloudName(String cloudName) {
    this.cloudName = cloudName;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiSecret() {
    return apiSecret;
  }

  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }
}
