create table cliente (
                         id integer unique not null,
                         nome varchar(50) not null,
                         limite integer not null,
                         saldo integer not null
);

create table transacao (
                           id integer unique not null,
                           id_cliente integer not null,
                           valor integer not null,
                           tipo char(1) not null,
                           descricao varchar(10) not null,
                           data_transacao timestamp not null default now(),
                           constraint fk_transacao
                               foreign key(id_cliente) references cliente(id)
);

INSERT INTO cliente (id, nome, limite, saldo)
VALUES
    (1,'o barato sai caro', 1000 * 100, 0),
    (2,'zan corp ltda', 800 * 100, 0),
    (3,'les cruders', 10000 * 100, 0),
    (4,'padaria joia de cocaia', 100000 * 100, 0),
    (5,'kid mais', 5000 * 100, 0);