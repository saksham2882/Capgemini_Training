SELECT * FROM emp;


-- ----- QUESTION 1 --------
-- SELECT COUNT(*), JOB
-- FROM emp
-- WHERE JOB != 'PRESIDENT'
-- GROUP BY JOB;



-- ----- QUESTION 2 --------
-- SELECT SUM(SAL) AS TOTAL_SAL, JOB
-- FROM emp
-- GROUP BY JOB;



-- ----- QUESTION 3 --------
-- SELECT COUNT(*), JOB, DEPTNO
-- FROM emp
-- WHERE JOB = 'MANAGER'
-- GROUP BY DEPTNO;



-- ----- QUESTION 4 --------
-- SELECT AVG(SAL) AS avg_sal, DEPTNO
-- FROM emp
-- WHERE DEPTNO != 20
-- GROUP BY DEPTNO;



-- ----- QUESTION 5 --------
-- SELECT COUNT(ENAME), JOB
-- FROM emp
-- WHERE ENAME LIKE '%A%'
-- GROUP BY JOB;



-- ----- QUESTION 7 --------
-- SELECT SUM(SAL), COUNT(*), DEPTNO
-- FROM emp
-- WHERE JOB = 'SALESMAN'
-- GROUP BY DEPTNO;



-- ----- QUESTION 8 --------
-- SELECT COUNT(*), MAX(SAL)
-- FROM emp
-- GROUP BY JOB;



-- ----- QUESTION 9 --------
-- SELECT MAX(SAL), DEPTNO
-- FROM emp
-- GROUP BY DEPTNO;



-- ----- QUESTION 10 --------
-- SELECT COUNT(*)
-- FROM emp
-- GROUP BY SAL;