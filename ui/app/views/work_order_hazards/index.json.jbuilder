json.array!(@work_order_hazards) do |work_order_hazard|
  json.extract! work_order_hazard, :id, :work_order_id, :hazard_id
  json.url work_order_hazard_url(work_order_hazard, format: :json)
end
