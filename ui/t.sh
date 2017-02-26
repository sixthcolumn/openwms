
rails generate scaffold Address sd_address_1:string sd_address_2:string sd_building_name:string sd_code:string sd_number:string sd_prefix:string sd_suffix:string sd_suite_number:string sd_type:string sd_within_town_limits_flag:integer td_code:string td_country:string td_name:string td_section:string td_state_province:string directions:string td_pobox:string td_postal_code:string td_region:string county:string township_name:string subdivision:string block:string lot:string time_zone:string coord_system:string --no-migration

rails generate scaffold AddressDistrict address:references district:references --no-migration

rails generate scaffold AddressHazard address:references hazard:references --no-migration

rails generate scaffold AddressPositionPoint address:references sequence:integer xposition:integer yposition:integer zposition:integer --no-migration

rails generate scaffold Asset mRID:string critical_flag:integer utc_number:string address:references --no-migration

rails generate scaffold AssetName asset:references name:string name_type:references --no-migration

rails generate scaffold AssetProcedure asset:references procedure:references --no-migration

rails generate scaffold Attachment type:string filename:string --no-migration

rails generate scaffold Comment comment:string comment_type:string comment_subtype:string --no-migration

rails generate scaffold Contactperson lastname:string firstname:string middle:string prefix:string suffix:string governmentid:string affiliation:string primary:references secondary:references objectid:string --no-migration

rails generate scaffold ContactpersonAddress contactperson:references address:references address_type:string priority_order:integer --no-migration

rails generate scaffold ContactpersonEmail contactperson:references email:references --no-migration

rails generate scaffold ContactpersonOtherContactinfo contactperson:references other_contactinfo:references --no-migration

rails generate scaffold ContactpersonPhone contactperson:references phone:references --no-migration

rails generate scaffold Crew mRid:string --no-migration

rails generate scaffold CrewName crew:references name:string name_type:references --no-migration

rails generate scaffold District type:string name:string code:string description:string --no-migration

rails generate scaffold Email email:string email_type:string priority_order:integer --no-migration

rails generate scaffold Eprilog address:text contentType:string create_date:datetime data:string encoding:string faultCode:text header:text httpMethod:text message:string messageId:string operation:string payload:text responseCode:text resultCode:string INTERFACE_ID:integer stage:string --no-migration

rails generate scaffold Hazard hazard_name:string --no-migration

rails generate scaffold Interface name:string package:references proxy_flag:integer required_flag:integer vendor_role_type:references --no-migration

rails generate scaffold MaterialItem multiplier:float unit:string quantity:float --no-migration

rails generate scaffold MaterialItemName material_item:references name:string name_type:references --no-migration

rails generate scaffold Measurement type:string phases:string unit_multiplier:float unit_symbol:string --no-migration

rails generate scaffold NameTypeAuthority name:string description:string --no-migration

rails generate scaffold Nametype name:string name_type_authority:references --no-migration

rails generate scaffold Objectref primary_name:string secondary_name:string noun:string object_guid:string utility:string registered_name:string system_name:string --no-migration

rails generate scaffold Organization mRid:string address:references phone:references --no-migration

rails generate scaffold OrganizationName organization:references name:string name_type:references --no-migration

rails generate scaffold OtherContactinfo details:string info_type:string --no-migration

rails generate scaffold Package name:string --no-migration

rails generate scaffold PackagesVendorRoleType package:references vendor_role_type:references --no-migration

rails generate scaffold Phone areacode:string citycode:string countrycode:string localnumber:string extension:integer phonetype:string priorityorder:integer --no-migration

rails generate scaffold Procedure instruction:string kind:string sequence:integer --no-migration

rails generate scaffold ProcedureMeasurement procedure:references measurement:references --no-migration

rails generate scaffold ProxyInterface interface:references proxy_url:string --no-migration

rails generate scaffold Request data:string create_date:datetime request:string result:string --no-migration

rails generate scaffold Resultcode name:string --no-migration

rails generate scaffold Seq seq_name:string start:integer increment:integer curval:integer flag:string --no-migration

rails generate scaffold TimeSchedule type:string start_tstamp:timestamp end_tstamp:timestamp --no-migration

rails generate scaffold VendorRole name:string vendor_role_type:references --no-migration

rails generate scaffold VendorRoleType name:string active_flag:integer --no-migration

rails generate scaffold WorkOrder work_order_name:string created_by:string mRid:string kind:string request_datetime:timestamp updated_by:string status:string status_kind:string priority_justification:string priority_rank:integer priority_type:string comments:string description:string title:string request_contact:references address:references primary_object_ref:references grid_location:string location_comment:string location_contact:references gps_latitude:float gps_longitude:float gps_altitude:float internal_building_name:string internal_building_num:string internal_floor:string internal_room_num:string --no-migration

rails generate scaffold WorkOrderAttachment work_order:references attachment:references --no-migration

rails generate scaffold WorkOrderComment work_order:references comment:references --no-migration

rails generate scaffold WorkOrderHazard work_order:references hazard:references --no-migration

rails generate scaffold WorkOrderLocationObjectRef work_order:references loc_ref_object:references --no-migration

rails generate scaffold WorkOrderName name:string name_type:references work_order:references --no-migration

rails generate scaffold WorkOrderSchedule work_order:references time_schedule:references --no-migration

rails generate scaffold WorkOrderWorkTask work_order:references work_task:references --no-migration

rails generate scaffold WorkPositionPoint work_order:references sequence_num:integer xposition:integer yposition:integer zposition:integer --no-migration

rails generate scaffold WorkTask mRID:string instructions:string subject:string crew_eta:timestamp task_type:string old_asset:references --no-migration

rails generate scaffold WorkTaskAsset work_task:references asset:references created_by:string --no-migration

rails generate scaffold WorkTaskCrew work_task:references crew:references --no-migration

rails generate scaffold WorkTaskMaterialItem work_task:references material_item:references --no-migration

rails generate scaffold WorkTaskName name:string work_task:references name_type:references --no-migration

rails generate scaffold WorkTaskTimeSchedule work_task:references time_schedule:references --no-migration

