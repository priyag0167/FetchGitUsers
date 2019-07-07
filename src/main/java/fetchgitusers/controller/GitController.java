package fetchgitusers.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import fetchgitusers.model.GitFetchRecord;
import fetchgitusers.model.GitUser;


@Controller
public class GitController {

	@RequestMapping(method = RequestMethod.GET, value="/repositories", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<GitUser> getListGitUsers(){
		return GitFetchRecord.getInstance().getUsers();
	}
}
