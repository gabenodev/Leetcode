# Write your MySQL query statement below
SELECT c.name AS Customers 
from Customers c
LEFT JOIN Orders o on o.customerId=c.id
Where o.id is NULL

