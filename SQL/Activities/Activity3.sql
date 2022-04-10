REM   Script: Activity3
REM   Select Data with different condition


select * from salesman;

select sm.salesman_id,sm.salesman_city from salesman sm;

select distinct sm.salesman_id,sm.salesman_city from salesman sm;

select * from salesman where city ='Paris';

select * from salesman where salesman_city ='Paris';

select sm.salesman_id,sm.commission from salesman sm where salesman_name='Paul Adam';

