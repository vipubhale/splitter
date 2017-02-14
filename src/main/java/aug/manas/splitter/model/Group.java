package aug.manas.splitter.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Group {

	@Id
	private String id;
	private String entryDescription;
	private String spenderIdNickName;
	private String spenderId;
	private Date date;
	private String lastName;
	private double amtPaid;
	private ArrayList<String> groupMembers;

	
	public Group() {
	}

	public double getAmtPaid() {
		return amtPaid;
	}


	public String getId() {
		return id;
	}

	public String getEntryDescription() {
		return entryDescription;
	}

	public String getSpenderIdNickName() {
		return spenderIdNickName;
	}

	public String getSpenderId() {
		return spenderId;
	}

	public Date getDate() {
		return date;
	}

	public String getLastName() {
		return lastName;
	}

	public ArrayList<String> getGroupMembers() {
		return groupMembers;
	}



}
