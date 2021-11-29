package Easy.WebBoard.service;

import Easy.WebBoard.entity.Board;
import Easy.WebBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired //dependency injection(spring bean auto 객체 생성 )
    private BoardRepository boardRepository;

    public void wirte(Board board){

    boardRepository.save(board);
    }
}
