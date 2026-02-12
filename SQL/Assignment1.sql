-- Projection 
  
SQL> conn tada/yada
Connected.
SQL> CREATE TABLE DEPT(
  2  DEPTNO NUMBER(2,0),
  3  DNAME VARCHAR2(14),
  4  LOC VARCHAR2(13),
  5  CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO)
  6  );

Table created.

SQL> CREATE TABLE EMP (
  2  EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
  3  ENAME VARCHAR2(10),
  4  JOB VARCHAR2(9),
  5  MGR NUMBER(4),
  6  HIREDATE DATE,
  7  SAL NUMBER(7,2),
  8  COMM NUMBER(7,2),
  9  DEPTNO NUMBER(2),
 10  CONSTRAINT FK_EMP_DEPT FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)
 11  );

Table created.

SQL> INSERT INTO DEPT
  2  VALUES(10, 'ACCOUNTING', 'NEW YORK');

1 row created.

SQL> INSERT INTO DEPT
  2  VALUES(20, 'RESEARCH', 'DALLAS');

1 row created.

SQL> INSERT INTO DEPT
  2  VALUES(30, 'SALES', 'CHICAGO');

1 row created.

SQL> INSERT INTO DEPT
  2  VALUES(40, 'OPERATIONS', 'BOSTON');

1 row created.

SQL> INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,TO_DATE('17-12-1980','DD-MM-YYYY'),800,NULL,20);

1 row created.

SQL> INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,TO_DATE('20-2-1981','DD-MM-YYYY'),1600,300,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,TO_DATE('22-2-1981','DD-MM-YYYY'),1250,500,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,TO_DATE('2-4-1981','DD-MM-YYYY'),2975,NULL,20);

1 row created.

SQL> INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,TO_DATE('28-9-1981','DD-MM-YYYY'),1250,1400,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,TO_DATE('1-5-1981','DD-MM-YYYY'),2850,NULL,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,TO_DATE('9-6-1981','DD-MM-YYYY'),2450,NULL,10);

1 row created.

SQL> INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('13-JUL-87','DD-MM-RR')-85,3000,NULL,20);

1 row created.

SQL> INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,TO_DATE('17-11-1981','DD-MM-YYYY'),5000,NULL,10);

1 row created.

SQL> INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,TO_DATE('8-9-1981','DD-MM-YYYY'),1500,0,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,TO_DATE('13-JUL-87', 'DD-MM-RR')-51,1100,NULL,20);

1 row created.

SQL> INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,TO_DATE('3-12-1981','DD-MM-YYYY'),950,NULL,30);

1 row created.

SQL> INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,TO_DATE('3-12-1981','DD-MM-YYYY'),3000,NULL,20);

1 row created.

SQL> INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,TO_DATE('23-1-1982','DD-MM-YYYY'),1300,NULL,10);

1 row created.

SQL> COMMIT;

Commit complete.

SQL> select *
  2  from EMP;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7369 SMITH      CLERK           7902 17-DEC-80        800
        20

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300
        30

      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7566 JONES      MANAGER         7839 02-APR-81       2975
        20

      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400
        30

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7782 CLARK      MANAGER         7839 09-JUN-81       2450
        10

      7788 SCOTT      ANALYST         7566 19-APR-87       3000
        20

      7839 KING       PRESIDENT            17-NOV-81       5000
        10


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0
        30

      7876 ADAMS      CLERK           7788 23-MAY-87       1100
        20

      7900 JAMES      CLERK           7698 03-DEC-81        950
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7902 FORD       ANALYST         7566 03-DEC-81       3000
        20

      7934 MILLER     CLERK           7782 23-JAN-82       1300
        10


14 rows selected.

SQL> select ENAME from EMP;

ENAME
----------
SMITH
ALLEN
WARD
JONES
MARTIN
BLAKE
CLARK
SCOTT
KING
TURNER
ADAMS

ENAME
----------
JAMES
FORD
MILLER

14 rows selected.

SQL> select ENAME,SAL from EMP;

ENAME             SAL
---------- ----------
SMITH             800
ALLEN            1600
WARD             1250
JONES            2975
MARTIN           1250
BLAKE            2850
CLARK            2450
SCOTT            3000
KING             5000
TURNER           1500
ADAMS            1100

ENAME             SAL
---------- ----------
JAMES             950
FORD             3000
MILLER           1300

14 rows selected.

SQL> select ENAME,COMM from EMP;

ENAME            COMM
---------- ----------
SMITH
ALLEN             300
WARD              500
JONES
MARTIN           1400
BLAKE
CLARK
SCOTT
KING
TURNER              0
ADAMS

ENAME            COMM
---------- ----------
JAMES
FORD
MILLER

14 rows selected.

SQL> --WAQTD NAME, JOB AND SALARY GIVEN TO ALL THE EMPLOYEES.
SQL> select ENAME,JOB,SAL from EMP;

ENAME      JOB              SAL
---------- --------- ----------
SMITH      CLERK            800
ALLEN      SALESMAN        1600
WARD       SALESMAN        1250
JONES      MANAGER         2975
MARTIN     SALESMAN        1250
BLAKE      MANAGER         2850
CLARK      MANAGER         2450
SCOTT      ANALYST         3000
KING       PRESIDENT       5000
TURNER     SALESMAN        1500
ADAMS      CLERK           1100

ENAME      JOB              SAL
---------- --------- ----------
JAMES      CLERK            950
FORD       ANALYST         3000
MILLER     CLERK           1300

14 rows selected.

SQL> -- WAQTD DNAMES PRESENT IN DEPARTMENT TABLE.
SQL> select DNAME from DEPT;

DNAME
--------------
ACCOUNTING
RESEARCH
SALES
OPERATIONS

SQL> --WAQTD DNAME AND LOCATION PRESENT IN DEPT TABLE.
SQL> select DNAME, LOC from DEPT;

DNAME          LOC
-------------- -------------
ACCOUNTING     NEW YORK
RESEARCH       DALLAS
SALES          CHICAGO
OPERATIONS     BOSTON
