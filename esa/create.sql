create table faculty
(
	id bigint not null
		constraint faculty_pk
			primary key,
	name character varying(100) not null
);

create table student
(
	mobile_phone bigint not null
		constraint student_pk
			primary key,
	name character varying(100) not null,
	surname character varying(100) not null,
	course int not null,
	faculty_id bigint not null
		constraint fk_faculty
			references faculty
);