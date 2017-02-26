json.array!(@work_task_names) do |work_task_name|
  json.extract! work_task_name, :id, :name, :work_task_id, :name_type_id
  json.url work_task_name_url(work_task_name, format: :json)
end
