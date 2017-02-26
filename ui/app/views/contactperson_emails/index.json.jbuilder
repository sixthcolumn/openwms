json.array!(@contactperson_emails) do |contactperson_email|
  json.extract! contactperson_email, :id, :contactperson_id, :email_id
  json.url contactperson_email_url(contactperson_email, format: :json)
end
