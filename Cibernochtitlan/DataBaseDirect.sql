
create table persona(id_Persona int(5)auto_increment primary key,
					nombre varchar(30),
					ap_paterno varchar(30),
					ap_materno varchar(30),
					correo varchar(50)unique,
					fecha_nacimiento varchar(30))Engine=Innodb;

create table usuario(id_Usuario int auto_increment primary key,
				     id_Persona int,
					 cuenta varchar(30),
					 pass varchar(30),
					 foreign key(id_Persona) references persona(id_Persona) on delete cascade)
engine=innoDB;

delimiter //
create procedure prueba1(nombreManda varchar(30),
							ap_paternoManda varchar(30),
							ap_maternoManda varchar(30),
							correoManda varchar(30))
begin
declare id_P char;
insert into persona value(null,nombreManda,ap_paternoManda,ap_maternoManda,correoManda);
	set id_P=(select id_Persona from persona where correo=correoManda);
	insert into usuario value(null,id_P,correoManda,"123456");
	end //
delimiter ;




delimiter //
create procedure registroUsuarios(nombreManda varchar(30),
								  ap_paternoManda varchar(30),
							      ap_maternoManda varchar(30),
							      correoManda varchar(30),
							      fechaManda varchar(30))
begin
declare id_P char;
insert into persona value(null,nombreManda,ap_paternoManda,ap_maternoManda,correoManda);
	
	end //
delimiter ;