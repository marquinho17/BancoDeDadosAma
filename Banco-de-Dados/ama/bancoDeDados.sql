/*
alter table <tabela_origem> add constraint <nome_da_restrição> foreign key (<campo_tabela_origem>) 
references <tabela_destino> (<campo_tabela_destino>); 
*/

create table profissional_has_usuarios (
	profissional_has_profissional_cpf int primary key not null,
    usuarios_has_usuarios_cpf int primary key not null,
    foreign key (profissional_has_profissional_cpf) references profissional (i_cpf_profissional),
    foreign key (usuarios_has_usuarios_cpf) references usuarios (i_cpf_usuario)
);