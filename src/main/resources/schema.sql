/* database */
create schema eo;

/* sample table */
drop table if exists eo.sample;
create table eo.sample (
                           sample_no bigint unsigned auto_increment comment 'no' primary key,
                           sample_tit varchar(400) not null comment 'title',
                           sample_cont varchar(4000) null comment 'contents',
                           del_yn varchar(1) default 'N' not null comment 'delete y/n',
                           crt_id varchar(10) not null comment 'create ID',
                           crt_dt datetime not null comment 'create date',
                           upd_id varchar(10) not null comment 'update ID',
                           upd_dt datetime not null comment 'update date'
) comment 'sample';
create index eo_sample_x01 on eo.sample (sample_tit);
