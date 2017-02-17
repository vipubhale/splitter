use splitter;

drop table if exists splitter.groupUserMapping;
drop table if exists splitter.user;
drop table if exists splitter.group;

create table splitter.user(
	userId int NOT NULL AUTO_INCREMENT,
  userName varchar(255) NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  creationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                  ON UPDATE CURRENT_TIMESTAMP NOT NULL,
  status varchar(10) NOT NULL,
	PRIMARY KEY (userId)
);

create table splitter.group( 
  groupId int NOT NULL AUTO_INCREMENT,
  groupName varchar(255) NOT NULL,
  creationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                  ON UPDATE CURRENT_TIMESTAMP NOT NULL,
  status varchar(10) NOT NULL,
	PRIMARY KEY (groupId)
);

create table splitter.groupUserMapping(
  mappingId int NOT NULL AUTO_INCREMENT,
  userId int,
  groupId int,
  FOREIGN KEY (userId) REFERENCES splitter.user(userId),
  FOREIGN KEY (groupId) REFERENCES splitter.group(groupId),
  PRIMARY KEY (mappingId)
);

insert into splitter.user 
  (userName, firstName, lastName, email, status)
  values (
    "vipul", "Vipul", "Bhale", "vipulbhale@email.com", "ACTIVE"
    )
;

insert into splitter.group 
  (groupName, status)
  values (
    "grihkharcha", "ACTIVE"
    )
;

insert into splitter.groupUserMapping 
  (userId, groupId)
  values (
    1, 1
    )
;

