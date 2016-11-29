json.array!(@work_task_time_schedules) do |work_task_time_schedule|
  json.extract! work_task_time_schedule, :id, :work_task_id, :time_schedule_id
  json.url work_task_time_schedule_url(work_task_time_schedule, format: :json)
end
