package zerobase.jpatest100.notice.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
  private int id;
  private String title;
  private String content;
  private LocalDateTime registrationDate;
}
