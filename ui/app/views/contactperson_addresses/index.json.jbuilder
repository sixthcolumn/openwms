json.array!(@contactperson_addresses) do |contactperson_address|
  json.extract! contactperson_address, :id, :contactperson_id, :address_id, :address_type, :priority_order
  json.url contactperson_address_url(contactperson_address, format: :json)
end
