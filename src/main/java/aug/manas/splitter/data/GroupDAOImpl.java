package aug.manas.splitter.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aug.manas.splitter.model.Group;

public class GroupDAOImpl  implements GroupDAO {
	
	@Autowired
	private GroupRepository repository;
	

	@Override
	public void addGroup(Group group) {
		// TODO Auto-generated method stub
		repository.save(group);
		
	}

	@Override
	public List<Group> listGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

}
