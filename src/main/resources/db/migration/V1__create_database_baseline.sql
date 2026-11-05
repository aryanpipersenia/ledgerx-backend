
-- LedgerX initial database baseline
-- Domain tables will be added in later migrations.

CREATE TABLE ledgerx_schema_info (
    id BIGINT PRIMARY KEY,
    description VARCHAR(100) NOT NULL
);
