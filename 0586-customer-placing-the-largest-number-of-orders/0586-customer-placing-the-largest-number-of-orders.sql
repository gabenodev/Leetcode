# Write your MySQL query statement below
Select customer_number
from Orders o
Group by customer_number
ORDER BY COUNT(customer_number) DESC
Limit 1