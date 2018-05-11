INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(1,'Front-end')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(2,'Back-end')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(3,'Business Processes')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(4,'Business')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(5,'Compulsory')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(6,'Languages')
INSERT INTO CATEGORY(CATEGORY_ID, NAME) VALUES(7,'Misc')



INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(1,'ReactJS','N/A','Web Development','Haaga-Helia',2018,1)
INSERT INTO COMMENT(ID,NAME,COURSEID) VALUES(1,'first',1)
INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(2,'SpringBoot apps','N/A','Server Programming','Haaga-Helia',2018,2)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(3,'Safe IT practices and lab tasks with Kali Linux','5','Data Security','Haaga-Helia',2018,2)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (2, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=836010', 'Risk Management', 3)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (3, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=860056', 'Security operations', 3)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (4, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=889762', 'Lab Kali Password PenTest', 3)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(4, 'SAP, MicroNav and Order-to-Cash process ', 'N/A', 'SAP ERP 1', 'Haaga-Helia', '2018', 3)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (5, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=850544', 'Order to Cash report', 4)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(5,'Statistics with Excel','5','Business Math','Haaga-Helia',2018,4)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (6, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=835600', 'Mean, Mode, Median', 5)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (7, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=835603', 'Investments', 5)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(6,'Advanced business-themed written German','N/A','Business German 2','Haaga-Helia',2018,6)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(7,'Basic Chinese characters and phases','4','Basic Chinese 1','Haaga-Helia',2018,6)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (8, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=869813', 'All characters learned', 7)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(8,'Main topic: simple past tense.','N/A','Finnish 3','Haaga-Helia',2018,6)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (9, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=826600', 'Listening 1', 8)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (10, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=826601', 'Listening 2', 8)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(9,'Compulsory course','H','Study and Working Skills 2','Haaga-Helia',2018,5)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(10,'Compulsory course','5','Communication in Multicultural Environments','Haaga-Helia',2018,5)

INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(11,'MySQL syntax and database logic','4','Data Management and Databases','Haaga-Helia',2017,2)
INSERT INTO ASSIGNMENT(ID, LINK , NAME , COURSEID ) VALUES (11, 'http://hhmoodle.haaga-helia.fi/mod/assign/view.php?id=730444', 'Final project', 11)


INSERT INTO COURSE(ID, DESCRIPTION, GRADES, NAME, SOURCE, YEAR, CATEGORYID) VALUES(12,'Basic object creation in Blendder','5','Basic 3d Design','Haaga-Helia',2017,7)







