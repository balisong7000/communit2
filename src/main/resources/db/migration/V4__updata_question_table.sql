alter table QUESTION
alter column GMT_CREATE rename to GMTCREATE;

alter table QUESTION
alter column GMT_MODIFIED rename to GMTMODIFIED;

alter table QUESTION
alter column COMMENT_COUNT rename to COMMENTCOUNT;

alter table QUESTION
alter column VIEW_COUNT rename to VIEWCOUNT;

alter table QUESTION
alter column LIKE_COUNT rename to LIKECOUNT;

