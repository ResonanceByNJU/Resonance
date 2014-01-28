package com.example.resonance.service.Inter;

import com.example.resonance.service.ENUM.COLLECT_RESULT;
import com.example.resonance.service.ENUM.DELETE_RESULT;
import com.example.resonance.vo.CheatsListVO;
import com.example.resonance.vo.CheatsVO;
import com.example.resonance.vo.UserVO;

public interface CheatsService {

	public CheatsVO viewCheats(long cheatsID);
	
	public CheatsListVO getRecommendCheatsList();
	
	public CheatsListVO searchCheatsList(String keyword);
	
	public COLLECT_RESULT collectOneCheats(CheatsVO cheats,UserVO user);
	
	public COLLECT_RESULT collectMultiCheats(CheatsListVO cheatsList,UserVO user);
	
	public DELETE_RESULT deleteOneCheats(CheatsVO cheats,UserVO user);
	
	public DELETE_RESULT deleteMultiCheats(CheatsListVO cheats,UserVO user);
}
