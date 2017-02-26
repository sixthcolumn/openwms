json.array!(@contactpeople) do |contactperson|
  json.extract! contactperson, :id, :lastname, :firstname, :middle, :prefix, :suffix, :governmentid, :affiliation, :primary_id, :secondary_id, :objectid
  json.url contactperson_url(contactperson, format: :json)
end
