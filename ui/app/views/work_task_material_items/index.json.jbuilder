json.array!(@work_task_material_items) do |work_task_material_item|
  json.extract! work_task_material_item, :id, :work_task_id, :material_item_id
  json.url work_task_material_item_url(work_task_material_item, format: :json)
end
