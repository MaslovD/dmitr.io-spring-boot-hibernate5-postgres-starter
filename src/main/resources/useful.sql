SELECT pg_database.datname as "Database",
       pg_user.usename as "Owner"FROM pg_database, pg_user
WHERE pg_database.datdba = pg_user.usesysid

UNION

SELECT pg_database.datname as "Database",
       NULL as "Owner"FROM pg_database
WHERE pg_database.datdba NOT IN (SELECT usesysid FROM pg_user)
ORDER BY "Database"