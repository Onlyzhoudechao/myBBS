package cn.edu.whu.model.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.whu.model.dao.UserMapper;
import cn.edu.whu.model.pojo.User;
import cn.edu.whu.model.service.LoginService;

@Transactional
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, Object> login(User user) {
		Map<String,Object> map = new HashMap<>();
        Integer uid = userMapper.selectUidByUserNameAndPassword(user);
        if(uid==null){
            map.put("status","no");
            map.put("error","用户名或密码错误~");
            return map;
        }
        map.put("status","yes");
        map.put("uid",uid);
		return map;
	}

}
