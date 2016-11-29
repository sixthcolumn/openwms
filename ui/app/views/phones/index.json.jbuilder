json.array!(@phones) do |phone|
  json.extract! phone, :id, :areacode, :citycode, :countrycode, :localnumber, :extension, :phonetype, :priorityorder
  json.url phone_url(phone, format: :json)
end
