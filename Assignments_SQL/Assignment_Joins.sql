-- use employee;

-- ---------- CROSS JOIN --------------
-- SELECT * 
-- FROM EMP 
-- CROSS JOIN DEPT;


-- ------- ORACLE STYLE SYNTAX -------------
-- SELECT * 
-- FROM EMP, DEPT;


-- ------- INNER JOIN ----------
-- SELECT ENAME, DNAME
-- FROM emp
-- INNER JOIN dept ON 
-- emp.deptno = dept.deptno;


-- -------- ORACLE INNER JOIN USING WHERE ------------
-- SELECT ENAME, DNAME
-- FROM EMP, DEPT
-- WHERE EMP.DEPTNO = DEPT.DEPTNO;
