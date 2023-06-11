Use vollmed;
create table medicos(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null unique,
    documento varchar(6) not null unique,
    especialidad varchar(20) not null,
    calle varchar(100) not null,
    numero varchar(3),
    complemento varchar(100),
    distrito varchar(100) not null,
    ciudad varchar(100) not null,

    primary key (id)
);

