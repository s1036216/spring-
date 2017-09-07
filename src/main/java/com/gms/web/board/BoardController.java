package com.gms.web.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.common.AuthController;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@RequestMapping("/board_add")
	public String boardAdd() {
		logger.info("BoardController::::: boardAdd {}","진입");
		return "board/board_add";
	}
	@RequestMapping("/board_list")
	public String boardList() {
		logger.info("BoardController::::: boardList {}","진입");
		return "board/board_list";
	}
	@RequestMapping("/board_detail")
	public String boardDetail() {
		logger.info("BoardController::::: boardDetail {}","진입");
		return "board/board_detail";
	}
	@RequestMapping("/board_update")
	public String boardUpdate() {
		logger.info("BoardController::::: boardUpdate {}","진입");
		return "board/board_update";
	}
	@RequestMapping("/board_delete")
	public String boardDelete() {
		logger.info("BoardController::::: boardDelete {}","진입");
		return "board/board_list";
	}
}
