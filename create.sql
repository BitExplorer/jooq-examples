CREATE TABLE IF NOT EXISTS public.user (
    ID BIGSERIAL PRIMARY KEY,
    name TEXT,
    age INTEGER,
    gender INTEGER,
    birthday date
);

