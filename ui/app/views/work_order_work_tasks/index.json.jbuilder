json.array!(@work_order_work_tasks) do |work_order_work_task|
  json.extract! work_order_work_task, :id, :work_order_id, :work_task_id
  json.url work_order_work_task_url(work_order_work_task, format: :json)
end
