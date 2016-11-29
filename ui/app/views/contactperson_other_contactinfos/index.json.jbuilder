json.array!(@contactperson_other_contactinfos) do |contactperson_other_contactinfo|
  json.extract! contactperson_other_contactinfo, :id, :contactperson_id, :other_contactinfo_id
  json.url contactperson_other_contactinfo_url(contactperson_other_contactinfo, format: :json)
end
