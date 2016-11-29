json.array!(@work_order_location_object_refs) do |work_order_location_object_ref|
  json.extract! work_order_location_object_ref, :id, :work_order_id, :loc_ref_object_id
  json.url work_order_location_object_ref_url(work_order_location_object_ref, format: :json)
end
