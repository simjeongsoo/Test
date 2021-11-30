package Easy.WebBoard.Controller;


import Easy.WebBoard.entity.Board;
import Easy.WebBoard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;

//===========================================================================================

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

//===========================================================================================
    @Autowired
    private BoardService boardService;
//===========================================================================================

    // 게시글 작성 페이지
    @GetMapping("/board/write") // locallhost:8080/board/write
    public String boardWriteForm(){

        return"boardwrite";
    }

//===========================================================================================

    //db 삽입 페이지
    //post url과 boardwrite.htlm의 form 태그의 action url이 일치해야 함
    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){

        //System.out.println(board.getTitle());

        boardService.wirte(board);

        return"";
    }

//===========================================================================================

    // 게시글 리스트 페이지
    @GetMapping("/board/list")
    public String boardList(Model model){

        //데이터를 담아 페이지로 던져줄 모델
        model.addAttribute("list",boardService.boardList());

        return "boardlist";
    }

//===========================================================================================

    //게시글 상세 페이지
    @GetMapping("/board/view") // localhost:8080/board/view?id=1
    public String boardView(Model model, Integer id){

        model.addAttribute("board", boardService.boardView(id));

        return "boardview";
    }



//===========================================================================================
}//end
