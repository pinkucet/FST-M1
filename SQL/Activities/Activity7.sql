REM   Script: Activity7
REM   Aggregate functions


select sum(PURCHASE_AMOUNT) total_purchage from orders;

select sum(PURCHASE_AMOUNT) as total_purchage from orders;

select avg(PURCHASE_AMOUNT) as avarage_amount from orders;

select max(PURCHASE_AMOUNT) as max_amount from orders;

select min(PURCHASE_AMOUNT) as min_amount from orders;

select * from orders;



select count(distinct salesman_id) as "salesman count" from orders;

select * from orders;

select count(distinct salesman_id) as "salesman count" from orders;

