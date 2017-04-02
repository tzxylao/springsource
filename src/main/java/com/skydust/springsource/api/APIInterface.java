package com.skydust.springsource.api;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api")
public class APIInterface {

	protected static Log log = LogFactory.getLog(APIInterface.class);

	@RequestMapping(value = "/getLoginUserId", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
	@ResponseBody
	public String getLoginUserId(HttpServletRequest resquest) {
		return null;
	}

}
