json.array!(@work_task_assets) do |work_task_asset|
  json.extract! work_task_asset, :id, :work_task_id, :asset_id, :created_by
  json.url work_task_asset_url(work_task_asset, format: :json)
end
