package Easy.WebBoard.Controller;


import Easy.WebBoard.entity.Board;
import Easy.WebBoard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;

@Controller
public class BoardController {

//    //local host 주소로 들어갔을때
//    @GetMapping("/")
//    // return string을 띄움
//    @ResponseBody
//    public String main(){
//
//        return "Hello";
//    }

    @Autowired
    private BoardService boardService;


    @GetMapping("/board/write") // locallhost:8080/board/write
    public String boardWriteForm(){

        return"boardwrite";
    }

    //post url과 boardwrite.htlm의 form 태그의 action url이 일치해야 함
    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){

        //System.out.println(board.getTitle());

        boardService.wirte(board);

        return"";
    }





}
