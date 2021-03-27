package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateTaskDto {
  private String title;
  private String description;
  private TaskStatusEnum status = TaskStatusEnum.PENDING;
  private int maxDuration;
  private boolean isPublic;

  public Task toTask() {
    return new Task()
        .setTitle(title)
        .setDescription(description)
        .setStatus(status)
        .setMaxDuration(maxDuration)
        .setPublic(isPublic);
  }
}
