package springBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springBoot.model.UserModel;

@Service
public class UserService {
	
	public List<UserModel> getUsers(){
		
		List<UserModel> users = new ArrayList<UserModel>();
		users.add(new UserModel("sandeep kumar",24,"NanakPura","9560207320"));
		users.add(new UserModel("sanjeev kumar",29,"NanakPura","9650271172"));
		users.add(new UserModel("Anushka Singh",24,"South Ex","12457898653"));
		
		return users;
	}

}
