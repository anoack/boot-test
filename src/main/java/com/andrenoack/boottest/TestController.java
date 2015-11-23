package com.andrenoack.boottest;

import com.andrenoack.boottest.dao.TeamDao;
import com.andrenoack.boottest.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by andre.noack on 23.11.15.
 */
@Controller
public class TestController {

	@Autowired
	TeamDao teamDao;

	private Team team;

	@RequestMapping("/hi/{name}")
	public String hiThere(Map model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
	}
}
