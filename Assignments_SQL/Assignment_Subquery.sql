SELECT * FROM EMP;

SELECT * FROM DEPT;


-- ----- QUESTION 1 --------
-- SELECT ENAME 
-- FROM EMP
-- WHERE SAL > (
--     SELECT SAL
--     FROM emp
--     WHERE ENAME = 'SCOTT'
-- ) AND DEPTNO = (
--     SELECT DEPTNO
--     FROM DEPT
--     WHERE DNAME = 'ACCOUNTING'
-- );



-- ----- QUESTION 2 --------
-- SELECT * 
-- FROM emp
-- WHERE JOB = 'MANAGER' AND DEPTNO = (
--     SELECT DEPTNO
--     FROM DEPT
--     WHERE LOC = 'CHICAGO'
-- );



-- ----- QUESTION 3 --------
-- SELECT ENAME 
-- FROM EMP
-- WHERE SAL > (
--     SELECT SAL
--     FROM emp
--     WHERE ENAME = 'KING'
-- ) AND DEPTNO = (
--     SELECT DEPTNO
--     FROM DEPT
--     WHERE DNAME = 'ACCOUNTING'
-- );



-- ----- QUESTION 4 --------
-- SELECT * 
-- FROM emp
-- WHERE JOB = 'SALESMAN' AND DEPTNO = (
--       SELECT DEPTNO
--       FROM DEPT
--       WHERE DNAME = 'SALES'
-- );



-- ----- QUESTION 5 --------
-- SELECT ENAME, SAL, JOB, HIREDATE
-- FROM EMP
-- WHERE DEPTNO = (
--     SELECT DEPTNO
--     FROM DEPT
--     WHERE DNAME = 'OPERATIONS'
-- ) AND HIREDATE < (
--     SELECT HIREDATE
--     FROM emp
--     WHERE ENAME = 'KING'
-- );



-- ----- QUESTION 6 --------
-- SELECT * 
-- FROM EMP
-- WHERE DEPTNO IN (
--     SELECT DEPTNO
--     FROM DEPT
--     WHERE DNAME LIKE '%S'
-- );



-- ----- QUESTION 7 --------
-- SELECT DNAME
-- FROM DEPT
-- WHERE DEPTNO IN (
--     SELECT DEPTNO
--     FROM EMP
--     WHERE ENAME LIKE '%A%'
-- );



-- ----- QUESTION 8 --------
-- SELECT DNAME, LOC
-- FROM DEPT
-- WHERE DEPTNO IN (
--      SELECT DEPTNO
--      FROM EMP
--      WHERE SAL = 800
-- );



-- ----- QUESTION 9 --------
-- SELECT DNAME
-- FROM DEPT
-- WHERE DEPTNO IN (
--      SELECT DEPTNO
--      FROM emp
--      WHERE COMM IS NOT NULL
-- );



-- ----- QUESTION 10 --------
-- SELECT LOC
-- FROM DEPT
-- WHERE DEPTNO IN (
--     SELECT DEPTNO
--     FROM emp
--     WHERE COMM IS NOT NULL AND DEPTNO = 40
-- );