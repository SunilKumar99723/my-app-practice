select * from(  
select FIRST_NAME, salary, dense_rank()over(order by salary desc)rank from EMPLOYEES)   
where rank = 2;  

select min(salary) from   
(select distinct salary from EMPLOYEES order by salary desc)   
where rownum < 3;  