delimiter //
create trigger bir_eprilog before insert on EpriLog
for each row
begin
set new.create_date = now();
end
//
delimiter ;
