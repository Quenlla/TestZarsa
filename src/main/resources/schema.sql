create table PRICES(
  ID int not null AUTO_INCREMENT,
  BRAND_ID int not null,
  START_DATE TIMESTAMP,
  END_DATE TIMESTAMP,
  PRICE_LIST int,
  PRODUCT_ID int,
  PRIORITY int,
  PRICE double,
  CURR varchar(3),
  PRIMARY KEY ( ID )
);