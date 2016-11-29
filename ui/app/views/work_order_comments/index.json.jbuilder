json.array!(@work_order_comments) do |work_order_comment|
  json.extract! work_order_comment, :id, :work_order_id, :comment_id
  json.url work_order_comment_url(work_order_comment, format: :json)
end
