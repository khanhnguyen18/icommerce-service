--------------------------------------------------------
--  DDL for Table PRODUCT
--------------------------------------------------------
CREATE TABLE PRODUCT
(
    "ID" NUMBER(12,0) NOT NULL,
    "NAME" VARCHAR2(40 CHAR)
);

ALTER TABLE "PRODUCT" ADD CONSTRAINT "PK_PRODUCT" PRIMARY KEY ("ID");

CREATE SEQUENCE SEQ_PRODUCT MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 CACHE 100;

--------------------------------------------------------
--  DDL for Table PRICE
--------------------------------------------------------
CREATE TABLE PRICE
(
    "ID" NUMBER(12,0) NOT NULL,
    "AMOUNT" NUMBER(13,0) NOT NULL,
    "DATE" DATE NOT NULL,
    "PRODUCT_ID" NUMBER(12,0) NOT NULL
);

ALTER TABLE "PRICE" ADD CONSTRAINT "PK_PRICE" PRIMARY KEY ("ID");

CREATE SEQUENCE SEQ_PRICE MINVALUE 1 MAXVALUE 999999999999999 INCREMENT BY 1 CACHE 100;