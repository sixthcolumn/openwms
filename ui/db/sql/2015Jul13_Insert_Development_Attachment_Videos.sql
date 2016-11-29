-- 2015-Jul-13 OpenWMS Mysql migration script to add sample content to dev work order.

delete from work_order_attachments;
delete from attachment;

INSERT INTO attachment (id, type, filename) VALUES (100, 'Video MP4', '/videos/Power-Lines-Explode-during-Violent-Storm-Transformer-Explosion.mp4');

INSERT INTO attachment (id, type, filename) VALUES (101, 'Video MP4', '/videos/Truck-caught-on-over-head-power-lines.mp4');

INSERT INTO attachment (id, type, filename) VALUES (103, 'Video MP4', '/videos/Electrical-Accidents.mp4');


INSERT INTO work_order_attachments (id, work_order_id, attachment_id) VALUES (100, 112, 100);

INSERT INTO work_order_attachments (id, work_order_id, attachment_id) VALUES (101, 112, 101);

INSERT INTO work_order_attachments (id, work_order_id, attachment_id) VALUES (103, 112, 103);

