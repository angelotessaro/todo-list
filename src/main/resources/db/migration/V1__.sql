CREATE TABLE task (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  title VARCHAR(255),
  completed BOOLEAN,
  CONSTRAINT pk_task PRIMARY KEY (id)
);