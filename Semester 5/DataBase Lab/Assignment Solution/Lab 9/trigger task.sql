--Triggers Task
CREATE TABLE Persons (
ID int NOT NULL,
Name varchar (50) NOT NULL,
PreviousName varchar (50) NULL,
SameNameCount int NULL,
CONSTRAINT pk_Person PRIMARY KEY (ID));

create or replace trigger update_previous_name
before update on persons
for each row
Begin
    :new.PreviousName:= :old.Name;
    DBMS_OUTPUT.PUT_LINE('Old Name: '||:old.PreviousName );
    DBMS_OUTPUT.PUT_LINE('New Name: '||:new.Name );
END;
/
INSERT INTO PERSONS(ID,NAME) VALUES (1,'taha');
INSERT INTO PERSONS(ID,NAME) VALUES (2,'jawaid');
INSERT INTO PERSONS(ID,NAME) VALUES (3,'ali');


update persons
set Name = 'Abdu'
where ID = 1;
select * from PERSONS;

CREATE OR REPLACE TRIGGER set_same_name_count
AFTER INSERT OR DELETE OR UPDATE OF Name
ON Persons
BEGIN
UPDATE Persons A SET SameNameCount = (SELECT COUNT(*) FROM Persons WHERE NAME = A.Name);
END;
/

INSERT INTO Persons (ID, Name) values (2, 'jawaid');

SELECT * FROM Persons;
