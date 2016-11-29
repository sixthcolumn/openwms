# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 0) do

  create_table "address", force: true do |t|
    t.string  "sd_address_1",               limit: 20
    t.string  "sd_address_2",               limit: 20
    t.string  "sd_building_name",           limit: 20
    t.string  "sd_code",                    limit: 20
    t.string  "sd_number",                  limit: 8
    t.string  "sd_prefix",                  limit: 10
    t.string  "sd_suffix",                  limit: 10
    t.string  "sd_suite_number",            limit: 10
    t.string  "sd_type",                    limit: 10
    t.integer "sd_within_town_limits_flag",             default: 0, null: false
    t.string  "td_code",                    limit: 20
    t.string  "td_country",                 limit: 20
    t.string  "td_name",                    limit: 20
    t.string  "td_section",                 limit: 3
    t.string  "td_state_province",          limit: 20
    t.string  "directions",                 limit: 512
    t.string  "td_pobox",                   limit: 10
    t.string  "td_postal_code",             limit: 10
    t.string  "td_region",                  limit: 12
    t.string  "county",                     limit: 20
    t.string  "township_name",              limit: 30
    t.string  "subdivision",                limit: 20
    t.string  "block",                      limit: 6
    t.string  "lot",                        limit: 6
    t.string  "time_zone",                  limit: 15
    t.string  "coord_system",               limit: 12
  end

  create_table "address_districts", force: true do |t|
    t.integer "address_id",  null: false
    t.integer "district_id", null: false
  end

  add_index "address_districts", ["address_id"], name: "fk_address_districts_address_id", using: :btree
  add_index "address_districts", ["district_id"], name: "fk_address_districts_district_id", using: :btree

  create_table "address_hazards", force: true do |t|
    t.integer "address_id", null: false
    t.integer "hazard_id",  null: false
  end

  add_index "address_hazards", ["address_id"], name: "fk_address_hazards_address_id", using: :btree
  add_index "address_hazards", ["hazard_id"], name: "fk_address_hazards_hazard_id", using: :btree

  create_table "address_position_points", force: true do |t|
    t.integer "address_id", null: false
    t.integer "sequence"
    t.integer "xposition"
    t.integer "yposition"
    t.integer "zposition"
  end

  add_index "address_position_points", ["address_id"], name: "fk_address_position_points_address_id", using: :btree

  create_table "asset", force: true do |t|
    t.string  "mRID",          limit: 40,             null: false
    t.integer "critical_flag",            default: 0, null: false
    t.string  "utc_number",    limit: 40
    t.integer "address_id"
  end

  create_table "asset_names", force: true do |t|
    t.integer "asset_id",                null: false
    t.string  "name",         limit: 40, null: false
    t.integer "name_type_id"
  end

  add_index "asset_names", ["asset_id"], name: "fk_asset_names_objectid", using: :btree
  add_index "asset_names", ["name_type_id"], name: "fk_asset_names_nametype_id", using: :btree

  create_table "asset_proceds", force: true do |t|
    t.integer "asset_id",     null: false
    t.integer "proced_id", null: false
  end

  add_index "asset_proceds", ["asset_id"], name: "fk_asset_proceds_asset_id", using: :btree
  add_index "asset_proceds", ["proced_id"], name: "fk_asset_proceds_proced_id", using: :btree

  create_table "attachment", force: true do |t|
    t.string "type",     limit: 12,  null: false
    t.string "filename", limit: 256, null: false
  end

  create_table "comment", force: true do |t|
    t.string "comment",         limit: 512, null: false
    t.string "comment_type",    limit: 12
    t.string "comment_subtype", limit: 12
  end

  create_table "contactperson", force: true do |t|
    t.string "lastname",     limit: 20, null: false
    t.string "firstname",    limit: 20, null: false
    t.string "middle",       limit: 20
    t.string "prefix",       limit: 5
    t.string "suffix",       limit: 5
    t.string "governmentid", limit: 20
    t.string "affiliation",  limit: 20
    t.string "primary_id",   limit: 20
    t.string "secondary_id", limit: 20
    t.string "objectid",     limit: 40
  end

  create_table "contactperson_addresses", force: true do |t|
    t.integer "contactperson_id",            null: false
    t.integer "address_id",                  null: false
    t.string  "address_type",     limit: 12
    t.integer "priority_order"
  end

  add_index "contactperson_addresses", ["address_id"], name: "fk_contactperson_addresses_address_id", using: :btree
  add_index "contactperson_addresses", ["contactperson_id"], name: "fk_contactperson_addresses_contactperson_id", using: :btree

  create_table "contactperson_emails", force: true do |t|
    t.integer "contactperson_id", null: false
    t.integer "email_id",         null: false
  end

  add_index "contactperson_emails", ["contactperson_id"], name: "fk_contactperson_emails_contactperson_id", using: :btree
  add_index "contactperson_emails", ["email_id"], name: "fk_contactperson_emails_email_id", using: :btree

  create_table "contactperson_other_contactinfos", force: true do |t|
    t.integer "contactperson_id",     null: false
    t.integer "other_contactinfo_id", null: false
  end

  add_index "contactperson_other_contactinfos", ["contactperson_id"], name: "fk_contactperson_other_contactperson_id", using: :btree
  add_index "contactperson_other_contactinfos", ["other_contactinfo_id"], name: "fk_contactperson_other_other_contactinfo_id", using: :btree

  create_table "contactperson_phones", force: true do |t|
    t.integer "contactperson_id", null: false
    t.integer "phone_id",         null: false
  end

  add_index "contactperson_phones", ["contactperson_id"], name: "fk_contactperson_phones_contactperson_id", using: :btree
  add_index "contactperson_phones", ["phone_id"], name: "fk_contactperson_phones_phone+id", using: :btree

  create_table "crew", force: true do |t|
    t.string "mRid", limit: 20, null: false
  end

  create_table "crew_names", force: true do |t|
    t.integer "crew_id",                 null: false
    t.string  "name",         limit: 20, null: false
    t.integer "name_type_id"
  end

  add_index "crew_names", ["crew_id"], name: "fk_crew_names_crew_id", using: :btree
  add_index "crew_names", ["name_type_id"], name: "fk_crew_names_name_type_id", using: :btree

  create_table "district", force: true do |t|
    t.string "type",        limit: 12
    t.string "name",        limit: 20,  null: false
    t.string "code",        limit: 12
    t.string "description", limit: 512
  end

  create_table "email", force: true do |t|
    t.string  "email",          limit: 30, null: false
    t.string  "email_type",     limit: 10
    t.integer "priority_order"
  end

  create_table "eprilog", force: true do |t|
    t.text     "address",      limit: 2147483647
    t.string   "contentType"
    t.datetime "create_date"
    t.string   "data"
    t.string   "encoding"
    t.text     "faultCode",    limit: 2147483647
    t.text     "header",       limit: 2147483647
    t.text     "httpMethod",   limit: 2147483647
    t.string   "message"
    t.string   "messageId"
    t.string   "operation"
    t.text     "payload",      limit: 2147483647
    t.text     "responseCode", limit: 2147483647
    t.string   "resultCode"
    t.integer  "INTERFACE_ID"
    t.string   "stage",        limit: 50
  end

  add_index "eprilog", ["INTERFACE_ID"], name: "INTERFACE_ID", using: :btree

  create_table "hazards", force: true do |t|
    t.string "hazard_name", limit: 12, null: false
  end

  create_table "interface", force: true do |t|
    t.string  "name",                limit: 100
    t.integer "package_id",                                  null: false
    t.integer "proxy_flag",                      default: 0
    t.integer "required_flag",                   default: 1
    t.integer "vendor_role_type_id",                         null: false
  end

  add_index "interface", ["name"], name: "i_interface_name", using: :btree
  add_index "interface", ["package_id"], name: "package_id", using: :btree
  add_index "interface", ["vendor_role_type_id"], name: "vendor_role_type_id", using: :btree

  create_table "material_item", force: true do |t|
    t.float  "multiplier", limit: 24
    t.string "unit",       limit: 12
    t.float  "quantity",   limit: 24
  end

  create_table "material_item_names", force: true do |t|
    t.integer "material_item_id",            null: false
    t.string  "name",             limit: 40, null: false
    t.integer "name_type_id"
  end

  add_index "material_item_names", ["material_item_id"], name: "fk_material_item_material_id", using: :btree
  add_index "material_item_names", ["name_type_id"], name: "fk_material_item_names_nametype_id", using: :btree

  create_table "measurement", force: true do |t|
    t.string "measurement_type",  limit: 12
    t.string "phases",            limit: 4
    t.float  "unit_multiplier",   limit: 24
    t.string "unit_symbol",       limit: 12
  end

  create_table "name_type_authority", force: true do |t|
    t.string "name",        limit: 20, null: false
    t.string "description"
  end

  create_table "nametype", force: true do |t|
    t.string  "name",                   limit: 20, null: false
    t.integer "name_type_authority_id",            null: false
  end

  add_index "nametype", ["name_type_authority_id"], name: "fk_name_type_authority_id", using: :btree

  create_table "objectref", force: true do |t|
    t.string "primary_name",    limit: 40, null: false
    t.string "secondary_name",  limit: 40
    t.string "noun",            limit: 12
    t.string "object_guid",     limit: 40
    t.string "utility",         limit: 12
    t.string "registered_name", limit: 40
    t.string "system_name",     limit: 40
  end

  create_table "organization", force: true do |t|
    t.string  "mRid",       limit: 40, null: false
    t.integer "address_id"
    t.integer "phone_id"
  end

  add_index "organization", ["address_id"], name: "fk_organization_address_id", using: :btree
  add_index "organization", ["phone_id"], name: "fk_organization_phone_id", using: :btree

  create_table "organization_names", force: true do |t|
    t.integer "organization_id",            null: false
    t.string  "name",            limit: 20, null: false
    t.integer "name_type_id",               null: false
  end

  add_index "organization_names", ["name_type_id"], name: "fk_organization_names_name_type_id", using: :btree
  add_index "organization_names", ["organization_id"], name: "fk_organization_names_organization_id", using: :btree

  create_table "other_contactinfo", force: true do |t|
    t.string "details",   limit: 30, null: false
    t.string "info_type", limit: 10
  end

  create_table "package", force: true do |t|
    t.string "name", limit: 20
  end

  add_index "package", ["name"], name: "i_package_name", unique: true, using: :btree

  create_table "packages_vendor_role_types", id: false, force: true do |t|
    t.integer "package_id"
    t.integer "vendor_role_type_id"
  end

  create_table "phone", force: true do |t|
    t.string  "areacode",      limit: 5
    t.string  "citycode",      limit: 5
    t.string  "countrycode",   limit: 3
    t.string  "localnumber",   limit: 10
    t.integer "extension"
    t.string  "phonetype",     limit: 10
    t.integer "priorityorder"
  end

  create_table "proced", force: true do |t|
    t.string  "instruction", limit: 512, null: false
    t.string  "kind",        limit: 20
    t.integer "sequence"
  end

  create_table "proced_measurements", force: true do |t|
    t.integer "proced_id",   null: false
    t.integer "measurement_id", null: false
  end

  add_index "proced_measurements", ["measurement_id"], name: "fk_proc_measurements_measurement_id", using: :btree
  add_index "proced_measurements", ["proced_id"], name: "fk_proced_measurements_proced_id", using: :btree

  create_table "proxy_interface", force: true do |t|
    t.integer "interface_id"
    t.string  "proxy_url",    limit: 512
  end

  add_index "proxy_interface", ["interface_id"], name: "interface_id", using: :btree

  create_table "request", force: true do |t|
    t.string   "data"
    t.datetime "create_date"
    t.string   "request"
    t.string   "result"
  end

  create_table "resultcode", force: true do |t|
    t.string "name", limit: 20
  end

  create_table "seqs", id: false, force: true do |t|
    t.string  "seq_name",  limit: 30
    t.integer "start"
    t.integer "increment"
    t.integer "curval"
    t.string  "flag",      limit: 1
  end

  create_table "time_schedule", force: true do |t|
    t.string    "schedule_type", limit: 12, null: false
    t.timestamp "start_tstamp",             null: false
    t.timestamp "end_tstamp",               null: false
  end

  create_table "vendor_role", force: true do |t|
    t.string  "name",                limit: 10
    t.integer "vendor_role_type_id",            null: false
  end

  add_index "vendor_role", ["vendor_role_type_id"], name: "vendor_role_type_id", using: :btree

  create_table "vendor_role_type", force: true do |t|
    t.string  "name",        limit: 10
    t.integer "active_flag"
  end

  create_table "work_order", force: true do |t|
    t.string    "work_order_name",        limit: 40,   null: false
    t.timestamp "created_at",                          null: false
    t.string    "created_by",             limit: 20,   null: false
    t.string    "mRid",                   limit: 40,   null: false
    t.string    "kind",                   limit: 12,   null: false
    t.timestamp "updated_at"
    t.timestamp "request_datetime"
    t.string    "updated_by",             limit: 20
    t.string    "status",                 limit: 10,   null: false
    t.string    "status_kind",            limit: 10
    t.string    "priority_justification", limit: 10
    t.integer   "priority_rank"
    t.string    "priority_type",          limit: 10
    t.string    "comments",               limit: 1024
    t.string    "description",            limit: 256
    t.string    "title",                  limit: 40
    t.integer   "request_contact_id"
    t.integer   "address_id"
    t.integer   "primary_object_ref_id"
    t.string    "grid_location",          limit: 40
    t.string    "location_comment",       limit: 512
    t.integer   "location_contact_id"
    t.float     "gps_latitude",           limit: 24
    t.float     "gps_longitude",          limit: 24
    t.float     "gps_altitude",           limit: 24
    t.string    "internal_building_name", limit: 20
    t.string    "internal_building_num",  limit: 8
    t.string    "internal_floor",         limit: 3
    t.string    "internal_room_num",      limit: 5
    t.integer   "maintorder_id"
  end

  add_index "work_order", ["location_contact_id"], name: "fk_work_order_location_contact_id", using: :btree
  add_index "work_order", ["primary_object_ref_id"], name: "fk_work_order_primary_object_id", using: :btree
  add_index "work_order", ["request_contact_id"], name: "fk_work_order_request_contact_id", using: :btree
  add_index "work_order", ["maintorder_id"], name: "fk_work_order_maint_order_id", using: :btree

  create_table "work_order_attachments", force: true do |t|
    t.integer "work_order_id", null: false
    t.integer "attachment_id", null: false
  end

  add_index "work_order_attachments", ["attachment_id"], name: "fk_work_order_attachments_attachment_id", using: :btree
  add_index "work_order_attachments", ["work_order_id"], name: "fk_work_order_attachments_work_order_id", using: :btree

  create_table "work_order_comments", force: true do |t|
    t.integer "work_order_id", null: false
    t.integer "comment_id",    null: false
  end

  add_index "work_order_comments", ["comment_id"], name: "fk_work_order_comments_comment_id", using: :btree
  add_index "work_order_comments", ["work_order_id"], name: "fk_work_order_comments_work_order_id", using: :btree

  create_table "work_order_hazards", force: true do |t|
    t.integer "work_order_id", null: false
    t.integer "hazard_id",     null: false
  end

  add_index "work_order_hazards", ["hazard_id"], name: "fk_work_order_hazards_hazard_id", using: :btree
  add_index "work_order_hazards", ["work_order_id"], name: "fk_work_order_hazards_work_id", using: :btree

  create_table "work_order_location_object_refs", force: true do |t|
    t.integer "work_order_id",     null: false
    t.integer "loc_ref_object_id", null: false
  end

  add_index "work_order_location_object_refs", ["loc_ref_object_id"], name: "fk_work_order_location_object_refs_locref_objid", using: :btree
  add_index "work_order_location_object_refs", ["work_order_id"], name: "fk_work_order_location_object_refs_work_id", using: :btree

  create_table "work_order_names", force: true do |t|
    t.string  "name",          limit: 20, null: false
    t.integer "name_type_id"
    t.integer "work_order_id",            null: false
  end

  add_index "work_order_names", ["name_type_id"], name: "fk_work_order_names_name_type_id", using: :btree
  add_index "work_order_names", ["work_order_id"], name: "fk_work_order_names_work_order_id", using: :btree

  create_table "work_order_schedule", force: true do |t|
    t.integer "work_order_id",    null: false
    t.integer "time_schedule_id", null: false
  end

  add_index "work_order_schedule", ["time_schedule_id"], name: "fk_work_order_schedule_time_schedule_id", using: :btree
  add_index "work_order_schedule", ["work_order_id"], name: "fk_work_order_schedule_work_order_id", using: :btree

  create_table "work_order_work_tasks", force: true do |t|
    t.integer "work_order_id", null: false
    t.integer "work_task_id",  null: false
  end

  add_index "work_order_work_tasks", ["work_order_id"], name: "fk_work_order_work_tasks_order_id", using: :btree
  add_index "work_order_work_tasks", ["work_task_id"], name: "fk_work_order_work_tasks_task_id", using: :btree

  create_table "work_position_points", force: true do |t|
    t.integer "work_order_id", null: false
    t.integer "sequence_num"
    t.integer "xposition"
    t.integer "yposition"
    t.integer "zposition"
  end

  add_index "work_position_points", ["work_order_id"], name: "fk_work_position_points_work_id", using: :btree

  create_table "work_task", force: true do |t|
    t.string    "mRID",         limit: 20,   null: false
    t.string    "instructions", limit: 1024
    t.string    "subject",      limit: 20,   null: false
    t.timestamp "crew_eta"
    t.string    "task_type",    limit: 12
    t.integer   "old_asset_id"
  end

  add_index "work_task", ["old_asset_id"], name: "fk_work_task_old_asset_id", using: :btree

  create_table "work_task_assets", force: true do |t|
    t.integer   "work_task_id",            null: false
    t.integer   "asset_id",                null: false
    t.timestamp "created_at",              null: false
    t.string    "created_by",   limit: 20
  end

  add_index "work_task_assets", ["asset_id"], name: "fk_work_task_asset_id", using: :btree
  add_index "work_task_assets", ["work_task_id"], name: "fk_work_task_assets_work_id", using: :btree

  create_table "work_task_crews", force: true do |t|
    t.integer "work_task_id", null: false
    t.integer "crew_id",      null: false
  end

  add_index "work_task_crews", ["crew_id"], name: "fk_work_task_crews_crew_id", using: :btree
  add_index "work_task_crews", ["work_task_id"], name: "fk_work_task_crews_work_id", using: :btree

  create_table "work_task_material_items", force: true do |t|
    t.integer "work_task_id",     null: false
    t.integer "material_item_id", null: false
  end

  add_index "work_task_material_items", ["material_item_id"], name: "fk_work_task_material_items_mat_id", using: :btree
  add_index "work_task_material_items", ["work_task_id"], name: "fk_work_task_material_items_work_id", using: :btree

  create_table "work_task_names", force: true do |t|
    t.string  "name",         limit: 20, null: false
    t.integer "work_task_id",            null: false
    t.integer "name_type_id"
  end

  add_index "work_task_names", ["name_type_id"], name: "fk_work_task_names_name_type_id", using: :btree
  add_index "work_task_names", ["work_task_id"], name: "fk_work_task_names_work_id", using: :btree

  create_table "work_task_time_schedules", force: true do |t|
    t.integer "work_task_id",     null: false
    t.integer "time_schedule_id", null: false
  end

  add_index "work_task_time_schedules", ["time_schedule_id"], name: "fk_work_task_time_schedules_time_id", using: :btree
  add_index "work_task_time_schedules", ["work_task_id"], name: "fk_work_task_time_schedule_work_id", using: :btree

  create_table "maintorder", force: true do |t|
    t.string  "mRID",         limit: 512, null: false
    t.string  "status",         limit: 512, null: false
    t.timestamp "created_at",                          null: false
    t.string  "created_by",         limit: 512, null: false
    t.integer "maintorder_id",            null: false
    t.integer "name_type_id"
  end

  create_table "maintorder_names", force: true do |t|
    t.string  "name",         limit: 512, null: false
    t.integer "maintorder_id",            null: false
    t.integer "name_type_id"
  end

  add_index "maintorder_names", ["name_type_id"], name: "fk_maintorder_names_name_type_id", using: :btree
  add_index "maintorder_names", ["maintorder_id"], name: "fk_maintorder_names_maint_id", using: :btree

end
