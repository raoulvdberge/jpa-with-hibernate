/* post 1 = my cat */
INSERT INTO posts (id, title, content)
VALUES (1, 'My cat', 'I love my cat!');

INSERT INTO comments (post_id, content)
VALUES (1, 'I love your cat!');

INSERT INTO comments (post_id, content)
VALUES (1, 'I hate cats.');

INSERT INTO tags (post_id, name)
VALUES (1, 'Animals');

/* post 2 = my dog */
INSERT INTO posts (id, title, content)
VALUES (2, 'My dog', 'My dog has an unique personality.');

INSERT INTO comments (post_id, content)
VALUES (2, 'I love your dog!');

INSERT INTO comments (post_id, content)
VALUES (2, 'I hate dogs.');