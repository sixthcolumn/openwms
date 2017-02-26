json.array!(@work_order_schedules) do |work_order_schedule|
  json.extract! work_order_schedule, :id, :work_order_id, :time_schedule_id
  json.url work_order_schedule_url(work_order_schedule, format: :json)
end
