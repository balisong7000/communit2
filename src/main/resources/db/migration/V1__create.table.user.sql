create table USER
(
    ID          INT auto_increment,
    NAME        VARCHAR(50),
    ACCOUNTID   VARCHAR(100),
    TOKEN       CHAR(36),
    GMTCREATE   BIGINT,
    GMTMODIFIED BIGINT
);