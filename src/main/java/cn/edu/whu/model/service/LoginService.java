package cn.edu.whu.model.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.whu.model.pojo.User;

public interface LoginService {

	Map<String, Object> login(User user);

}
