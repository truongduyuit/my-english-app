--
-- File generated with SQLiteStudio v3.2.1 on Sun Dec 22 23:22:14 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: categories
CREATE TABLE categories (_id INTEGER PRIMARY KEY, name STRING) WITHOUT ROWID;
INSERT INTO categories (_id, name) VALUES (1, 'tense');
INSERT INTO categories (_id, name) VALUES (2, 'Word');

-- Table: Questions
CREATE TABLE Questions (_id INTEGER PRIMARY KEY, question STRING, option1 STRING, option2 STRING, option3 STRING, answer_nr INTEGER, difficulty STRING, category_id INTEGER, FOREIGN KEY (category_id) REFERENCES categories (_id)) WITHOUT ROWID;
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (1, 'I ............Louisiana state University.', 'am attending', 'attend', 'was attending', 1, 'easy', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (2, 'Columbus............America more then 400 years ago.', 'discovered', 'has discovered', 'had discovered', 1, 'easy', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (3, 'He fell down when he ............towards the church.', 'run', 'runs', 'was running', 3, 'easy', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (4, 'We ............there when our father died.', 'still lived', 'were still living', 'was still living', 2, 'easy', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (5, 'They ............pingpong when their father comes back home.', 'will play', 'would play', 'will be playing', 3, 'medium', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (6, 'By Christmas, I.............for you for 6 months.', 'Shall have been working', 'shall work', 'have been working', 1, 'medium', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (7, 'The train............half an hour.', 'has been leaving', 'left', 'has lelt', 2, 'medium', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (8, 'After I...............lunch, I looked for my bag.', 'have has', 'have had', 'had had', 3, 'medium', 1);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (9, 'I am sorry that I can''t________ your invitation.', 'take', 'accept', 'agree', 2, 'medium', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (10, '_________what he says, he wasn''t even there when the crime was committed.', 'Following', 'According to', 'Hearing', 2, 'medium', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (11, 'He gave his listeners a vivid________ of his journey through Peru.', 'tale', 'communication', 'plot', 1, 'medium', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (12, 'This ticket__________ one person to the show.', 'accepts', 'permits', 'admits', 2, 'medium', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (13, 'As we wait no longer for the delivery of your order, we have to________ it.', 'postpone', 'cancel', 'return', 3, 'easy', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (14, 'He''s not________ of learning German in six months.', 'intersted', 'able', 'capable', 3, 'easy', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (15, 'The book________ two weeks ago.', 'came across', 'came into', 'came out', 3, 'easy', 2);
INSERT INTO Questions (_id, question, option1, option2, option3, answer_nr, difficulty, category_id) VALUES (16, 'Good________ sir.', 'morning', 'summer', 'jacket', 1, 'easy', 2);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
