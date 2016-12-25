package aug.manas.springdemo.data;

import java.util.List;

import aug.manas.springdemo.model.Group;

public interface GroupDAO {
	public void addGroup(Group group);
	public List<Group> listGroup();
	public void deleteGroup(Group group);
	public void updateGroup(Group group);
}
