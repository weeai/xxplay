package com.xxplay.service.gameCenter.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.JUtils.date.DateUtils;
import com.xxplay.common.utils.xxplay.IConstant;
import com.xxplay.dao.app.IPackInfoDao;
import com.xxplay.model.persistent.app.PackInfo;
import com.xxplay.service.gameCenter.IGameApkService;

/**
 * 游戏apk服务类 实现类
 *
 * @Author:chenssy
 * @date:2016年5月3日 下午10:49:46
 * 
 */
@Service("gameApkService")
public class GameApkServicemImpl implements IGameApkService{

	@Resource
	private IPackInfoDao packInfoDao;
	
	@Override
	public void addGameApkInfo(PackInfo packInfo) {
		try {
			packInfo.setCreateTime(DateUtils.getCurrentDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		packInfo.setStatus(IConstant.GAME_STATUS_USING);
		
		packInfoDao.insert(packInfo);
	}

}
