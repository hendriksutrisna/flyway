CREATE TABLE public.student (
	id uuid NOT NULL DEFAULT uuid_generate_v4(),
	name varchar NOT NULL,
	address varchar NOT NULL,
	CONSTRAINT student_pk PRIMARY KEY (id)
);