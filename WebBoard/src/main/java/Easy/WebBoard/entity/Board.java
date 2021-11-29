package Easy.WebBoard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// boardwirtepro 에서 받을 매개변수가 많아지면 복잡하기 때문에 Board 클래스생성

@Entity // entity어노테이션은 현재 클래스가 db에 있는 table을 의미한다는 것을 알려줌( jpa가 읽어들임 )
@Data //lombok
public class Board {
    // mysql table 구조와 동일 하게 작성

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;
}
