#184. Department Highest Salary
# The Employee table holds all employees. Every employee has an Id, a salary, and there is also a column for the department Id.
#+----+-------+--------+--------------+
#| Id | Name  | Salary | DepartmentId |
#+----+-------+--------+--------------+
#| 1  | Joe   | 70000  | 1            |
#| 2  | Henry | 80000  | 2            |
#| 3  | Sam   | 60000  | 2            |
#| 4  | Max   | 90000  | 1            |
#+----+-------+--------+--------------+

# The Department Table holds all departments of the company.
#+----+----------+
#| Id | Name     |
#+----+----------+
#| 1  | IT       |
#| 2  | Sales    |
#+----+----------+

# Write a SQL query to find employees who have the highest salary in each of the departments. For the above tables, Max has the highest salary in the IT department and Henry has the highest salary in the Sales department.
#+------------+----------+--------+
#| Department | Employee | Salary |
#+------------+----------+--------+
#| IT         | Max      | 90000  |
#| Sales      | Henry    | 80000  |
#+------------+----------+--------+

# Solution (Runtime: 261 ms, faster than 95.29% of MySQL submissions):
SELECT
	Department.Name AS Department,
	Employee.Name AS Employee,
	Salary
FROM
	Employee Join Department
	ON Employee.DepartmentId = Department.Id
WHERE
	(Employee.DepartmentId, Salary) IN
	(SELECT Name, MAX(Salary)
	FROM Employee
	GROUP BY DepartmentId);