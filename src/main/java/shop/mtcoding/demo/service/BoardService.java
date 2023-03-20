package shop.mtcoding.demo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.demo.dto.BoardDetailOutDto;
import shop.mtcoding.demo.dto.BoardDetailOutDto2;
import shop.mtcoding.demo.dto.BoardJoinUserDto;
import shop.mtcoding.demo.dto.BoardJoinUserDto2;
import shop.mtcoding.demo.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardDetailOutDto2 게시글상세보기(Integer id) {
        BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        System.out.println("디버그: " + boardDetailOutDto);

        BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);

        System.out.println("디버그2 : " + boardDetailOutDto2);

        return boardDetailOutDto2;
    }

    public BoardJoinUserDto 게시글상세보기2(Integer id) {
        BoardJoinUserDto boardDto = boardRepository.findByIdJoinUser2(id);

        return boardDto;
    }

    public BoardJoinUserDto2 게시글상세보기3(Integer id) {
        BoardJoinUserDto2 boardDto = boardRepository.findByIdJoinUser3(id);

        return boardDto;
    }

}
