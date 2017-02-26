json.array!(@contactperson_phones) do |contactperson_phone|
  json.extract! contactperson_phone, :id, :contactperson_id, :phone_id
  json.url contactperson_phone_url(contactperson_phone, format: :json)
end
