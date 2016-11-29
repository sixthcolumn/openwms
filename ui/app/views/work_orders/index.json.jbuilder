json.array!(@work_orders) do |work_order|
  json.extract! work_order, :id, :work_order_name, :created_by, :mRid, :kind, :request_datetime, :updated_by, :status, :status_kind, :priority_justification, :priority_rank, :priority_type, :comments, :description, :title, :request_contact_id, :address_id, :primary_object_ref_id, :grid_location, :location_comment, :location_contact_id, :gps_latitude, :gps_longitude, :gps_altitude, :internal_building_name, :internal_building_num, :internal_floor, :internal_room_num
  json.url work_order_url(work_order, format: :json)
end
