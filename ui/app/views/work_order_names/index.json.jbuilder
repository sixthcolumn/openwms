json.array!(@work_order_names) do |work_order_name|
  json.extract! work_order_name, :id, :name, :name_type_id, :work_order_id
  json.url work_order_name_url(work_order_name, format: :json)
end
