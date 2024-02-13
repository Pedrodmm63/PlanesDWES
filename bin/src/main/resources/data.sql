insert into curso (nombre) values ('1A');
insert into curso (nombre) values ('1B');
insert into curso (nombre) values ('2A');
insert into curso (nombre) values ('2B');
insert into curso (nombre) values ('3A');
insert into curso (nombre) values ('3B');

insert into plan (nombre) values ('P2023-2024-1A');
insert into plan (nombre) values ('P2023-2024-1B');
insert into plan (nombre) values ('P2023-2024-2A');
insert into plan (nombre) values ('P2023-2024-2B');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3A','1A');
insert into plan (nombre,FK_CURSO) values ('P2023-2024-3B','1B');

insert into tutor (nombre,email) values ('Marcos','marcos@educastur.org');
insert into tutor (nombre,email) values ('Javier','javier@educastur.org');
insert into tutor (nombre,email,plan) values ('Maria','maria@educastur.org',3);
insert into tutor (nombre,email,plan) values ('Marta','marta@educastur.org',4);
insert into tutor (nombre,email,plan) values ('Pedro','pedro@educastur.org',5);
insert into tutor (nombre,email,plan) values ('Lucia','lucia@educastur.org',6);

insert into actividad (nombre, obligatorio, descripcion) values ('Actividad 1', true, 'hola');
insert into actividad (nombre, obligatorio, descripcion) values ('Actividad 2', false, 'hola');
insert into actividad (nombre, obligatorio, descripcion) values ('Actividad 3', true, 'hola');


insert into enmarca (id_plan, id_actividad, fecha) values (1, 1, '13-05-2020');
insert into enmarca (id_plan, id_actividad, fecha) values (1, 2, '13-05-2020');
insert into enmarca (id_plan, id_actividad, fecha) values (3, 3, '13-05-2020');










