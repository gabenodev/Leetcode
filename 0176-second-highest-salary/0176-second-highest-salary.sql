# Write your MySQL query statement below
#Select (
#    Select distinct salary
#    from Employee e
#    order by salary desc
#    limit 1 offset 1 ) as SecondHighestSalary

SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);