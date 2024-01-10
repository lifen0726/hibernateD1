create table company(
	companyId int primary key not null,
	companyName nvarchar(50) not null
);

select* from company;

create table Department(
	deptid int primary key not null identity(1,1),
	deptname nvarchar (50)
);
select* from Department;

begin transaction;

commit;

Hibernate: 
    select
        department0_.deptid ,
        department0_.deptname 
    from
        department department0_ 
    where
        department0_.deptid=2
