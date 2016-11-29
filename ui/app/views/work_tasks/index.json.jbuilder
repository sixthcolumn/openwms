json.array!(@work_tasks) do |work_task|
  json.extract! work_task, :id, :mRID, :instructions, :subject, :crew_eta, :task_type, :old_asset_id
  json.url work_task_url(work_task, format: :json)
end
