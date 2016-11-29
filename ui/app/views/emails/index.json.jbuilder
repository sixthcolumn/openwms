json.array!(@emails) do |email|
  json.extract! email, :id, :email, :email_type, :priority_order
  json.url email_url(email, format: :json)
end
