package Easy.WebBoard.service;

import Easy.WebBoard.entity.Board;
import Easy.WebBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//controller 에서 이용할 BoardService
@Service
public class BoardService {

    @Autowired //dependency injection(spring bean auto 객체 생성 )
    private BoardRepository boardRepository;

    //글 작성 처리
    public void wirte(Board board){

    boardRepository.save(board);

    }

    //게시글 리스트 처리
    //board list에 글을 불러올 메서드
    public List<Board> boardList(){

                    //  list에 제네릭으로 board클래스를 반환
        return boardRepository.findAll();


    }

    //특정 게시글 불러오기
    public Board boardView(Integer id){

                                //findById하면 옵셔널 값으로 불러와서 .get() 해줘야함
        return boardRepository.findById(id).get();
    }

}