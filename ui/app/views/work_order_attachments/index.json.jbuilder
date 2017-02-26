json.array!(@work_order_attachments) do |work_order_attachment|
  json.extract! work_order_attachment, :id, :work_order_id, :attachment_id
  json.url work_order_attachment_url(work_order_attachment, format: :json)
end
