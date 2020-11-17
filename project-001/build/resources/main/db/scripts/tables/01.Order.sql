begin
    execute immediate 'drop table order';
    dbms_output.put_line('Table order dropped');
exception
    when others then dbms_output.put_line('Table order did not exist');
end;
/
begin
    execute immediate 'drop sequence order_seq';
    dbms_output.put_line('Sequence order_sql dropped');
exception
    when others then dbms_output.put_line('Sequence order_sql did not exist');
end;
/
create table "ORDER"
(
    id          number(19)  not null,
    status      char(1)     not null,
    name        varchar(50) not null,
    customer_id number(19)  not null,
    remarks     nvarchar2(400),
    constraint order_pk_id primary key (id),
    constraint customer_un_check_status check ( status in ('e', 'd')), -- enable , d,
    constraint order_fk_customer_id foreign key (customer_id) references customer (id)
);

create sequence order_seq
    minvalue 10000 maxvalue 9999999999999999999 cycle
    start with 10000 increment by 1000 cache 1000;
/