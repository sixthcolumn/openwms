json.array!(@work_task_crews) do |work_task_crew|
  json.extract! work_task_crew, :id, :work_task_id, :crew_id
  json.url work_task_crew_url(work_task_crew, format: :json)
end
