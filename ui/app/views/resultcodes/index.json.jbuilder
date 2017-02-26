json.array!(@resultcodes) do |resultcode|
  json.extract! resultcode, :id, :name
  json.url resultcode_url(resultcode, format: :json)
end
