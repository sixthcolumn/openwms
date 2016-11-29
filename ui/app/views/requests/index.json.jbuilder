json.array!(@requests) do |request|
  json.extract! request, :id, :data, :create_date, :request, :result
  json.url request_url(request, format: :json)
end
