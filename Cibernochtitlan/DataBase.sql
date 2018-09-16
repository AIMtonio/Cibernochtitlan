drop database website;
create database website;
	use website;

create table persona(id_Persona int(5)auto_increment primary key,
					nombre varchar(30),
					apellidos varchar(30),
					correo varchar(50)unique,
					fecha_nacimiento date,
					kdr varchar(10))Engine=Innodb;

create table usuario(id_Usuario int auto_increment primary key,
				     id_Persona int,
					 cuenta varchar(30),
					 pass varchar(30),
					 kdr varchar(10)unique,
					 foreign key(id_Persona) references persona(id_Persona)on update cascade
					 on delete cascade,
					 foreign key(cuenta) references persona(correo)on update cascade
					 on delete cascade)
engine=innoDB;

delimiter //
create procedure registroUsuarios(nombreManda varchar(30),
								  apellidosManda varchar(30),
							      correoManda varchar(30),
							     
							      kdr varchar(10),
							      fechaManda varchar(30))
begin
insert into persona value(null,nombreManda,apellidosManda,correoManda,telefonoManda,fechaManda);
	end //
delimiter ;

delimiter //
create procedure buscarCorreo(correoManda varchar(30))
begin
select id_Persona from persona where correo=correoManda;
	end //
delimiter ;

DELIMITER //
CREATE TRIGGER nuevoUsuario AFTER INSERT ON persona
 FOR EACH ROW begin
insert into usuario values(null,new.id_Persona,new.correo,'123456',concat_ws("",new.id_Persona,new.telefono));
end
//
DELIMITER ;

delimiter //
create procedure iniciarSesion(correoManda varchar(30),passManda varchar(30))
begin
select kdr from usuario where cuenta=correoManda and pass=passManda; 
	end //
delimiter ;



insert into persona values(null,"Antonio","Alonso","")


call iniciarSesion("antoniomc159807@gmail.com","123456");























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


call prueba1("ejemplo","ejemplo2","ejemplo3","abc");

insert into persona value(null,"tony","alonso","perez","antonio_tenison@live.com.mx","5510727166");
insert into persona value(2,"Antonio","Alonso","Perez","antoniomc159807@gmail.com","5510727166");




