insert into package (id, name) values (7, 'WMS CIM MaintenanceOrder');
insert into package (id, name) values (13, 'WMS MSP WorkRequest');
insert into vendor_role_type (id, name) values (6, "WMS-CIM");
insert into vendor_role_type (id, name) values (7, "WMS-MSP");
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (40, 'WMS MaintenanceOrder Create', 7, 0, 0, 6);
insert into interface (id, name, package_id, proxy_flag, required_flag, vendor_role_type_id) values (41, 'WMS WorkRequest Create', 13, 0, 0, 7);
