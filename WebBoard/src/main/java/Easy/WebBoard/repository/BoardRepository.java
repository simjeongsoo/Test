package Easy.WebBoard.repository;


import Easy.WebBoard.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository 상속 후 제네릭으로 타입 지정
// <Board entity, Id 타입 지정 >
public interface BoardRepository extends JpaRepository<Board,Integer> {
}
