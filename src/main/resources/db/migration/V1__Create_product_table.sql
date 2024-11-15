CREATE TABLE PRODUCT
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255)   NOT NULL,
    description VARCHAR(255),
    price       DECIMAL(10, 2) NOT NULL,
    CREATED_AT  TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    Modified_AT TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP
);