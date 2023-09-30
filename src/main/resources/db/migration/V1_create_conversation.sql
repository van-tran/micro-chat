create table conversation
(
    uuid             integer not null
        constraint conversation_pk
            primary key,
    conversation_id  varchar(20),
    created_at       time    not null,
    last_modified_at time,
    type             text
        constraint conversation_type_check
            check (type = ANY (ARRAY ['GROUP'::text, 'INDIVIDUAL'::text])),
    status           text
        constraint conversation_status_check
            check (status = ANY (ARRAY ['CREATED'::text, 'BLOCKED'::text, 'DELETED'::text]))
);

alter table conversation
    owner to root;

create unique index conversation_conversation_id_uindex
    on conversation (conversation_id);

