package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaixiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaixiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaixiView;


/**
 * 菜系
 *
 * @author 
 * @email 
 * @date 2021-04-19 16:17:04
 */
public interface CaixiService extends IService<CaixiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaixiVO> selectListVO(Wrapper<CaixiEntity> wrapper);
   	
   	CaixiVO selectVO(@Param("ew") Wrapper<CaixiEntity> wrapper);
   	
   	List<CaixiView> selectListView(Wrapper<CaixiEntity> wrapper);
   	
   	CaixiView selectView(@Param("ew") Wrapper<CaixiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaixiEntity> wrapper);
   	
}

