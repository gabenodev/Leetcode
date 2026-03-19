# Write your MySQL query statement below
Select name, bonus 
from Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
Where b.bonus < 1000 OR b.bonus is NULL