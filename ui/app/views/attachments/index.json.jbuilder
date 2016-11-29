json.array!(@attachments) do |attachment|
  json.extract! attachment, :id, :type, :filename
  json.url attachment_url(attachment, format: :json)
end
