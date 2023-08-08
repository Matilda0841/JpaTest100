package zerobase.jpatest100.notice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zerobase.jpatest100.notice.model.Notice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class NoticeController {

  @GetMapping("/api/notice")
  public String noticeStart() {
    return "공지사항 입니다.";
  }

  @GetMapping("/api/notice2")
  public Notice notice2() {
    Notice notice = new Notice();
    LocalDateTime regDate = LocalDateTime.of(2023, 8, 8, 0, 0);
    notice.setId(1);
    notice.setTitle("공지사항입니다.");
    notice.setContent("공지사항 내용입니다.");
    notice.setRegistrationDate(regDate);

    return notice;
  }

  @GetMapping("/api/notice3")
  public List<Notice> notice3() {
    List<Notice> noticeList = new ArrayList<>();

//    Notice notice1 = new Notice();
//
//    notice1.setId(1);
//    notice1.setTitle("공지사항입니다.");
//    notice1.setContent("공지사항 내용입니다.");
//    notice1.setRegistrationDate(LocalDateTime.of(2023, 8, 8, 0, 0));

//    Notice notice2 = new Notice();
//    notice2.setId(2);
//    notice2.setTitle("두번째 공지사항입니다.");
//    notice2.setContent("두번째 공지사항 내용입니다.");
//    notice2.setRegistrationDate(LocalDateTime.of(2023, 8, 8, 0, 0));


    noticeList.add(Notice.builder()
            .id(1)
            .title("공지사항입니다.")
            .content("공지사항 내용입니다.")
            .registrationDate(LocalDateTime.of(2023, 8, 8, 0, 0))
        .build());
    noticeList.add(Notice.builder()
            .id(2)
            .title("두번째 공지사항입니다.")
            .content("두번째 공지사항 내용입니다.")
            .registrationDate(LocalDateTime.of(2023, 8, 8, 0, 0))
        .build());

    return noticeList;
  }

  @GetMapping("/api/notice4")
  public List<Notice> notice4 (){
    List<Notice> notices = new ArrayList<>();

    return null;
//    return notices;
  }

  @GetMapping("/api/notice/count")
  public int notice5(){

    return 20;
  }

}
