show tables;
desc employee;
drop table employee;
use ust_db;

create table employee(emp_id numeric(5) primary key,
			emp_name varchar(50),
			email varchar(50),
			salary numeric(10,2),
			hiredate date,
			job varchar(30));
show tables;
desc employee;
select *from employee;

insert into employee values(1001,'Suraj','suraj@yahoo.com',65000,'2020-04-27','Clerk');
insert into employee values(1002,'Mohit','mohit@gmail.com',52000 , '2021-04-20','Salesman');
insert into employee values(1003,'Gaurav','gaurav@yahoo.com',55000, '2020-10-15','Analyst');                        
insert into employee values(1004,'Harsh','harsh@gmail.com',68000 ,'2019-02-10','Clerk');
insert into employee values(1005,'Javed','javed@yahoo.com',85000 ,'2015-05-20','Manager');
insert into employee values(2001,'Priyanka','priyanka@yahoo.com',75000 ,'2018-05-20','Analyst');
insert into employee values(2002,'Karan','karan@yahoo.com',72000 ,'2019-10-20','Analyst');
insert into employee values(2005,'Nived','nived@gmail.com',45000,'2022-06-14','Salesman');

-- Find all the salesman
select *from employee where job="salesman";
select *from employee where job="Analyst";

-- find the analysts earning more than 60000
select * from employee where job="Analyst" AND salary>60000;

-- update the salary of each employee by 15%
update employee set salary=salary*1.15;
update employee set salary=salary*1.15 where emp_id between 1000 and 2006 ;

-- increase salary of each clerk by 2000 Rs
update employee set salary=salary+2000 where emp_id between 1000 and 2006 and job='Clerk';

-- add a new coulmn dept with data-type numeric(3)
alter table employee add dept numeric(3);
select * from employee;

-- insert data for dept coulumn for each employee.
update employee set dept=10 where emp_id=1001;
update employee set dept=20 where emp_id=1002;
update employee set dept=20 where emp_id=1003;
update employee set dept=10 where emp_id=1004;
update employee set dept=30 where emp_id=1005;
update employee set dept=10 where emp_id=2001;
update employee set dept=30 where emp_id=2002;
update employee set dept=30 where emp_id=2005;
select * from employee;


-- find all the employees belonging to dept 10
select * from employee where dept=10;

-- find the analysts is dept 20
select * from employee where dept=20 And job='Analyst';

-- find all the employees who are either clerk or analyst
select * from employee where job in('clerk','analyst');


-- sort the employees based on dept no asc and salary desc
select * from employee order by dept ASC,salary DESC;

-- GROUPING FUNCTIONS --
-- SUM
-- AVG
-- COUNT
-- MAX
-- finding average salary of all employee
select avg(salary)as 'Average_salary' from employee;

-- total employee count
select count(*)from employee;
-- renaming tot employee
select count(*) as 'Tot_employee' from employee;

-- find the total salary in employee
select sum(salary) as 'total_sal' from employee;
-- -----------------------------------------------
-- find total number of employee in each dept
select dept,count(*) as 'Tot_employee' from employee group by dept;

-- find the average salaries based on jobs
select job,avg(salary) as 'avg_salary' from employee group by job;
-- ---------------------------------------------------
--  find the max,min,average and total count based on job
select job, MAX(salary) as 'Max_sal', min(salary) as 'Min_sal',avg(salary) as 'Average',
count(job) as'Employee_Count' from employee group by job;

-- find the average salary of dept no 20
select dept ,avg(salary) as'Avg_sal' from employee where dept=20;

-- find the departments with more than 3 employees
select dept, count(dept)>=3 as 'Count' from employee;

select dept,count(*) as 'Tot_employee' from employee
group by dept having count(*)>=3;

-- -----------------------------------------------------------
-- Date functions--
-- find the year of joining of each employee// extract is a function to extract required things from date
select emp_name,extract(year from hiredate)as 'joining_year' from employee;
select emp_name,extract(month from hiredate)as 'joining_year' from employee;

-- find the total experience of each employee
-- datediff function to get difference
select emp_name,datediff(curdate(),hiredate)/365 as 'Total Exp' from employee;
select emp_name,datediff(curdate(),hiredate) as 'Total Exp' from employee;


select emp_name,extract(year from hiredate) as 'Total Exp' from employee;
select emp_name,extract(year from now())- extract(year from hiredate) as 'Total Exp' from employee;

select emp_name,extract(year from now())- extract(year from hiredate) as 'Total Exp' from employee order by 2 desc;
-- get the exp of year and months

-- -----------------------------------------------------------------
-- wildcards

-- find all the employees using gmail mails
-- find employees join in 2020
-- find employees  name starts with P or J
-- find employees join in the month of january
-- find employees joined in the first half of the year

-- Create a table dept with
-- dept		deptname	location
-- 10		IT			Bangalore
-- 20		Accounts	Trivandrum
-- 30		Sales		Chennai
-- 40		Management		Kolkata

create table dept(dept numeric(5),
			deptname varchar(50),
			location varchar(50));

show tables;
desc dept;
select * from dept;
insert into dept values
		(10,'IT','Bangalore'),
        (20,'Accounts','Trivandrum'),
        (30,'Sales','Chennai'),
        (40,'Management','Kolkata');
        
        
        
 -- find all the employees with dept details
 
 -- inner join- returns common things
 select emp_id,emp_name,e.dept,deptname,location from employee e join dept d on e.dept=d.dept;
 -- this also correct
 -- select emp_id,emp_name,dept,deptname,location from employee e join dept d on e.dept=d.dept;

-- ----------------------------------------------------------------------------------------------
-- find all the employees working in tvm
select emp_name,location from employee e join dept d on e.dept=d.dept where location='Trivandrum';
select distinct emp_name,location from employee e join dept d on e.dept=d.dept where location='Trivandrum';

-- display the dept information along with employee count
select deptname,e.dept,location ,count(*) as 'Employee_count' from employee e join dept d on e.dept=d.dept group by dept ;
-- find the dept with no employees
select count(e.dept),d.dept from employee e right join dept d on e.dept=d.dept group by e.dept having count(e.dept)=0;

-- find the dept with highest employee









