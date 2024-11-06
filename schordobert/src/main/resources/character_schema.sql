drop table RPCHARACTER if exists;

create table RPCHARACTER(
  ID int not null AUTO_INCREMENT,
  NAME varchar(100) not null,
  USERID int not null,
  PRIMARY KEY ( ID )
);