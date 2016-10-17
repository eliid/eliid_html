package com.eliid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliid.dao.infoMapper;
import com.eliid.model.UserMessageInfo;
@Service("usermessageinfoservice")
public class userMessageInfoServiceImpl implements userMessageInfoService {
	@Autowired
	private infoMapper infomapper;

	@Override
	public boolean isAddInfo(UserMessageInfo info) {
		int result = infomapper.addUserMessageInfo(info);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}

}
