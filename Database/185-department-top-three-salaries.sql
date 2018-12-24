# 185. Department Top Three Salaries

#The Employee table holds all employees. Every employee has an Id, and #there is also a column for the department Id.
#+----+-------+--------+--------------+
#| Id | Name  | Salary | DepartmentId |
#+----+-------+--------+--------------+
#| 1  | Joe   | 70000  | 1            |
#| 2  | Henry | 80000  | 2            |
#| 3  | Sam   | 60000  | 2            |
#| 4  | Max   | 90000  | 1            |
#| 5  | Janet | 69000  | 1            |
#| 6  | Randy | 85000  | 1            |
#+----+-------+--------+--------------+

#The Department table holds all departments of the company.
#+----+----------+
#| Id | Name     |
#+----+----------+
#| 1  | IT       |
#| 2  | Sales    |
#+----+----------+

#Write a SQL query to find employees who earn the top three salaries in #each of the department. For the above tables, your SQL query should return #the following rows.

#+------------+----------+--------+
#| Department | Employee | Salary |
#+------------+----------+--------+
#| IT         | Max      | 90000  |
#| IT         | Randy    | 85000  |
#| IT         | Joe      | 70000  |
#| Sales      | Henry    | 80000  |
#| Sales      | Sam      | 60000  |
#+------------+----------+--------+

#Solution (Runtime: 438 ms, faster than 90.56% of MySQL online submissions)

SELECT
    D.Name AS Department,
    E1.Name AS Employee,
    E1.Salary
FROM
    Department AS D,
    Employee AS E1,
    Employee AS E2
WHERE 
    D.Id = E1.DepartmentId AND
    E1.DepartmentId = E2.DepartmentId AND
    E1.Salary <= E2.Salary
GROUP BY
    D.Id, E1.Name HAVING COUNT(DISTINCT E2.Salary) <= 3
ORDER BY D.Name, E1.Salary DESC;